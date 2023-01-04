package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homes;
import pageObjects.LandList;
import pageObjects.LoginPage;

public class TC_006_HomesRanges extends BaseClass{
	
	@Test
	public void Ranges() throws IOException, InterruptedException, AWTException
	{
		
		LoginPage lp=new LoginPage(driver);
		Homes h = new Homes(driver);
		
		
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
		
		h.clickHomes();
		logger.info("Clicked on Homes");
		
		h.clickRanges();
		logger.info("Clicked on Ranges");
		
		h.clickNewRanges();
		logger.info("Clicked on NewRanges");
		
		
		String rangename = randomestring();
		h.setrangeName(rangename);
		
		h.HomeBuilderDD();
		
     	h.HomeBranchDD();
     	
     	h.clickSave();
     	try {
     		
     		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"selectorrange-error\"]")).isDisplayed();
		    if(errmsg==true) {
		    	captureScreen(driver,"Ranges");
				Assert.assertTrue(false);
	    	logger.info("fill the mandatory fields");
	    	
	    }
     		 
     		
     	}catch(Exception e) {
     		
     	}
     	
     	h.clickOK();
     logger.info("Range added successfully");
     	
//     	h.clickEdit();
     	
//     	h.ClickAddlotbranch();
//     	
//     	h.Clickbranchdd();
//     	
//     	h.ClickAddbranch();
//     	
//		try {
//		
//		
//		boolean errormsg = driver.findElement(By.xpath("//*[@id=\"salesrepid-error\"]")).isDisplayed();
//		
//		if(errormsg==true) {
//			 logger.info("fill the mandatory fileds");
//			 captureScreen(driver,"Ranges");
//				Assert.assertTrue(false);
//			 h.ClickCancel();
//		}
//	}catch(Exception e) {
//		
//	}
//     	
//     	h.Clickokbranch();
//     	
//     	h.clickAddproimageButton();
//     	
//	String Docname = randomestring();
//		h.setproImageName(Docname);
//		
//		
//		try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"Ranges");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		h.proimageDropdown();
//		
//		h.clickproUpButton();
//		
//		Thread.sleep(3000);
//		
//		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\images.jpg");
//		
//		Thread.sleep(10000);
//		
//////		WebElement checkBoxElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/label[1]/div[1]"));
//////		boolean isSelected = checkBoxElement.isSelected();
//////		if(isSelected == true) {
//////			logger.info("Already selected");
//////			
//////		}else {
//////			checkBoxElement.click();
//////		}
////		
////		WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
////		//checkBoxElement1.click();
////		boolean isSelected1 = checkBoxElement1.isSelected();
////		if(isSelected1 == false) {
////			checkBoxElement1.click();
////		}else {
////			logger.info("Already selected");
////		}
//		
//		
//		h.clickaddproImage();
//		
//		try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"Ranges");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		h.clickConfirmproImage();
//		logger.info("Image added successfully");
//		
//		h.clickAddprodripButton();
//		
//		String dripname = randomestring();
//		h.setproDripName(dripname);
//		
//try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"dripname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"Ranges");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//
//     h.prodripDropdown();
//
//     Thread.sleep(3000);
//   //h.clickproDrUpButton();
////    h.setproDrValue("1000");
//
//Thread.sleep(3000);
//		h.clickaddproDrip();
//		
//		try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"dripname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"Ranges");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		Thread.sleep(3000);
//		h.clickConfirmproDrip();
//		
//		logger.info("Drip added successfully");
//		
//		
//		h.clickAddprodocButton();
//		
//			String docName = randomestring();
//			h.setproDocName(docName);
//			
//			
//			try {
//				
//				boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//				if(error==true) {
//					logger.info("please check for mandatory field");
//					captureScreen(driver,"Ranges");
//					Assert.assertTrue(false);
//				}
//				
//			}catch(Exception e) {
//				
//			}
//			h.proDocDropdown();
//			h.clickproDUpButton();
//			
//			 Thread.sleep(3000);
//				
//				uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");
//				
//				Thread.sleep(10000);
//				
//			try {
//				
//					boolean loadbutton = driver.findElement(By.xpath("//*[@id=\"assetdropzonePreview\"]/div/div[3]")).isDisplayed();
//					
//					if(loadbutton!=true) {
//						
//						logger.info("click on Add button");
//					}
//				}catch(Exception e) {
//					
//				}
//			
////			WebElement PDcheckbox1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
////			boolean isSelected3 = PDcheckbox1.isSelected();
////			if(isSelected3 == false) {
////				PDcheckbox1.click();
////			}else {
////				logger.info("Already selected");
////			}
//			
//			
//			h.clickaddproDOC();
//			
//			try {
//				boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"assetImageUrl-error\"]")).isDisplayed();
//				if(proerrmsg3==true) {
//					
//					captureScreen(driver,"Ranges");
//					Assert.assertTrue(false);
//					logger.info("Check the mandatory fields");
//				}
//				}catch(Exception e) {
//					
//				}
//		
//		Thread.sleep(2000);
//
//	h.clickConfirmproDoc();
//	
//	
// 	h.clickAddgalButton();
// 	
//String galname = randomestring();
//	h.setgalName(galname);
//	
//	
//	try {
//		
//		boolean error =  driver.findElement(By.xpath("//*[@id=\"galleryname-error\"]")).isDisplayed();
//		if(error==true) {
//			logger.info("please check for mandatory field");
//			captureScreen(driver,"Ranges");
//			Assert.assertTrue(false);
//		}
//		
//	}catch(Exception e) {
//		
//	}
//	
//	WebElement checkBoxElement1 = driver.findElement(By.xpath("//*[@id=\"ca-range-gallery-add-edit-form\"]/table/tbody/tr[3]/td[2]/label/div"));
//	//checkBoxElement1.click();
//	boolean isSelected1 = checkBoxElement1.isSelected();
//	if(isSelected1 == false) {
//		checkBoxElement1.click();
//	}else {
//		logger.info("Already selected");
//	}
//	
//	
//	h.clickaddgal();
//	
//	try {
//		
//		boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//		if(error==true) {
//			logger.info("please check for mandatory field");
//			captureScreen(driver,"Ranges");
//			Assert.assertTrue(false);
//		}
//		
//	}catch(Exception e) {
//		
//	}
//	
//	h.clickConfirmgal();
//	logger.info("gallery added successfully");
	
	
//	h.EditRange();
//	
////	String rangeName1 = randomestring();
////	h.setnewrangeName(rangeName1);
//	
//	h.HomenewBuilderDD();
//	
// 	h.HomenewBranchDD();
// 	
// 	h.clicknewSave();
// 	try {
// 		
// 		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"selectorrange-error\"]")).isDisplayed();
//	    if(errmsg==true) {
//	    	captureScreen(driver,"Ranges");
//			Assert.assertTrue(false);
//    	logger.info("fill the mandatory fields");
//    	
//	    }
// 		 
//	}catch(Exception e) {
// 		
// 	}
// 	
// 	h.clicknewOK();
//		
	
	
	h.getRange();
	h.deactivate();
	boolean Ok = driver.findElement(By.xpath("/html/body/div[11]/h2")).isDisplayed();
	if(Ok==true) {
		logger.info("range deactivated sucessfully");
		driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button")).click();
	}else {
		
		logger.info("range deactivation failed");
	}
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


