package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HouseLandList;
import pageObjects.LoginPage;

public class TC_004_HouseandLandList extends BaseClass{
   	
	@Test
    public void HandLList() throws IOException, InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		HouseLandList HL = new HouseLandList(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("PIPELINE SALES REP"))
		{
//			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		Thread.sleep(3000);;
		HL.clickLink();
		
		Thread.sleep(3000);
		HL.clickhouselandLink();
		
		Thread.sleep(3000);
		HL.prodropdown();
		
		Thread.sleep(3000);
		HL.clickGo();
		
		Thread.sleep(7000);
		
		HL.clickpackage();
		
		boolean ok = driver.findElement(By.xpath("/html/body/div[10]/h2")).isDisplayed();
	
			if(ok==true) {
				logger.info("package details edited successfully");
				driver.findElement(By.xpath("/html/body/div[10]/h2")).click();
			}else {
				
				logger.info("Not able to edit pacakage details");
			}
		
	}

}
