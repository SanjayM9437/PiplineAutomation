package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;

public class TC_012_ForgotPassword extends BaseClass{
	
	
	@Test
	public void ForgotPswd() throws IOException {
		
		ForgotPassword FP = new ForgotPassword(driver);
		
		FP.clkickforgotlink();
		
		String email = randomeemail();
//		FP.setUserName(email + "@" + "runway.com");
		FP.setUserName("adsdaddsa");
		
		
		FP.Resetpasswrodbtn();
		
		boolean errormsg = driver.findElement(By.xpath("//*[@id=\"selectorestate-error\"]")).isDisplayed();
		if(errormsg==true) {
			
			logger.info("Enter valid Email");
	    	captureScreen(driver,"landTest");
			Assert.assertTrue(false);
			
		}else {
			
			logger.info("Entered Email is valid");
		}
		
	}

}
