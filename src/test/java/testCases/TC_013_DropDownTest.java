package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPortal;
import pageObjects.DropDown;
import pageObjects.LoginPage;

public class TC_013_DropDownTest extends BaseClass{
	
	String CompanyType = "Home Builder";
	String StateName = "Alabama";
	String StatusName = "Activate";
	
@Test
public void DDTest() throws IOException, InterruptedException {
	
	LoginPage lp=new LoginPage(driver);
	AdminPortal AP = new AdminPortal(driver);
	DropDown dd = new DropDown(driver);
	
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
	
	AP.Clickmodeswitch();
	AP.Selectview();
	
   String pagetitle = driver.getTitle();
       
   if(pagetitle.equalsIgnoreCase("PIPELINE ADMIN")) {
	   
	   logger.info("Admin View");
	   
   }else {
	   
	   logger.info("Not admin View");
	   captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		
   }
   
   dd.ExtAgent();
   
 
}

@Test(priority=2,dependsOnMethods="DDTest")
public void StateDD() throws InterruptedException, IOException {
	   
	   
	DropDown dd = new DropDown(driver);
	
	Thread.sleep(2000);
	dd.state();
	
	Thread.sleep(2000);
	dd.ClickGO();
	
	Thread.sleep(2000);
	dd.GetAgent();
	
	String SN = driver.findElement(By.xpath("//*[@id=\"ca-company-detail-show\"]/tbody/tr[7]/td[2]")).getText();
	if(SN.equals(this.StateName)) {
		
		logger.info("State dropdwon working as expected");
	}else {
		
		 logger.info("State dropdown functionality is not working");
		   captureScreen(driver,"DDTest");
			Assert.assertTrue(false);
		
	}
	
	Thread.sleep(2000);
	dd.ExtAgent();
}

@Test(priority=3,dependsOnMethods="DDTest")
public void ComapnyTypeDD() throws InterruptedException, IOException {
	   
	   
	DropDown dd = new DropDown(driver);
	
	Thread.sleep(2000);
	dd.companytype();
	
	Thread.sleep(2000);
	dd.ClickGO();
	
	Thread.sleep(2000);
	dd.GetAgent();
	
	String CT = driver.findElement(By.xpath("//*[@id=\"ca-company-detail-show\"]/tbody/tr[10]/td[2]")).getText();
	if(CT.equals(this.CompanyType)) {
		
		logger.info("Companytype dropdwon working as expected");
	}else {
		
		 logger.info("Companytype dropdown functionality is not working");
		   captureScreen(driver,"DDTest");
			Assert.assertTrue(false);
		
	}
	
	Thread.sleep(2000);
	dd.ExtAgent();
}

@Test(priority=4,dependsOnMethods="DDTest")
public void StatusDD() throws InterruptedException, IOException {
	   
	   
	DropDown dd = new DropDown(driver);
	
	Thread.sleep(2000);
	dd.status();
	
	Thread.sleep(2000);
	dd.ClickGO();
	
	Thread.sleep(2000);
	dd.GetAgent();
	
	String stausname = driver.findElement(By.xpath("//*[@id=\"activate-contract-btn\"]")).getText();
	if(stausname.equals(this.StatusName)) {
		
		logger.info("Staus dropdwon working as expected");
	}else {
		
		 logger.info("Status dropdown functionality is not working");
		   captureScreen(driver,"DDTest");
			Assert.assertTrue(false);
		
	}
	
	Thread.sleep(2000);
	dd.ExtAgent();
}
}
