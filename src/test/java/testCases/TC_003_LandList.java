package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandList;
import pageObjects.LoginPage;

public class TC_003_LandList extends BaseClass{
	
	
	@Test(priority=1)
	public void Landlist() throws IOException, InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		LandList lp2 = new LandList(driver);
		
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
		
		lp2.clickLink();
		
		lp2.clickLandListLink();
		
		//lp2.clickGo();
		
		lp2.clickNewlot();
		
		String lotname = randomestring();
		lp2.setLotName(lotname);
		
		lp2.LotProjectDropdown();
		
		lp2.LotPhaseDropdown();
		
		String price = randomeNum();
		lp2.setLotPrice(price);
		
		lp2.ClickSave();
		
		lp2.ClickOK();
		
		Thread.sleep(3000);
	}	
		
//	@Test(priority=2,dependsOnMethods="Landlist")
//		public void AddDimensions() throws InterruptedException {
//		
//		
//			LandList lp2 = new LandList(driver);
//			
//		lp2.ClickAddDimension();
//		
//		Thread.sleep(3000);
//		
//		String LotArea = randomeNum2();
//		lp2.SetLotArea(LotArea);
//		
//		Thread.sleep(3000);
//		
//		String LotWidth = randomeNum3();
//		lp2.SetLotWidth(LotWidth);
//		
//		Thread.sleep(3000);
//		
//		String LotGroup = randomeNum4();
//		lp2.SetLotGroup(LotGroup);
//		
//		Thread.sleep(3000);
//		
//		lp2.CornerLot();
//		Thread.sleep(3000);
//		lp2.RearLoaded();
//		Thread.sleep(3000);
//		lp2.SignatureLot();
//		Thread.sleep(3000);
//		
//		try {
//		     
//			lp2.ClickAdd();
//		    boolean errormsg = driver.findElement(By.xpath("//*[@id=\"dimensionvalue-error\"]")).isDisplayed();
//		    if(errormsg==true) {
//		    	logger.info("fill the mandatory fields");
//		    }else{
//		    	logger.info("Dimension added successfully");
//		    }
//		}catch(Exception e) {
//			
//		}
//		Thread.sleep(3000);
//	
//		}
//	@Test(priority=3,dependsOnMethods="Landlist")
//	public void AddBranches() {
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		
//		LandList lp2 = new LandList(driver);
//		
//		lp2.ClickAddlotbranch();
//		
//		lp2.Clickbranchdd();
//		
//		lp2.ClickAddbranch();
//		try {
//			
//			
//			boolean errormsg = driver.findElement(By.xpath("//*[@id=\"clientcompanyid-error\"]")).isDisplayed();
//			
//			if(errormsg==true) {
//				 logger.info("fill the mandatory fileds");
//				 captureScreen(driver,"AddBranches");
//					Assert.assertTrue(false);
//				 lp2.ClickCancel();
//			}
//		}catch(Exception e) {
//			
//		}
//		lp2.Clickokbranch();
//	}
//	
//	@Test(priority=4,dependsOnMethods="Landlist")
//	public void AddDate() throws InterruptedException {
//		
//		LandList lp2 = new LandList(driver);
//		
//	lp2.ClickAdddates();
//		Thread.sleep(3000);
//		lp2.selecteventtype();
//	
//		lp2.setdate("12-12-2022");
//		 try {
//			
//			 lp2.ClickonAddDate();
//			 boolean errormessage = driver.findElement(By.xpath("//*[@id=\"eventdatevalue-error\"]")).isDisplayed();
//			 if(errormessage==true) {
//				 
//				 logger.info("Dates added successsfully");
//			 }else {
//				 logger.info("Check the mandatory fields");
//			 }
//			 
//		 }catch(Exception e) {		 
//		 }
//	}	
//	
//	@Test(priority=5,dependsOnMethods="Landlist")
//	public void AddDoc() throws InterruptedException, AWTException {
//		
//    LandList lp2 = new LandList(driver);
//
//	lp2.clickAddprodocButton();
//
//	String docName = randomestring();
//	lp2.setproDocName(docName);
//	
//	
//	try {
//		
//		boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//		if(error==true) {
//			logger.info("please check for mandatory field");
//			captureScreen(driver,"AddDoc");
//			Assert.assertTrue(false);
//		}
//		
//	}catch(Exception e) {
//		
//	}
//	lp2.proDocDropdown();
//	lp2.clickproDUpButton();
//	
//	 Thread.sleep(3000);
//		
//		uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");
//		
//		Thread.sleep(10000);
//		
//	try {
//		
//			boolean loadbutton = driver.findElement(By.xpath("//*[@id=\"assetdropzonePreview\"]/div/div[3]")).isDisplayed();
//			
//			if(loadbutton!=true) {
//				
//				logger.info("click on Add button");
//			}
//		}catch(Exception e) {
//			
//		}
//	
//	WebElement PDcheckbox1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
//	boolean isSelected3 = PDcheckbox1.isSelected();
//	if(isSelected3 == false) {
//		PDcheckbox1.click();
//	}else {
//		logger.info("Already selected");
//	}
//	
//	
//	lp2.clickaddproDOC();
//	
//	try {
//		boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"assetImageUrl-error\"]")).isDisplayed();
//		if(proerrmsg3==true) {
//			
//			captureScreen(driver,"addAttachement");
//			Assert.assertTrue(false);
//			logger.info("Check the mandatory fields");
//		}
//		}catch(Exception e) {
//			
//		}
//	
//	Thread.sleep(2000);
//	
//	lp2.clickConfirmproDoc();
//	logger.info("Document added successfully for Phase");
//	
//}
//	
		@Test(priority=6,dependsOnMethods="Landlist") 
		public void addimage() throws InterruptedException, AWTException{
			
			LandList lp2 = new LandList(driver);
			
			lp2.clickAddproimageButton();
			
		String Docname = randomestring();
			lp2.setproImageName(Docname);
			
			
			try {
				
				boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
				if(error==true) {
					logger.info("please check for mandatory field");
					captureScreen(driver,"addimage");
					Assert.assertTrue(false);
				}
				
			}catch(Exception e) {
				
			}
			
			lp2.proimageDropdown();
			
			lp2.clickproUpButton();
			
			Thread.sleep(3000);
			
			uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\images.jpg");
			
			Thread.sleep(10000);
			
//			WebElement checkBoxElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/label[1]/div[1]"));
//			boolean isSelected = checkBoxElement.isSelected();
//			if(isSelected == true) {
//				logger.info("Already selected");
//				
//			}else {
//				checkBoxElement.click();
//			}
			
			WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
			//checkBoxElement1.click();
			boolean isSelected1 = checkBoxElement1.isSelected();
			if(isSelected1 == false) {
				checkBoxElement1.click();
			}else {
				logger.info("Already selected");
			}
			
			lp2.clickaddproImage();
			try {
				
				boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
				if(error==true) {
					logger.info("please check for mandatory field");
					Assert.assertTrue(false);
				}
				
			}catch(Exception e) {
				
			}
			
			lp2.clickConfirmproImage();
			logger.info("Image added successfully");
		}
		
	
	@Test(priority=7,dependsOnMethods="Landlist")
     public void Addvideo() {
		
		LandList lp2 = new LandList(driver);
		
		lp2.clickproAddvideoButton();
		
		String videoNme = randomestring();
		lp2.setproVideoName(videoNme);
		
		try {
			
			boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(error==true) {
				logger.info("please check for mandatory field");
				captureScreen(driver,"Addvideo");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
		}
		
		lp2.provideoDropdown();
		
		lp2.clickproVUpButton("https://www.youtube.com/watch?v=rHeoPN-enCI");
		
		WebElement checkBoxElement1 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/label[1]/div[1]"));
		//checkBoxElement1.click();
		boolean isSelected1 = checkBoxElement1.isSelected();
		if(isSelected1 == false) {
			checkBoxElement1.click();
		}else {
			logger.info("Already selected");
		}
		
		lp2.clickproaddVideo();
		try {
		
		boolean error =  driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
		if(error==true) {
			logger.info("please check for mandatory field");
			captureScreen(driver,"Addvideo");
			Assert.assertTrue(false);
		}
		
	}catch(Exception e) {
		
	}
		
		lp2.clickproConfirmVideo();
		logger.info("video added successfully");
	
	}
//		 
//	@Test(priority=8,dependsOnMethods="Landlist")
//	public void AddDrip() throws InterruptedException {
//		
//		LandList lp2 = new LandList(driver);
//		
//		lp2.clickAddprodripButton();
//		
//		String dripname = randomestring();
//		lp2.setproDripName(dripname);
//		
//try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"dripname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"AddDrip");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//
//lp2.prodripDropdown();
//
//Thread.sleep(3000);
////lp2.clickproDrUpButton();
//lp2.setproDrValue("1000");
//
//Thread.sleep(3000);
//		lp2.clickaddproDrip();
//		
//		try {
//			
//			boolean error =  driver.findElement(By.xpath("//*[@id=\"dripname-error\"]")).isDisplayed();
//			if(error==true) {
//				logger.info("please check for mandatory field");
//				captureScreen(driver,"AddDrip");
//				Assert.assertTrue(false);
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		Thread.sleep(3000);
//		lp2.clickConfirmproDrip();
//		
//	}
	
	@Test(priority=9,dependsOnMethods="Landlist")
	public void Deactivate() throws InterruptedException, IOException {
		
		LandList lp2 = new LandList(driver);
		
		lp2.searchanddeactivate();
		
	lp2.dectivate();
	
	boolean norecords = driver.findElement(By.xpath("//*[@id=\"landlisttablebody\"]/tr/td")).isDisplayed();
	if(norecords==true) {
		
		logger.info("Lot deactivated successfully");
		
	
	}else {
		logger.info("lot deactivation fail");
		captureScreen(driver,"deactvatelandist");
		Assert.assertTrue(false);
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

