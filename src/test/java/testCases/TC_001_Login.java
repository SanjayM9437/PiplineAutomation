package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_001_Login extends BaseClass{

	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
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
		
//		lp.clickLogout();
//		if(driver.getTitle().equals("PIPELINE"))
//		{
//			Assert.assertTrue(true);
//			logger.info("Logout test passed");
//		}
//		else
//		{
//			captureScreen(driver,"logoutTest");
//			Assert.assertTrue(false);
//			logger.info("Logout test failed");
//		}
	}
	
}
