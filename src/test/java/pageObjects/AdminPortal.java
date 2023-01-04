package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPortal {
	
	
	WebDriver ldriver;
	
	public AdminPortal(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 

	@FindBy(xpath="//*[@id=\"pipeline-mode-switch\"]")
	@CacheLookup
	WebElement modeswitch;
	
	@FindBy(xpath="//*[@id=\"pipeline-mode\"]")
	@CacheLookup
	WebElement selectview;
	
	@FindBy(xpath="//*[@id=\"ca-detail-edit-btn\"]/i")
	@CacheLookup
	WebElement EditDetail;
	
	@FindBy(xpath="//*[@id=\"companyname\"]")
	@CacheLookup
	WebElement companyName;
	
	@FindBy(xpath="//*[@id=\"companystate\"]")
	@CacheLookup
	WebElement Statedd;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Clicksave;	
	
//Add User=========================================================================================================================================================================================	
	@FindBy(xpath="//*[@id=\"c-invite-staff\"]")
	@CacheLookup
	WebElement AddUser;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement Searchbar;
	
	
	@FindBy(xpath="//*[@id=\"filter-branch\"]")
	@CacheLookup
	WebElement BranchBrandDD;
	
	@FindBy(xpath="//*[@id=\"filter-status\"]")
	@CacheLookup
	WebElement StatusDD;
	
	@FindBy(xpath="//*[@id=\"c-user-filter-btn\"]")
	@CacheLookup
	WebElement ClickGO;
	
	@FindBy(xpath="//*[@id=\"user-dashboard\"]")
	@CacheLookup
	WebElement ClickGrid;
	
	@FindBy(xpath="//*[@id=\"c-user-list\"]")
	@CacheLookup
	WebElement Clicktiles;
	
	@FindBy(xpath="//*[@id=\"user-name-1\"]")
	@CacheLookup
	WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id=\"branch-1\"]")
	@CacheLookup
	WebElement Branchdd;
	
	@FindBy(xpath="//*[@id=\"jq-autoadd-newinput-panel\"]/div[1]/table/tbody/tr[3]/td[2]/div/div[1]")
	@CacheLookup
	WebElement Roles;
	
	@FindBy(xpath="//*[@id=\"role-list-1\"]/div[1]/label/span")
	@CacheLookup
	WebElement ADDRolesto;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement Clickoutside;
	
//	@FindBy(xpath="//*[@id=\"submit-invitation\"]")
//	@CacheLookup
//	WebElement SendInvite;
	
	@FindBy(xpath="//*[@id=\"user-dashboard-div\"]/div[1]/div/div[2]")
	@CacheLookup
	WebElement ClickUsers;
//Search Users====================================================================================================================================================================================
	@FindBy(xpath="//*[@id]/div[1]/div/div[2]/div/strong")
	@CacheLookup
	WebElement UserNAme;
	
	@FindBy(xpath="//*[@id=\"user-dashboard-div\"]/div/div")
	@CacheLookup
	WebElement clickusername;
	
	@FindBy(xpath="//*[@id=\"ca-detail-edit-btn\"]/i")
	@CacheLookup
	WebElement Edituserdetails;
	
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement saveuserdetails;
	
	@FindBy(xpath="//*[@id=\"addressstate\"]")
	@CacheLookup
	WebElement UserStatedd;
	
	@FindBy(xpath="//*[@id=\"contactfirstname\"]")
	@CacheLookup
	WebElement EdituserStatename;
	
	@FindBy(xpath="/html/body/div[8]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOk;
	
	@FindBy(xpath="//*[@id=\"ca-role-edit-btn\"]/i")
	@CacheLookup
	WebElement EditBranchRoles;
	
	@FindBy(xpath="//*[@id=\"ca-user-role-edit-form\"]/table[2]/tbody/tr[3]/td[1]")
	@CacheLookup
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"ca-role-save-btn\"]")
	@CacheLookup
	WebElement ClickSaverole;
	
	@FindBy(xpath="/html/body/div[8]/div[7]/div/button")
	@CacheLookup
	WebElement ClickroleOk;
//Deactivate and Resetpassword==========================================================================================================================================================================================	
	@FindBy(xpath="//*[@id=\"access-status-btn\"]")
	@CacheLookup
	WebElement Deactivate;
	
	@FindBy(xpath="/html/body/div[8]/div[7]/div/button")
	@CacheLookup
	WebElement Yes;
	
	
	@FindBy(xpath="/html/body/div[8]/div[7]/button")
	@CacheLookup
	WebElement Cancel;
	
	@FindBy(xpath="/html/body/div[8]/div[7]/div/button")
	@CacheLookup
	WebElement OK;
	
	@FindBy(xpath="//*[@id=\"filter-status\"]")
	@CacheLookup
	WebElement StatusDDdd;
	
	@FindBy(xpath="//*[@id=\"user-dashboard-div\"]/div/div/div[3]/div")
	@CacheLookup
	WebElement Deactivateduser;
	
	@FindBy(xpath="//*[@id=\"ca-user-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement Deactivatedusername;
	
	@FindBy(xpath="//*[@id=\"c-user-filter-btn\"]")
	@CacheLookup
	WebElement ClickdGO;
	
//Activate==================================================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"user-dashboard-div\"]/div/div/div[3]/div/strong")
	@CacheLookup
	WebElement ClickDuser;
	
	@FindBy(xpath="//*[@id=\"ca-user-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement getUserName;
	
	
	@FindBy(xpath="//*[@id=\"access-activate-btn\"]")
	@CacheLookup
	WebElement ClickActivate;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement YesA;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement OKA;
	
//Reset Password==================================================================================================================================================================================
	@FindBy(xpath="//*[@id=\"user-dashboard-div\"]/div/div/div[2]/div/strong")
	@CacheLookup
	WebElement clickActiuser;
	
	@FindBy(xpath="//*[@id=\"change-password-btn\"]")
	@CacheLookup
	WebElement ResetPassword;
	
	@FindBy(xpath="//*[@id=\"new-password\"]")
	@CacheLookup
	WebElement NewPassword;
	
	@FindBy(xpath="//*[@id=\"confirm-password\"]")
	@CacheLookup
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"update-password-btn\"]")
	@CacheLookup
	WebElement UpdatePassword;
	//ADD Branch==================================================================================================================================================================================	
	
	@FindBy(xpath="//*[@id=\"jq-popaddbranch\"]")
	@CacheLookup
	WebElement AddBranch;
	
	@FindBy(xpath="//*[@id=\"branchname\"]")
	@CacheLookup
	WebElement AddBranchName;
	
	@FindBy(xpath="//*[@id=\"branchstreet\"]")
	@CacheLookup
	WebElement AddBranchStreet;
	
	@FindBy(xpath="//*[@id=\"branchsuburb\"]")
	@CacheLookup
	WebElement AddBranchSuburb;
	
	@FindBy(xpath="//*[@id=\"branchstate\"]")
	@CacheLookup
	WebElement AddBranchState;
	
	@FindBy(xpath="//*[@id=\"branchpostcode\"]")
	@CacheLookup
	WebElement Postcode;
	
	@FindBy(xpath="//*[@id=\"branchofficetype\"]")
	@CacheLookup
	WebElement officetype;
	
	@FindBy(xpath="//*[@id=\"c-add-branch\"]")
	@CacheLookup
	WebElement Savebranch;
//Locations=======================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"location-add-btn\"]")
	@CacheLookup
	WebElement Addlocation;
	
	@FindBy(xpath="//*[@id=\"ca-company-location-add-edit-form\"]/table/tbody/tr[1]/td[2]/label/label/div")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath="//*[@id=\"locationname\"]")
	@CacheLookup
	WebElement LocationName;
	
	@FindBy(xpath="//*[@id=\"locphone\"]")
	@CacheLookup
	WebElement contact;
	
	@FindBy(xpath="//*[@id=\"locstreet\"]")
	@CacheLookup
	WebElement street;
	
	@FindBy(xpath="//*[@id=\"locsuburb\"]")
	@CacheLookup
	WebElement suburb;
	
	@FindBy(xpath="//*[@id=\"locationstate\"]")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"locationPostCode\"]")
	@CacheLookup
	WebElement locationpc;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-location\"]")
	@CacheLookup
	WebElement AddLocation;
	
