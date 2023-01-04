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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LandPage;
import pageObjects.LoginPage;

public class TC_002_Land extends BaseClass{

	private static final String dependsOnMethods = null;
	
	@Test(priority=1)
	public void landTest() throws IOException, AWTException, InterruptedException 
	{
		LandPage lp1=new LandPage(driver);
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
		
		lp1.clickLink();
		logger.info("Clicked on land");
		
		lp1.clickProjectsLink();
		logger.info("Clicked on Projects link");
		
		lp1.clickNewProjectsLink();
		logger.info("Clicked on New Projects link");
		
		String estateName = randomestring();
		lp1.setestateName(estateName);
		
		lp1.branchDropdown();
		
		lp1.clickSavebtn();
		
		  try {
	    		
	    		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"selectorestate-error\"]")).isDisplayed();
//	    		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
			    if(errmsg==true) {
			    	logger.info("fill the mandatory fields");
			    	captureScreen(driver,"landTest");
					Assert.assertTrue(false);
		    	
		    	
		    }
		  }catch(Exception e) {
		    	
		    }
		
		lp1.clickConfirmbtn();
		
		
		lp1.clickAddPhase();
		
		String phaseName = randomestring();
		lp1.setPhaseName(phaseName);
		
		lp1.clickPhaseSavebtn();
		
        lp1.clickPhaseConfirmbtn();
		logger.info("Phase name added successfully");
		
		Thread.sleep(3000);
		
		lp1.clickAddimageButton();
		logger.info("clicked on image add button");
		
		String imageName = randomestring();
		lp1.setImageName(imageName);
		
		try {
		boolean errmsg1 = driver.findElement(By.id("assetname-error")).isDisplayed();
		if(errmsg1==true) {
			
			logger.info("Enter or check the Image Name");
		}
		}catch(Exception e) {
			logger.info("Enter Img Name is correct");
		}
		
		lp1.imageDropdown();
		lp1.clickUpButton();
		
		Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\download.jpg");
		
		Thread.sleep(10000);
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!checkbox.isSelected()) {
			checkbox.click();
		}else {
			logger.info("Already selected");
		}
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}else {
			logger.info("Already selected");
		}
		
		lp1.clickaddImage();
		
		lp1.clickConfirmImage();
		logger.info("Image added successfully");
		
		//Video Adding Script================================================================================================================================================================
		
		Thread.sleep(3000);
		
		lp1.clickAddvideoButton();
		
		String videoName = randomestring();
		lp1.setVideoName(videoName);
		
		
		try {
			boolean errmsg2 = driver.findElement(By.id("assetname-error")).isDisplayed();
			if(errmsg2==true) {
				
				logger.info("Enter or check the Videoe Name");
			}
			}catch(Exception e) {
				logger.info("Enter Video Name is correct");
			}
		
		lp1.videoDropdown();
		lp1.clickVUpButton("https://preprod-pipeline.runwayproptech.com/runway/rep/pipelinestagedetail/1222802518863031618430232663058648001665724471126");
		
		WebElement Vcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Vcheckbox.isSelected()) {
			Vcheckbox.click();
		}else {
			logger.info("Already selected");
		}
		
		WebElement Vcheckbox1 = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Vcheckbox1.isSelected()) {
			Vcheckbox1.click();
		}else {
			logger.info("Already selected");
		}
		
		lp1.clickaddVideo();
		Thread.sleep(3000);
		
		lp1.clickConfirmVideo();
		logger.info("Video added successfully for Phase");
		
		//Document script=======================================================================================================================================================================
		
		Thread.sleep(3000);
		
		lp1.clickAdddocButton();
		
		String docName = randomestring();
		lp1.setDocName(docName);
		
		
		try {
			boolean errmsg3 = driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(errmsg3==true) {
				
				logger.info("Enter or check the Doc Name");
			}
			}catch(Exception e) {
				logger.info("Enter Doc Name is correct");
			}
		
		lp1.DocDropdown();
		lp1.clickDUpButton();
		
        Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\Evoke Brochure.pdf");
		
		Thread.sleep(10000);
		
		WebElement Dcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Dcheckbox.isSelected()) {
			Dcheckbox.click();
		}else {
			logger.info("Already selected");
		}
		
		WebElement Dcheckbox1 = driver.findElement(By.xpath("//*[@id=\"ca-stage-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Dcheckbox1.isSelected()) {
			Dcheckbox1.click();
		}else {
			logger.info("Already selected");
		}
		
		Thread.sleep(5000);
		
		lp1.clickaddDOC();
		
		Thread.sleep(5000);
		
		lp1.clickConfirmDoc();
		logger.info("Document added successfully for Phase");
		
		//Drip================================================================================================================================================================================
		
		Thread.sleep(3000);
		
		lp1.clickAdddripButton();
		
		String dripName = randomestring();
		lp1.setDripName(dripName);
		
		
		try {
			boolean errmsg4 = driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(errmsg4==true) {
				
				logger.info("Enter or check the Drip Name");
			}
			}catch(Exception e) {
				logger.info("Enter Drip Name is correct");
			}
		
		lp1.dripDropdown();
		lp1.clickDrUpButton();
		
        Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\images.jpg");
		
		Thread.sleep(3000);
		
		WebElement Drcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-estate-drip-add-edit-form\"]/table/tbody/tr[8]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Drcheckbox.isSelected()) {
			Drcheckbox.click();
		}else {
			logger.info("Already selected");
		}
		
		
		lp1.setDrValue("1000");
		
		Thread.sleep(5000);
		
		lp1.clickaddDrip();
		
		Thread.sleep(5000);
		
		lp1.clickConfirmDrip();
		logger.info("Drip added successfully for Phase");
		
		logger.info("Phase added successfuly");
		//Back to project=================================================================================================================================================================
		
		lp1.clickProjectName();
		
		Thread.sleep(3000);
