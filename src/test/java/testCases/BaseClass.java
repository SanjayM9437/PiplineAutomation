package testCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.netty.util.internal.ThreadLocalRandom;
import utilities.ReadConfig;

public class BaseClass {
	
ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		logger = Logger.getLogger("Pipeline");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait (driver,10);
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(6);
        return (generatedString2);
		
		
}
	
	public static String randomeNum8() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
        return (generatedString2);
		
		
}
	
	public static String randomeemail() {
		String generatedString2 = RandomStringUtils.randomNumeric(6);
        return (generatedString2);
		
		
}
	public static String randomeNum2() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		int GenNumber = Integer.valueOf(generatedString2);
		if(GenNumber >= 1000 && GenNumber <=3500) return (String.valueOf(GenNumber));
		else return String.valueOf(1200);
		
		
	}

        
	public static String randomeNum3() {
		String generatedString2 = RandomStringUtils.randomNumeric(2);
		int GenNumber = Integer.valueOf(generatedString2);
		if(GenNumber >= 40 && GenNumber <=140) return (String.valueOf(GenNumber));
		else return String.valueOf(60);
	
	}
	public static String randomeNum4() {
		String generatedString2 = RandomStringUtils.randomNumeric(2);
		int GenNumber = Integer.valueOf(generatedString2);
		int GenNumber2 = Integer.valueOf(generatedString2);
		if(GenNumber >= 40 && GenNumber <=140) return (String.valueOf(GenNumber2+20));
		else return String.valueOf(70);		
	
	}	
	
	public static LocalDate date() {
	    int oneyear = 1* 365;
	    return LocalDate.ofEpochDay(ThreadLocalRandom
	      .current().nextInt(-oneyear, oneyear));
	}
}
	

	