//Edit Location===================================================================================================================================================================================
	
	////*[@id="ca-location-edit-btn"]/i
	
	@FindBy(xpath="//*[@id=\"ca-location-edit-btn\"]/i")
	@CacheLookup
	WebElement ClickEditLocation;
	
	@FindBy(xpath="//*[@id=\"locationname\"]")
	@CacheLookup
	WebElement EditLocationName;
	
	@FindBy(xpath="//*[@id=\"locationstate\"]")
	@CacheLookup
	WebElement editstate;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-location\"]")
	@CacheLookup
	WebElement EDitLocation;
//Edit Location Methods==============================================================================================================================================================================
	
	public void EditLocation() {
		ClickEditLocation.click();
		
	}
	
	
	public void EditlocName(String elname) {
		LocationName.sendKeys(elname);
		
	}
	
	public void EditState() throws InterruptedException {
		
		Select drop = new Select(editstate);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Alaska")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void EditexistingLocation() {
		EDitLocation.click();
		
	}
//Legal content===================================================================================================================================================================================
	
	//*[@id="ca-branding-lm-edit-btn"]/i
	
	@FindBy(xpath="//*[@id=\"ca-branding-lm-edit-btn\"]/i")
	@CacheLookup
	WebElement EditloginMessage;
	
	@FindBy(xpath="//*[@id=\"branding-logingmessage\"]")
	@CacheLookup
	WebElement LoginAreatext;
	
	@FindBy(xpath="//*[@id=\"ca-branding-ltandc-edit-btn\"]/i")
	@CacheLookup
	WebElement termsconditions;
	
	@FindBy(xpath="//*[@id=\"branding-logintandc\"]")
	@CacheLookup
	WebElement TCAreatext;
	
	@FindBy(xpath="//*[@id=\"ca-branding-pd-edit-btn\"]/i")
	@CacheLookup
	WebElement productdisclaimer;
	
	@FindBy(xpath="//*[@id=\"branding-productdisclaimer\"]")
	@CacheLookup
	WebElement PDAreatext;
	
	@FindBy(xpath="//*[@id=\"branding-lm-save-btn\"]")
	@CacheLookup
	WebElement savetext;
	
	@FindBy(xpath="//*[@id=\"branding-lm-cancel-btn\"]")
	@CacheLookup
	WebElement canceltext;
	
	@FindBy(xpath="//*[@id=\"branding-ltandc-save-btn\"]")
	@CacheLookup
	WebElement savetctext;
	
	@FindBy(xpath="//*[@id=\"branding-ltandc-cancel-btn\"]")
	@CacheLookup
	WebElement canceltctext;
	
	@FindBy(xpath="//*[@id=\"branding-pd-save-btn\"]")
	@CacheLookup
	WebElement savepdtext;
	
	@FindBy(xpath="//*[@id=\"branding-pd-cancel-btn\"]")
	@CacheLookup
	WebElement cancelpdtext;
	
	
