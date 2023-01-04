package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	WebDriver ldriver;
	
	public ForgotPassword(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 

	@FindBy(xpath="//*[@id=\"forgotpwd\"]")
	@CacheLookup
	WebElement forgotlink;
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
	@CacheLookup
	WebElement Usernametextfield;
	
	@FindBy(xpath="//*[@id=\"update-password\"]")
	@CacheLookup
	WebElement Resetpasswordbtn;
	
//Methods==========================================================================================================================================================================================	
	
	public void setUserName(String uname)
	{
		Usernametextfield.sendKeys(uname);
	}
	
	public void clkickforgotlink()
	{
		forgotlink.click();
	}	

	
	public void Resetpasswrodbtn()
	{
		Resetpasswordbtn.click();
	}	
}
