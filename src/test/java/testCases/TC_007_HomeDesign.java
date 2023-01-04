package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomeDesign;
import pageObjects.LoginPage;

public class TC_007_HomeDesign extends BaseClass {
	
	@Test
	public void Design() throws IOException, InterruptedException, AWTException {
		
		LoginPage lp=new LoginPage(driver);
		HomeDesign HD = new HomeDesign(driver);
		
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("PIPELINE SALES REP"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		HD.ClickHomes();
		logger.info("Clicked on Homes");
		
		HD.ClickDesgin();
		logger.info("Clicked on Design");
		
		HD.ClicknewDesgin();
		logger.info("Clicked on NewDesign");
		
		HD.HomeBuilderDD();
		
		Thread.sleep(3000);
		String designname = randomestring();
		HD.DesignName(designname);
		
		
		
		HD.clickSave();
		
try {
     		
     		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"selectordesign-error\"]")).isDisplayed();
		    if(errmsg==true) {
		    	captureScreen(driver,"Design");
				Assert.assertTrue(false);
	    	logger.info("fill the mandatory fields");
	    	
	    }
     		 
     		
     	}catch(Exception e) {
     		
     	}
		
		HD.ClickoK();
		
		logger.info("NewDesign added");
		
HD.AddElevation();

String facadenname = randomestring();
HD.FacadeName(facadenname);

try {

boolean error =  driver.findElement(By.xpath("//*[@id=\"facadename-error\"]")).isDisplayed();
if(error==true) {
	logger.info("please check for mandatory field");
	captureScreen(driver,"Design");
	Assert.assertTrue(false);
}

}catch(Exception e) {

}

HD.FacadeADD();

HD.FacadeOkbtn();
logger.info("Facade added");

HD.clickAddprodocButton();

String Docname = randomestring();
HD.setproDocName(Docname);


try {
	
	boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
	if(error==true) {
		logger.info("please check for mandatory field");
		captureScreen(driver,"Design");
		Assert.assertTrue(false);
	}
	
}catch(Exception e) {
	
}

HD.proDocDropdown();

HD.clickproDUpButton();

Thread.sleep(3000);

uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");

Thread.sleep(10000);

////WebElement checkBoxElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/label[1]/div[1]"));
////boolean isSelected = checkBoxElement.isSelected();
////if(isSelected == true) {
////	logger.info("Already selected");
////	
////}else {
////	checkBoxElement.click();
////}
//
//WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
////checkBoxElement1.click();
//boolean isSelected1 = checkBoxElement1.isSelected();
//if(isSelected1 == false) {
//	checkBoxElement1.click();
//}else {
//	logger.info("Already selected");
//}


HD.clickaddproDOC();

try {
	
	boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
	if(error==true) {
		logger.info("please check for mandatory field");
		captureScreen(driver,"Design");
		Assert.assertTrue(false);
	}
	
}catch(Exception e) {
	
}

HD.clickConfirmproDoc();
logger.info("Doc added");

HD.getDesign();





	}
	public static void setClipboard(String File) {
		
		StringSelection obj = new StringSelection(File);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
		
	}
	public static void uploadFile(String FilePath) throws AWTException {
		
		setClipboard(FilePath);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