//		
////Sales Rep=====================================================================================================================================================================================
		
		lp1.newsalesrep();
		
		Thread.sleep(3000);
		
		lp1.salesrepDropdown();
		
		lp1.addsalesrep();
		
		try {
		boolean errmsg2 = driver.findElement(By.xpath("//*[@id=\"salesrepid-error\"]")).isDisplayed();
		if(errmsg2==true) {
			
			logger.info("Check the mandatory data");
		}else {
			logger.info("sales rep selected");
		}
		}catch(Exception e) {
			
		}
		
		lp1.confirmsalesrep();
		
		logger.info("Sales rep added successfully");
		
//Project Branches===============================================================================================================================================================================
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
lp1.newproBranch();
		
		Thread.sleep(3000);
		
		lp1.proBranchDropdown();
		
		lp1.addproBranch();
		
		try {
		boolean errmsg3 = driver.findElement(By.xpath("//*[@id=\"clientcompanyid-error\"]")).isDisplayed();
		if(errmsg3==true) {
			
			logger.info("Check the mandatory data");
		}else {
			logger.info("Project Branch selected");
		}
		}catch(Exception e) {
			
		}
		
		lp1.confirmprobranch();
		
		logger.info("Project branch added successfully");
		

		
	}
	
	@Test(priority=2,dependsOnMethods="landTest")
	public void AddProImage() throws InterruptedException, AWTException {
		
		LandPage lp1=new LandPage(driver);
		
		Thread.sleep(3000);
		
		lp1.clickAddproimageButton();
		logger.info("clicked on image add button");
		
		String proimageName = randomestring();
		lp1.setproImageName(proimageName);
		
		try {
		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
		if(errmsg==true) {
			
			logger.info("Enter or check the pro Image Name");
		}
		}catch(Exception e) {
			logger.info("Enter pro Img Name is correct");
		}
		
		lp1.proimageDropdown();
		lp1.clickproUpButton();
		
		Thread.sleep(3000);
		
		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\download.jpg");
		
		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!checkbox.isSelected()) {
			checkbox.click();
		}else {
			logger.info("Already selected");
		}
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}else {
			logger.info("Already selected");
		}
		
		lp1.clickaddproImage();
		
		try {
			boolean errmsg3 = driver.findElement(By.xpath("//*[@id=\"assetImageUrl-error\"]")).isDisplayed();
			if(errmsg3==true) {
				
				logger.info("Check the mandatory fields");
			}else {
				logger.info("Project image  selected");
			}
			}catch(Exception e) {
				
			}
		
		lp1.clickConfirmproImage();
		logger.info(" Pro Image added successfully");
		
	}
//	
	@Test(priority=3,dependsOnMethods="landTest")
	public void AddProVideo() throws InterruptedException {
		
		LandPage lp1=new LandPage(driver);
		
		Thread.sleep(3000);
		
		lp1.clickproAddvideoButton();
		
		String provideoName = randomestring();
		lp1.setproVideoName(provideoName);
		
		
		try {
			boolean errmsg = driver.findElement(By.id("assetname-error")).isDisplayed();
			if(errmsg==true) {
				
				logger.info("Enter or check the Videoe Name");
			}
			}catch(Exception e) {
				logger.info("Enter Video Name is correct");
			}
		
		lp1.provideoDropdown();
		lp1.clickproVUpButton("https://preprod-pipeline.runwayproptech.com/runway/rep/pipelinestagedetail/1222802518863031618430232663058648001665724471126");
		
		WebElement proVcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!proVcheckbox.isSelected()) {
			proVcheckbox.click();
		}else {
			logger.info("Already selected");
		}
		
		WebElement proVcheckbox1 = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!proVcheckbox1.isSelected()) {
			proVcheckbox1.click();
		}else {
			logger.info("Already selected");
		}
		
		lp1.clickproaddVideo();
		
		try {
			boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"assetVideoUrl-error\"]")).isDisplayed();
			if(proerrmsg3==true) {
				
				logger.info("Check the mandatory fields");
			}else {
				logger.info("Project image  selected");
			}
			}catch(Exception e) {
				
			}
		
		
		Thread.sleep(3000);
		
		lp1.clickproConfirmVideo();
		logger.info("Project Video added successfully");
		
	}
