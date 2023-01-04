package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="j_username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="j_password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul/li[5]/a")
	@CacheLookup
	WebElement btnLogout;
	
	

	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		btnLogout.click();
	}

}
