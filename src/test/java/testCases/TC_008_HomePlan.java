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

import pageObjects.HomeList;
import pageObjects.LoginPage;

public class TC_008_HomePlan extends BaseClass{
	
	
	@Test
	public void homePlan() throws IOException, InterruptedException, AWTException {
		
		LoginPage lp=new LoginPage(driver);
		HomeList hl = new HomeList(driver);
		
		
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
		
		hl.ClickHomes();
		logger.info("Clicked on Plan");
		
		hl.clickhomelist();
		logger.info("Clicked on Plan");
		
		hl.clicknewplan();
		logger.info("Clicked on Newplan");
		
		hl.RangeDD();
		
		hl.DesignDD();
		
		Thread.sleep(3000);
		String planname = randomestring();
		hl.PlanName(planname);
		
		hl.clickSave();
		
try {
     		
     		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"selectordesign-error\"]")).isDisplayed();
     		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
		    if(errmsg==true || errmsg1==true) {
		    	captureScreen(driver,"Design");
				Assert.assertTrue(false);
	    	logger.info("fill the mandatory fields");
	    	
	    }
     		 
     		
     	}catch(Exception e) {
     		
     	}
		
		hl.ClickoK();
		
		logger.info("New Plan added");
		
		hl.AddElevation();

		String facadenname = randomestring();
		hl.FacadeName(facadenname);

		try {

		boolean error =  driver.findElement(By.xpath("//*[@id=\"facadename-error\"]")).isDisplayed();
		if(error==true) {
			logger.info("please check for mandatory field");
			captureScreen(driver,"Design");
			Assert.assertTrue(false);
		}

		}catch(Exception e) {

		}

		hl.FacadeADD();

		hl.FacadeOkbtn();
		logger.info("Facade added");
	
		
		hl.clickAddprodocButton();

		String Docname = randomestring();
		hl.setproDocName(Docname);


		try {
			
			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(error==true) {
				logger.info("please check for mandatory field");
				captureScreen(driver,"Design");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
		}

		hl.proDocDropdown();

		hl.clickproDUpButton();

		Thread.sleep(3000);

		uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");

		Thread.sleep(10000);

		////WebElement checkBoxElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/label[1]/div[1]"));
		////boolean isSelected = checkBoxElement.isSelected();
		////if(isSelected == true) {
////			logger.info("Already selected");
		////	
		////}else {
////			checkBoxElement.click();
		////}
		//
		//WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
		////checkBoxElement1.click();
		//boolean isSelected1 = checkBoxElement1.isSelected();
		//if(isSelected1 == false) {
//			checkBoxElement1.click();
		//}else {
//			logger.info("Already selected");
		//}


		hl.clickaddproDOC();

		try {
			
			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(error==true) {
				logger.info("please check for mandatory field");
				captureScreen(driver,"Design");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
		}

		hl.clickConfirmproDoc();
		logger.info("Doc added");
		
		hl.getPlan();
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
