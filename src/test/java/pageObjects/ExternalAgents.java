package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalAgents {
	
WebDriver ldriver;
	
	public ExternalAgents(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 

	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[6]/a")
	@CacheLookup
	WebElement ClickExternalAgents;
	
	@FindBy(xpath="//*[@id=\"c-ext-agents-list\"]")
	@CacheLookup
	WebElement listview;

	
	@FindBy(xpath="//*[@id=\"c-externalagents-dashboard\"]")
	@CacheLookup
	WebElement gridview;
	
	@FindBy(xpath="//*[@id=\"new-salesagent-div\"]")
	@CacheLookup
	WebElement createnew;
	
	@FindBy(xpath="//*[@id=\"ca-newcompany-cancel-btn\"]")
	@CacheLookup
	WebElement canceldetails;
	
	@FindBy(xpath="//*[@id=\"ca-create-newcompany-btn\"]")
	@CacheLookup
	WebElement Savenewdetails;
	
	@FindBy(xpath="//*[@id=\"companyname\"]")
	@CacheLookup
	WebElement companyname;
	
	@FindBy(xpath="//*[@id=\"companystreet\"]")
	@CacheLookup
	WebElement Street;
	
	@FindBy(xpath="//*[@id=\"companysuburb\"]")
	@CacheLookup
	WebElement Suburb;
	
	@FindBy(xpath="//*[@id=\"companystate\"]")
	@CacheLookup
	WebElement State;
	
	@FindBy(xpath="//*[@id=\"companypostcode\"]")
	@CacheLookup
	WebElement Postcode;
	
	@FindBy(xpath="//*[@id=\"clienttype\"]")
	@CacheLookup
	WebElement Compantype;
	
	@FindBy(xpath="//*[@id=\"companyofficetype\"]")
   @CacheLookup
   WebElement Officetype;
//New Agents methods===================================================================================================================================================================================
	
	public void clickextagent() {
		ClickExternalAgents.click();
		
	}
	
	public void Listview() {
		listview.click();
		
	}
	
	public void Gridview() {
		gridview.click();
		
	}
	
	public void CreateNew() {
		createnew.click();
		
	}
	
	public void Name(String EXTNAme) {
		companyname.sendKeys(EXTNAme);
		
	}
	
	public void street(String stname) {
		Street.sendKeys(stname);
		
	}
	
	public void suburb(String suname) {
		Suburb.sendKeys(suname);
		
	}
	
	public void state() throws InterruptedException {
		
		Select drop = new Select(State);
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
	
	public void postcode(String PC) {
		Postcode.sendKeys(PC);
		
	}
	
	public void companytype() throws InterruptedException {
		
		Select drop = new Select(Compantype);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Sales Agent")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void officetype() throws InterruptedException {
		
		Select drop = new Select(Officetype);
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
	}
	
	public void savedetails() {
		Savenewdetails.click();
		
	}
//Add Attachement======================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"c-invite-staff\"]")
	@CacheLookup
	WebElement AddUsers;
	
	@FindBy(xpath="//*[@id=\"userEmail\"]")
	@CacheLookup
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"agentUserRole\"]")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath="//*[@id=\"agentUserFirstName\"]")
	@CacheLookup
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"agentUserLastName\"]")
	@CacheLookup
	WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"agentUserMobile\"]")
	@CacheLookup
	WebElement Mobile;
	
	@FindBy(xpath="//*[@id=\"update-user-detail-btn\"]")
	@CacheLookup
	WebElement Saveuser;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement OKuser;
	
	@FindBy(xpath="//*[@id=\"ca-company-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement getuser;

	@FindBy(xpath="//*[@id=\"pipeline-mode-switch\"]/i")
	@CacheLookup
	WebElement selectview;
	
	@FindBy(xpath="//*[@id=\"pipeline-mode\"]")
	@CacheLookup
	WebElement clickdd;
	
	@FindBy(xpath="//*[@id=\"pipeline-mode\"]/option[3]")
	@CacheLookup
	WebElement selectportal;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement linkLand;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/ul/li[2]/a")
	@CacheLookup
	WebElement linklandlist;
	
	@FindBy(xpath="//button[contains(text(),' Go')]")
	@CacheLookup
	WebElement ClickGo;
	
	@FindBy(xpath="//*[@id=\"filter-status\"]")
	@CacheLookup
	WebElement status;
	
	@FindBy(xpath="//*[@id]/td[1]/label/div")
	@CacheLookup
	WebElement clickcheckbox;
	
	@FindBy(xpath="//*[@id=\"action-selector\"]")
	@CacheLookup
	WebElement ActionsDD;
	
	@FindBy(xpath="//*[@id=\"jqac-include-partners\"]")
	@CacheLookup
	WebElement searchagent;
	
	@FindBy(xpath="//ul[@id='ui-id-1']")
	@CacheLookup
	WebElement ClickAgent;
	
	@FindBy(xpath="//*[@id=\"c-publish-btn\"]")
	@CacheLookup
	WebElement publish;
	
	@FindBy(xpath="/html/body/div[17]/div[7]/div/button")
	@CacheLookup
	WebElement OkPublish;
//UserMethods=====================================================================================================================================================================================
	
	public void Adduserss() {
		AddUsers.click();
		
	}
	
	public void email(String email) {
		Email.sendKeys(email);
		
	}
	
	public void AddRole() throws InterruptedException {
		
		Select drop = new Select(Role);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Sales Rep")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void firsname(String fn) {
		Firstname.sendKeys(fn);
		
	}
	
	public void lastname(String ln) {
		Lastname.sendKeys(ln);
		
	}
	
	public void mobile(String mobnum) {
		Mobile.sendKeys(mobnum);
		
	}
	
	public void clickSave() {
		Saveuser.click();
		
	}
	
	public void ClickOK() {
		OKuser.click();
		
	}
	
//	public void Getuser() {
//		Stringgetuser.getText();
//		
//	}
	
	public void Clickmodeswitch() {
		
		for(int i=0; i<=2;i++){
			  try{
			     ldriver.findElement(By.xpath("//*[@id=\"pipeline-mode-switch\"]/i")).click();
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}
//		selectview.click();
	
		
	}

	
	public void Selectview() throws InterruptedException {
		
		Select drop = new Select(clickdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Portal")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void clickLink()
	{
		linkLand.click();
	}

	public void clickLandListLink()
	{
		
		linklandlist.click();
	}
	

	public void Status() throws InterruptedException {
		
		
		Select drop = new Select(status);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Available")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void clickGo()
	{
		
		ClickGo.click();
	}
	
	public void selectbox()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.visibilityOf(clickcheckbox));
		
		clickcheckbox.click();
	}
	

	public void Actions() throws InterruptedException {
		
		
		Select drop = new Select(ActionsDD);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Partner Publishing")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void clickagent() {
		
		ClickAgent.click();
	}
	
	public void publish()
	{
		
		publish.click();
	}
	
	public void okpublish()
	{
		
		OkPublish.click();
	}
	
	public void Selectview2() throws InterruptedException {

		Select drop = new Select(clickdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int j=0;j<dropdown.size();j++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(j).getText().equals("Administrator")) {
			 
			 dropdown .get(j).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);

		}
//SearchUser======================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement searchagent1;
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement agentNAme;
	
//Search methods===================================================================================================================================================================================

	public void SearchAgent1(String sname)
	{
		
		searchagent1.sendKeys(sname);
		searchagent1.sendKeys(Keys.ENTER);
	}	
	
	public void AgentName()
	{
		
		agentNAme.click();
	}
	
//Projects==========================================================================================================================================================================================
	

	@FindBy(xpath="//*[@id=\"ext-salesrep-add\"]")
	@CacheLookup
	WebElement ClickProjects;	
	
	@FindBy(xpath="//*[@id=\"estatecpid\"]")
	@CacheLookup
	WebElement projectdd;
	
	@FindBy(xpath="//*[@id=\"salesrepid\"]")
	@CacheLookup
	WebElement Salesrepdd;
	
	@FindBy(xpath="//*[@id=\"c-save-salesrep\"]")
	@CacheLookup
	WebElement ADD;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement OKK;
	
	
	@FindBy(partialLinkText="Inactive")
	@CacheLookup
	WebElement UserInactive;
//Pro methods======================================================================================================================================================================================
	public void clickprojecadd()
	{

		ClickProjects.click();
	}
	
	public void ProjectDD() throws InterruptedException {

		Select drop = new Select(projectdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int j=0;j<dropdown.size();j++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(j).getText().equals("Administrator")) {
			 
			 dropdown .get(j).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);

		}
	
	public void SalesRepDD() throws InterruptedException {

		Select drop = new Select(Salesrepdd);
		List<WebElement> dropdown=drop.getOptions();

		 for(int j=0;j<dropdown.size();j++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(j).getText().equals("Administrator")) {
			 
			 dropdown .get(j).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);

		}
	
	public void add()
	{
		
		ADD.click();
	}
	
	public void okk()
	{
		
		OKK.click();
	}

//Deactivate======================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"suspend-contract-btn\"]")
	@CacheLookup
	WebElement Deactivate;	
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement Yes;
	
	@FindBy(xpath="/html/body/div[8]/div[7]/div/button")
	@CacheLookup
	WebElement OK;
	
	public void Deactivate()
	{
		
		Deactivate.click();
	}
	
	public void yes()
	{
		
		Yes.click();
	}
	
	public void ok()
	{
		
		OK.click();
	}
	
	public void inactUser() {
	
//		WebDriverWait wt = new WebDriverWait(ldriver,10);
//		wt.until(ExpectedConditions.visibilityOf(UserInactive));
String user = UserInactive.getText();
		
		 if(user.contains("Inactive")) {
			 
			 System.out.println("Users also inactive");

			 
		 }else {
			 
			 System.out.println("Users are active");
			 
		 }

		 }
		
	
	
	
	
//Edit External Agents
	
	@FindBy(xpath="//*[@id]/div/div[2]/span")
	@CacheLookup
	WebElement clickexistingagent;	
	
	@FindBy(xpath="//*[@id=\"ca-detail-edit-btn\"]/i")
	@CacheLookup
	WebElement editagent;	
	
	@FindBy(xpath="//*[@id=\"companyname\"]")
	@CacheLookup
	WebElement editname;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement saveeditdetails;
	
	public void clickestagent()
	{
		
		clickexistingagent.click();
	}
	
	public void editagent()
	{
		
		editagent.click();
	}
	
	public void EdtName(String edname)
	{
		editname.clear();
		editname.sendKeys(edname);
	}
	
	public void Savedet()
	{
		
		saveeditdetails.click();
	}
}

