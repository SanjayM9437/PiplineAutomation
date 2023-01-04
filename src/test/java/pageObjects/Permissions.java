package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Permissions {
	
	WebDriver ldriver;
	
	public Permissions(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement permissions;
	
	@FindBy(xpath="//*[@id=\"permissionRoleAdd\"]")
	@CacheLookup
	WebElement AddRoles;
	
//	@FindBy(xpath="//*[@id=\"permissionRoleAdd\"]")
//	@CacheLookup
//	WebElement ClickADDRole;

	@FindBy(xpath="//*[@id=\"add-new-role-input\"]")
	@CacheLookup
	WebElement NewRole;
	
	@FindBy(xpath="//*[@id=\"c-new-role-div\"]/div/div[2]/div[2]/i")
	@CacheLookup
	WebElement SaveRole;

	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement OK;
	
	@FindBy(xpath="//*[@id=\"c-new-role-div\"]/div/div[2]/div[1]/i")
	@CacheLookup
	WebElement CancelRole;
	
	@FindBy(xpath="//body/div[@id]/div[@id='page-wrapper']/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/div[1]/div[2]/div[1]/i[1]")
	@CacheLookup
	WebElement deleteRole;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement Yes;
	
//Edit User========================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"c-rolelabel-3728451672222211261\"]/div[2]/div[2]/span/i")
	@CacheLookup
	WebElement EditRole;
	
	@FindBy(xpath="//*[@id=\"role-3728451672222211261\"]")
	@CacheLookup
	WebElement EditRoleName;
	
	@FindBy(xpath="//*[@id=\"c-roleedit-3728451672222211261\"]/div[2]/div[2]/i")
	@CacheLookup
	WebElement SaveeditRole;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement OKrole;
	
	
	
//Methods Permission===============================================================================================================================================================================
	
	public void ClickPermission() {
		
		permissions.click();
	}
	
	public void AddRole() {
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(AddRoles));
		AddRoles.click();
	}
	
	
	public void NewROle(String newrole) {
		
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(NewRole));
		   NewRole.sendKeys(newrole);
	}
	
	public void SaveRole() {
		
		SaveRole.click();
	}
	
	public void ClickOK() {
		
		OK.click();
	}
	
	
	public void CancelRole() {
		
		CancelRole.click();
	}
	
	public void Yes() {
		
		Yes.click();
	}
	
	public void DeleteRole() {
		
		deleteRole.click();
	}
	
	public void Editrole() {
		
		EditRole.click();
	}
	
	public void saveEditrole() {
		
		SaveeditRole.click();
	}
	
	public void OKRole() {
		
		OKrole.click();
	}
	
	public void NEDitROle(String newrole) {
		
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(EditRoleName));
		   EditRoleName.clear();
		   EditRoleName.sendKeys(newrole);
	}
}