//legal content methods===========================================================================================================================================================================
	
	public void EditLoginMsg() {
		EditloginMessage.click();
		
	}
	
	public void AddloginMessage(String lgmsg) {
		LoginAreatext.sendKeys(lgmsg);
		
	}
	
	public void SaveLoginMsg() {
		savetext.click();
		
	}
	
	public void CAncelLoginMsg() {
		canceltext.click();
		
	}
	
	public void EditTC() {
		termsconditions.click();
		
	}
	
	public void AddTCMessage(String TCmsg) {
		TCAreatext.sendKeys(TCmsg);
		
	}
	
	public void CAncelTCMsg() {
		canceltctext.click();
		
	}
	
	public void EditPD() {
		productdisclaimer.click();
		
	}
	
	public void AddPDMessage(String PDmsg) {
		TCAreatext.sendKeys(PDmsg);
		
	}
	
	
	
//AddLocation method==============================================================================================================================================================================
	public void AddLocatipn() {
		Addlocation.click();
		
	}
	
	public void locName(String lname) {
		LocationName.sendKeys(lname);
		
	}
	
	public void contact(String lcontact) {
		contact.sendKeys(lcontact);
		
	}
	
	public void Street(String Street) {
		street.sendKeys(Street);
		
	}
	
	public void Suburb(String Suburb) {
		suburb.sendKeys(Suburb);
		
	}
	
	public void State() throws InterruptedException {
		
		Select drop = new Select(state);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Alabama")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void postcode(String postcode) {
		locationpc.sendKeys(postcode);
		
	}
	
	public void clickLocationSave() {
		AddLocation.click();
		
	}

	
	
