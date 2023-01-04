package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandList;
import pageObjects.LoginPage;
import pageObjects.createpackage;

public class TC_005_CreatePackage extends BaseClass{

	
	@Test
	public void CreatePackage() throws IOException, InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
	
		
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
		
		createpackage cp = new createpackage(driver);
		
		cp.clickLink();
		
		cp.clickcreatepackage();
		
		cp.prodropdown();
		
		cp.phasedropdown();
		
		cp.lotdropdown();
		
		cp.plandropdown();
		
//		cp.clickdownarrow();
		
		cp.elevationdropdown();
		
          cp.clickCP();	
          
          Thread.sleep(3000);
          cp.clickOK();
          
       
		
          cp.selectpackage();
          
        
//          cp.editpackage();
          
	}
	
	@Test(priority=3,dependsOnMethods="CreatePackage")
	public void AddDoc() throws InterruptedException, AWTException {
		
		createpackage cp = new createpackage(driver);
		
	

		cp.clickAddprodocButton();

	String docName = randomestring();
	cp.setproDocName(docName);
	
	
	try {
		
		boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
		if(error==true) {
			logger.info("please check for mandatory field");
			captureScreen(driver,"addAttachement");
			Assert.assertTrue(false);
		}
		
	}catch(Exception e) {
		
	}
	cp.proDocDropdown();
	cp.clickproDUpButton();
	
	 Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");
		
		Thread.sleep(10000);
		
	try {
		
			boolean loadbutton = driver.findElement(By.xpath("//*[@id=\"assetdropzonePreview\"]/div/div[3]")).isDisplayed();
			
			if(loadbutton!=true) {
				
				logger.info("click on Add button");
			}
		}catch(Exception e) {
			
		}
	
//	WebElement PDcheckbox1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
//	boolean isSelected3 = PDcheckbox1.isSelected();
//	if(isSelected3 == false) {
//		PDcheckbox1.click();
//	}else {
//		logger.info("Already selected");
//	}
	
	
	cp.clickaddproDOC();
	
	try {
		boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"assetImageUrl-error\"]")).isDisplayed();
		if(proerrmsg3==true) {
			
			captureScreen(driver,"addAttachement");
			Assert.assertTrue(false);
			logger.info("Check the mandatory fields");
		}
		}catch(Exception e) {
			
		}
	
	Thread.sleep(2000);
	
	cp.clickConfirmproDoc();
	logger.info("Document added successfully for package");
	
}
	
	@Test(priority=2,dependsOnMethods="CreatePackage") 
	public void addimage() throws InterruptedException, AWTException{
		
		createpackage cp = new createpackage(driver);
		
		cp.clickAddproimageButton();
		
	String IMGname = randomestring();
	cp.setproImageName(IMGname);
		
		
		try {
			
			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(error==true) {
				logger.info("please check for mandatory field");
				captureScreen(driver,"addAttachement");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
		}
		
		cp.proimageDropdown();
		
		cp.clickproUpButton();
		
		Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\images.jpg");
		
		Thread.sleep(10000);
		
//		WebElement checkBoxElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/label[1]/div[1]"));
//		boolean isSelected = checkBoxElement.isSelected();
//		if(isSelected == true) {
//			logger.info("Already selected");
//			
//		}else {
//			checkBoxElement.click();
//		}
		
//		WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
//		//checkBoxElement1.click();
//		boolean isSelected1 = checkBoxElement1.isSelected();
//		if(isSelected1 == false) {
//			checkBoxElement1.click();
//		}else {
//			logger.info("Already selected");
//		}
		
		cp.clickaddproImage();
		try {
			
			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(error==true) {
				logger.info("please check for mandatory field");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
		}
		
		cp.clickConfirmproImage();
		logger.info("Image added successfully");
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