//	
//	@Test(priority=4,dependsOnMethods="landTest")
//	public void AddProDoc() throws InterruptedException, AWTException {
//		
//		LandPage lp1=new LandPage(driver);
//		
//		Thread.sleep(3000);
//		
//		lp1.clickAddprodocButton();
//		
//		String prodocName = randomestring();
//		lp1.setproDocName(prodocName);
//		
//		
//		try {
//			boolean prodocerrmsg = driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
//			if(prodocerrmsg==true) {
//				
//				logger.info("Enter or check the Project Doc Name");
//			}
//			}catch(Exception e) {
//				logger.info("Enter Project Doc Name is correct");
//			}
//		
//		lp1.proDocDropdown();
//		lp1.clickproDUpButton();
//		
//        Thread.sleep(3000);
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
//		WebElement PDcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[4]/td[2]"));
//		//If the checkbox is unchecked then isSelected() will return false 
//		//and NOT of false is true, hence we can click on checkbox
//		if(!PDcheckbox.isSelected()) {
//			PDcheckbox.click();
//		}else {
//			logger.info("Already selected");
//		}
//		
//		WebElement PDcheckbox1 = driver.findElement(By.xpath("//*[@id=\"ca-estate-asset-add-edit-form\"]/table/tbody/tr[5]/td[2]"));
//		//If the checkbox is unchecked then isSelected() will return false 
//		//and NOT of false is true, hence we can click on checkbox
//		if(!PDcheckbox1.isSelected()) {
//			PDcheckbox1.click();
//		}else {
//			logger.info("Already selected");
//		}
//		
//		
//		lp1.clickaddproDOC();
//		
//		try {
//			boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"assetImageUrl-error\"]")).isDisplayed();
//			if(proerrmsg3==true) {
//				
//				logger.info("Check the mandatory fields");
//			}else {
//				logger.info("Project drip  selected");
//			}
//			}catch(Exception e) {
//				
//			}
//		
//		Thread.sleep(5000);
//		
//		lp1.clickConfirmproDoc();
//		logger.info("Document added successfully for Phase");
//		
//	}
//	
	@Test(priority=5,dependsOnMethods="landTest")
	public void AddProDrip() throws InterruptedException, AWTException {
		
		LandPage lp1=new LandPage(driver);
		Thread.sleep(3000);
		
		lp1.clickAddprodripButton();
		
		String prodripName = randomestring();
		lp1.setproDripName(prodripName);
		
		
		try {
			boolean errmsg = driver.findElement(By.xpath("//*[@id=\"assetname-error\"]")).isDisplayed();
			if(errmsg==true) {
				
				logger.info("Enter or check the Drip Name");
			}
			}catch(Exception e) {
				logger.info("Enter Drip Name is correct");
			}
		
		lp1.prodripDropdown();
//		lp1.clickproDrUpButton();
//		
//        Thread.sleep(3000);
//		
//		uploadFile("C:\\Users\\Terralogic\\Desktop\\images\\images.jpg");
		
		Thread.sleep(3000);
		
		WebElement Drcheckbox = driver.findElement(By.xpath("//*[@id=\"ca-estate-drip-add-edit-form\"]/table/tbody/tr[8]/td[2]"));
		//If the checkbox is unchecked then isSelected() will return false 
		//and NOT of false is true, hence we can click on checkbox
		if(!Drcheckbox.isSelected()) {
			Drcheckbox.click();
		}else {
			logger.info("Already selected");
		}
		
		
		lp1.setproDrValue("1000");
		
		Thread.sleep(5000);
		
		lp1.clickaddproDrip();
		try {
			boolean proerrmsg3 = driver.findElement(By.xpath("//*[@id=\"driptype-error\"]")).isDisplayed();
			if(proerrmsg3==true) {
				
				logger.info("Check the mandatory fields");
			}else {
				logger.info("Project drip  selected");
			}
			}catch(Exception e) {
				
			}
			
		Thread.sleep(5000);
		
		lp1.clickConfirmproDrip();
		logger.info("Drip added successfully for Project");
		
		
	}
	
	@Test(priority=6,dependsOnMethods="landTest")
	public void checkProject() throws InterruptedException {
		
		LandPage lp1=new LandPage(driver);
		
		lp1.getProjectName();
		
			
	}
	
	@Test(priority=7,dependsOnMethods="landTest")
	public void Deactivaterpoject() throws InterruptedException {
		
		LandPage lp1=new LandPage(driver); 
		lp1.deactivate();
		
//		boolean msg = driver.findElement(By.xpath("//*[@id=\"landlisttablebody\"]/tr/td")).isDisplayed();
//		if(msg == true) {
//			
//			logger.info("lot deactivated succesfully");
//		}else {
//			
//			logger.info("lot deactivation unsucessfull");
//		}
//		
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