//Methods==========================================================================================================================================================================================
	
	public void Clickmodeswitch() {
		modeswitch.click();
	
		
	}

	
	public void Selectview() throws InterruptedException {
		
		Select drop = new Select(selectview);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Administrator")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void Editdetail() {
		EditDetail.click();
	
		
	}
	
	public void CompanyName(String CName) {
		
		companyName.clear();
		companyName.sendKeys(CName);
		
	}
	
	public void StateDD() throws InterruptedException {
		
		Select drop = new Select(Statedd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Alabama")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void ClickSave() {
		Clicksave.click();
	
		
	}
//Add Users=======================================================================================================================================================================================
	
	public void ADDUsers() {
		AddUser.click();
	
		
	}
	
	public void Emailusers(String Email) {
		EmailAddress.sendKeys(Email);
	
		
	}
	
	public void BranchDD() throws InterruptedException {
		
		Select drop = new Select(Branchdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Horizon Deer Creek Administrator")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void ADDroles() {
		Roles.click();
	
		
	}
	
	public void selectroles() throws InterruptedException {
		ADDRolesto.click();

		
	}
	
	public void SendInvitation() throws InterruptedException {
		
		WebElement SendInvite = ldriver.findElement(By.xpath("(//*[@id=\"submit-invitation\"]"));
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", SendInvite);
	
//		SendInvite.click();
//		
	}
	
// Search Users===================================================================================================================================================================================
	
	public void GetUsers() {
		
	String users = 	UserNAme.getText();
	Searchbar.sendKeys(users);
	Searchbar.sendKeys(Keys.ENTER);
	
	
}
	
	public void Clickgo() {
		
		ClickGO.click();
		
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(clickusername));
		
		   clickusername.click();
}
	
	public void EditUsersdetails() {
		
		Edituserdetails.click();
	
	
}
	
	public void EditUsersname(String uname) {
		
		EdituserStatename.sendKeys(uname);
	
	
}
	public void EditStatedd() throws InterruptedException {
		
		Select drop = new Select(UserStatedd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Bandera")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	
	
}
	
	public void ClickEditsave() {
		
		saveuserdetails.click();
	
	
}
	
	public void ClickOK() {
		
		ClickOk.click();
	
	
}
	public void editbranch() {
		
		EditBranchRoles.click();
	
	
}
	
	
	
	public void Selectcheckbox() {
		
		boolean isSelected3 = checkbox.isSelected();
		if(isSelected3 == false) {
			checkbox.click();
		}else {
			System.out.println("Already selected");
		}
	
	
}

	public void ClickRolesave() {
		
		ClickSaverole.click();
	
	
}
	public void ClickRoleOK() {
		
		ClickroleOk.click();
	
	
}
// Search Users===========================================================================================================================================================================================================================	
	
	public void Duser() {
		
		Deactivate.click();
	
	
}	
	
	public void Yes() {
		
		Yes.click();
	
	
}	
	public void ok() {
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(OK));
		OK.click();
	
	
}
	public void StatuDDDD() throws InterruptedException {
		
		Select drop = new Select(StatusDDdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Inactive")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	
	
	
}
	public void ClickGO() {
		

//		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
//		wt1.until(ExpectedConditions.stalenessOf(ClickdGO));
		ClickdGO.click();
	

}
	
//Activate deactivate user========================================================================================================================================================================
	
	public void clickDuser() {
		
		ClickDuser.click();
	
	
}
	public void ActivateUser()
	{
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(ClickActivate));
		ClickActivate.click();
	}
	
	public void Yesa()
	{
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(YesA));
		YesA.click();
	}
	
	public void OKa()
	{
		
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(OKA));
		OKA.click();
	}
//Reset Password==================================================================================================================================================================================
	public void ClickActive() {
		
		clickActiuser.click();
	}
	
	public void Resetpassword() {
		
		ResetPassword.click();
	}
	
	public void Newpassword(String newp) {
		
		NewPassword.sendKeys(newp);	
	}
	
	public void Confirmpassword(String confp) {
		
		ConfirmPassword.sendKeys(confp);	
	}
	
	public void Updaetpswd() {
		
		UpdatePassword.click();	
	}
	
//Add Branch======================================================================================================================================================================================
	
	public void ClickAddBranch() {
		
		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(AddBranch));
		AddBranch.click();
	}
	
	
	public void AddBranchName(String BranchName) {
		
		AddBranchName.sendKeys(BranchName);
	}
	
	public void Addstreet(String streetName) {
		
		AddBranchStreet.sendKeys(streetName);
	}
	
	public void Addsuburb(String suburbName) {
		
		AddBranchSuburb.sendKeys(suburbName);
	}
	
	public void Addstate() throws InterruptedException {
		
		Select drop = new Select(AddBranchState);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Alabama")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	
//		AddBranchState.click();
	}
	
	public void Addpostcode(String postcode) {
		
		Postcode.sendKeys(postcode);
	}
	
	public void Officetype() throws InterruptedException {
		
		Select drop = new Select(officetype);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Branch")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
//		officetype.click();
	}
	
	public void ClickSavebranch() {
		
		Savebranch.click();
	}
	
//Add Region to location
	
	@FindBy(xpath="//*[@id=\"ca-company-location-add-edit-form\"]/table/tbody/tr[1]/td[2]/label/label/div")
	@CacheLookup
	WebElement locationcheckbox;
	
	@FindBy(xpath="//*[@id=\"regionList\"]")
	@CacheLookup
	WebElement Region;
	
//Methods=========================================================================================================================================================================================
	
	public void loccheckbox() {

		WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(locationcheckbox));
		locationcheckbox.click();
	}
	
	public void Regiondd() throws InterruptedException {
		
		Select drop = new Select(Region);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("funcTest")) {
			 
			 dropdown .get(i).click();
             System.out.println("previously created region selected");
			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
//		officetype.click();
	}
}
