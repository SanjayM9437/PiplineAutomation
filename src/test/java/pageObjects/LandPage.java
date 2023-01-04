package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandPage {
	
	WebDriver ldriver;
	
//	WebDriverWait wt = new WebDriverWait(ldriver,10);
	
	public LandPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement linkLand;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/ul/li[1]/a")
	@CacheLookup
	WebElement linkProjects;
	
	@FindBy(id="c-newestate-btn")
	@CacheLookup
	WebElement linkNewProjects;
	
	@FindBy(id="selectorestate")
	@CacheLookup
	WebElement txtEstateName;
	
	@FindBy(id="selectorbranch")
	@CacheLookup
	WebElement BranchDropDown;
	
	@FindBy(id="ca-detail-save-btn")
	@CacheLookup
	WebElement savebtn;

	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement confirmbtn;
	
	@FindBy(id="stage-add-btn")
	@CacheLookup
	WebElement phaselink;
	
	@FindBy(xpath="//*[@id=\"selectorstage\"]")
	@CacheLookup
	WebElement txtPhaseName;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement savePhasebtn;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement phaseconfirmbtn;
	
	@FindBy(xpath="//*[@id=\"images-add-btn\"]")
	@CacheLookup
	WebElement addImagebtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtImageName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement ImgDropdown;
	
	@FindBy(xpath="//*[@id=\"assetdropzone\"]")
	@CacheLookup
	WebElement Upasset;
	
	@FindBy(id="c-add-edit-asset")
	@CacheLookup
	WebElement AddImage;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement imageconfirmbtn;
//ADD video here
	
	@FindBy(xpath="//*[@id=\"videos-add-btn\"]")
	@CacheLookup
	WebElement addVideobtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtVideoName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement VideoDropdown;
	
	@FindBy(id="assetVideoUrl")
	@CacheLookup
	WebElement videoURL;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement Addvideo;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement videoconfirmbtn;
	
	//Add Document elements here
	
	@FindBy(xpath="//*[@id=\"documents-add-btn\"]")
	@CacheLookup
	WebElement addDocumenrtbtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtDocName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement DocDropdown;
	
	@FindBy(xpath="//*[@id=\"assetdropzone\"]")
	@CacheLookup
	WebElement UpDoc;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement AddDoc;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement Docconfirmbtn;
	
	@FindBy(xpath="//*[@id=\"assetdropzonePreview\"]/div/div[3]")
	@CacheLookup
	WebElement progressbar;
	
	// Add Drips elements here
	
	@FindBy(xpath="//*[@id=\"drips-add-btn\"]")
	@CacheLookup
	WebElement addDripsbtn;
	
	@FindBy(xpath="//*[@id=\"dripname\"]")
	@CacheLookup
	WebElement txtDripName;
	
	@FindBy(xpath="//*[@id=\"driptype\"]")
	@CacheLookup
	WebElement DripDropdown;
	
	@FindBy(xpath="//*[@id=\"mydropzone\"]")
	@CacheLookup
	WebElement UpDrip;

	@FindBy(xpath="//*[@id=\"dripvalue\"]")
	@CacheLookup
	WebElement DripValue;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-drip\"]")
	@CacheLookup
	WebElement AddDrip;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement Dripconfirmbtn;
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[3]")
	@CacheLookup
	WebElement BacktoProject;
	
	//Add Sales Rep==============================================================================================================================================================================
	
	@FindBy(id="salesrep-add")
	@CacheLookup
	WebElement newSalesRep;
	
	@FindBy(xpath="//*[@id=\"salesrepid\"]")
	@CacheLookup
	WebElement SalesRepdropdown;
	
	@FindBy(id="c-save-salesrep")
	@CacheLookup
	WebElement AddSalesRep;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement ConfirmSalesRep;
	
	//Project Branch============================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"branch-add\"]")
	@CacheLookup
	WebElement newproBranch;
	
	@FindBy(id="clientcompanyid")
	@CacheLookup
	WebElement proBranch;
	
	@FindBy(id="c-save-branch")
	@CacheLookup
	WebElement AddproBranch;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement ConfirmproBranch;
	
//Project image=================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"images-add-btn\"]")
	@CacheLookup
	WebElement addProImagebtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtproImageName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement ProImgDropdown;
	
	@FindBy(xpath="//*[@id=\"assetdropzone\"]/div[1]")
	@CacheLookup
	WebElement proUpasset;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement AddproImage;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement proimageconfirmbtn;
	
// ADD project video=============================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"videos-add-btn\"]")
	@CacheLookup
	WebElement addproVideobtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtproVideoName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement ProVideoDropdown;
	
	@FindBy(xpath="//*[@id=\"assetVideoUrl\"]")
	@CacheLookup
	WebElement provideoURL;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement Addprovideo;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement provideoconfirmbtn;
	
	//Project Doc===============================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"documents-add-btn\"]")
	@CacheLookup
	WebElement addproDocumenrtbtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtproDocName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement proDocDropdown;
	
	@FindBy(xpath="//*[@id=\"assetdropzone\"]")
	@CacheLookup
	WebElement UpproDoc;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement AddproDoc;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement proDocconfirmbtn;
	
	//Project Drip===============================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"drips-add-btn\"]")
	@CacheLookup
	WebElement addproDripsbtn;
	
	@FindBy(xpath="//*[@id=\"dripname\"]")
	@CacheLookup
	WebElement txtproDripName;
	
	@FindBy(xpath="//*[@id=\"driptype\"]")
	@CacheLookup
	WebElement proDripDropdown;
	
	@FindBy(xpath="//*[@id=\"mydropzone\"]")
	@CacheLookup
	WebElement UpproDrip;

	@FindBy(xpath="//*[@id=\"dripvalue\"]")
	@CacheLookup
	WebElement proDripValue;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-drip\"]")
	@CacheLookup
	WebElement AddproDrip;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement proDripconfirmbtn;
	
//Check for project created or not===============================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"ca-estateproduct-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement txtProjectName;
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")
	@CacheLookup
	WebElement clickLand;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement searchProject;
	
	@FindBy(xpath="//*[@id=\"land-estate-container\"]/div/div/div[2]/span")
	@CacheLookup
	WebElement confirmProjectName;
	
	@FindBy(xpath="//*[@id=\"ca-estateproduct-detail-show\"]/tbody/tr[7]/td[2]")
	@CacheLookup
	WebElement txtStateName;
	
	@FindBy(xpath="//*[@id=\"filter-state\"]")
	@CacheLookup
	WebElement StateDropdown;
	
//Click on phase =================================================================================================================================================================================	
	
	@FindBy(xpath="//*[@id=\"stage-detail-form\"]/table/tbody/tr/td[1]")
	@CacheLookup
	WebElement clickPhases;
	
	@FindBy(xpath="//*[@id=\"c-stage-deactivate\"]/span")
	@CacheLookup
	WebElement clickDeactivate;
	
	@FindBy(xpath="//*[@id=\"ca-stageproduct-detail-show\"]/tbody/tr[3]/td[2]")
	@CacheLookup
	WebElement phasename;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement okbutton;
	
	@FindBy(xpath="//button[@class='confirm']")
	@CacheLookup
	WebElement confirmbutton;
	
	@FindBy(xpath="//*[@id=\"estate_details_div\"]/div[1]/div[2]/div[2]/div/p")
	@CacheLookup
	WebElement phasemsg;
	
//	@FindBy(xpath="//*[@id=\"stage-detail-form\"]/table/tbody/tr/td[1]")
//	@CacheLookup
//	WebElement phasename1;
//Projec deactivation===============================================================================================================================================================================================

	@FindBy(xpath="//*[@id=\"c-estate-deactivate\"]")
	@CacheLookup
	WebElement clickprojectDeactivate;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement prookbutton;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement proconfirmbutton;
	
//	@FindBy(xpath="//button[@class='confirm']")
//	@CacheLookup
//	WebElement confirmbutton;
//	
//Methods =======================================================================================================================================================================================	
	
	public void clickLink()
	{
		linkLand.click();
	}
	
	public void clickProjectsLink()
	{
		linkProjects.click();
	}
	
	public void clickNewProjectsLink()
	{
		linkNewProjects.click();
	}
	
	public void setestateName(String Ename)
	{
		txtEstateName.sendKeys(Ename);
	}
	
	public void branchDropdown() {
		Select drop = new Select(BranchDropDown);
		drop.selectByIndex(0);
	}
	
	public void clickSavebtn()
	{
		savebtn.click();
	}
	
	public void clickConfirmbtn()
	{
		confirmbtn.click();
	}
	
	public void clickAddPhase()
	{
		phaselink.click();
	}
	
	public void setPhaseName(String Pname)
	{
		txtPhaseName.sendKeys(Pname);
	}
	
	public void clickPhaseSavebtn()
	{
		savePhasebtn.click();
	}
	
	public void clickPhaseConfirmbtn()
	{
		phaseconfirmbtn.click();
	}
	
	public void clickAddimageButton()
	{
		addImagebtn.click();
	}
	
	public void setImageName(String Iname)
	{
		txtImageName.sendKeys(Iname);
	}
	
	public void imageDropdown() {
		Select drop = new Select(ImgDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickUpButton()
	{
		Upasset.click();
	}
	
	public void clickaddImage()
	{
		AddImage.click();
	}
	
	public void clickConfirmImage()
	{
		imageconfirmbtn.click();
	}
	
	//Video method
	
	public void clickAddvideoButton()
	{
		addVideobtn.click();
	}
	
	public void setVideoName(String Vname)
	{
		txtVideoName.sendKeys(Vname);
	}
	
	public void videoDropdown() {
		Select drop = new Select(VideoDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickVUpButton(String Vurl)
	{
		videoURL.sendKeys(Vurl);
	}
	
	public void clickaddVideo()
	{
		Addvideo.click();
	}
	
	public void clickConfirmVideo()
	{
		videoconfirmbtn.click();
	}
	
	//Doc========================================================================================================================================================================================
	
	public void clickAdddocButton()
	{
		addDocumenrtbtn.click();
	}
	
	public void setDocName(String Dname)
	{
		txtDocName.sendKeys(Dname);
	}
	
	public void DocDropdown() {
		Select drop = new Select(DocDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickDUpButton()
	{
		
		UpDoc.click();
		
	}
	
	public void clickaddDOC()
	{
		
    	WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.invisibilityOf(progressbar));
		AddDoc.click();

	}
	
	public void clickConfirmDoc()
	{
		Docconfirmbtn.click();
	}
	//Drip======================================================================================================================================================================================
	
	public void clickAdddripButton()
	{
		addDripsbtn.click();
	}
	
	public void setDripName(String Dname)
	{
		txtDripName.sendKeys(Dname);
	}
	
	public void dripDropdown() {
		Select drop = new Select(DripDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickDrUpButton()
	{
		UpDrip.click();
	}
	
	public void setDrValue(String DrValue)
	{
		DripValue.sendKeys(DrValue);
	}
	
	public void clickaddDrip()
	{
		AddDrip.click();
	}
	
	public void clickConfirmDrip()
	{
		Dripconfirmbtn.click();
	}
	
	//BAck to project page
	public void clickProjectName()
	{
		BacktoProject.click();
	}
	
	//Sales Rep=============================================================================================================================================================================
	
	public void newsalesrep()
	{
		newSalesRep.click();
	}
	
	public void salesrepDropdown() {
		Select drop = new Select(SalesRepdropdown);
		//drop.selectByIndex(0);
		drop.selectByIndex(1);
	}
	
	public void addsalesrep()
	{
		AddSalesRep.click();
	}
	
	public void confirmsalesrep()
	{
		ConfirmSalesRep.click();
	}
	
	//Project Branches==========================================================================================================================================================================
	
	public void newproBranch()
	{
		newproBranch.click();
	}
	
	public void proBranchDropdown() {
		Select drop = new Select(proBranch);
		//drop.selectByIndex(0);
		drop.selectByIndex(1);
	}
	
	public void addproBranch()
	{
		AddproBranch.click();
	}
	
	public void confirmprobranch()
	{
		ConfirmproBranch.click();
	}
	//Project image methods======================================================================================================================================================================
	
	public void clickAddproimageButton()
	{
		addProImagebtn.click();
	}
	
	public void setproImageName(String Iname)
	{
		txtproImageName.sendKeys(Iname);
	}
	
	public void proimageDropdown() {
		Select drop = new Select(ProImgDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickproUpButton()
	{
		proUpasset.click();
	}
	
	public void clickaddproImage()
	{
		AddproImage.click();
	}
	
	public void clickConfirmproImage()
	{
		proimageconfirmbtn.click();
	}
	
	//Project video methods======================================================================================================================================================================
	
	public void clickproAddvideoButton()
	{
		addproVideobtn.click();
	}
	
	public void setproVideoName(String Vname)
	{
		txtproVideoName.sendKeys(Vname);
	}
	
	public void provideoDropdown() {
		Select drop = new Select(ProVideoDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickproVUpButton(String Vurl)
	{
		provideoURL.sendKeys(Vurl);
	}
	
	public void clickproaddVideo()
	{
		Addprovideo.click();
	}
	
	public void clickproConfirmVideo()
	{
		provideoconfirmbtn.click();
	}
	
	//Project doc ===============================================================================================================================================================================
	public void clickAddprodocButton()
	{
		addproDocumenrtbtn.click();
	}
	
	public void setproDocName(String PDname)
	{
		txtproDocName.sendKeys(PDname);
	}
	
	public void proDocDropdown() {
		Select drop = new Select(proDocDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickproDUpButton()
	{
		UpproDoc.click();
		
	}
	
	public void clickaddproDOC()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.invisibilityOf(progressbar));
		AddproDoc.click();
	}
	
	public void clickConfirmproDoc()
	{
		proDocconfirmbtn.click();
	}
	
	//Project Drip===============================================================================================================================================================================
	
	
	public void clickAddprodripButton()
	{
		addproDripsbtn.click();
	}
	
	public void setproDripName(String Dname)
	{
		txtproDripName.sendKeys(Dname);
	}
	
	public void prodripDropdown() {
		Select drop = new Select(proDripDropdown);
		drop.selectByIndex(1);
	}
	
	public void clickproDrUpButton()
	{
		UpproDrip.click();
	}
	
	public void setproDrValue(String DrValue)
	{
		proDripValue.sendKeys(DrValue);
	}
	
	public void clickaddproDrip()
	{
		AddproDrip.click();
	}
	
	public void clickConfirmproDrip()
	{
		proDripconfirmbtn.click();
	}
//Check project==================================================================================================================================================================================
	public void getProjectName() throws InterruptedException
	{
	   String PN = txtProjectName.getText();
	   System.out.println(PN);
	   
	   clickLand.click();
	   
	   Thread.sleep(3000);
	   
	   WebDriverWait wt1 = new WebDriverWait(ldriver,10);
	   wt1.until(ExpectedConditions.visibilityOf(searchProject));
	   searchProject.sendKeys(PN);
	   searchProject.sendKeys(Keys.ENTER);
	   
	   Thread.sleep(3000);
	
//	   wt1.until(ExpectedConditions.visibilityOf(confirmProjectName));
	   
	   String CPN = confirmProjectName.getText();
	   System.out.println(CPN);
	   if(CPN.equals(PN)) {
		   
		   System.out.println("Project created Successfully");
	   }else {
		   
		   System.out.println("Project creation failed");
	   }
	   
	}
//Deactivate project==============================================================================================================================================================================	
	
	public void deactivate() throws InterruptedException {
		
		WebDriverWait wt1 = new WebDriverWait(ldriver, 10);
		
		confirmProjectName.click();
		
//		clickPhases.click();
//		
//		String phaseName = phasename.getText();
//		
//		wt1.until(ExpectedConditions.visibilityOf(clickDeactivate));
//		
//		clickDeactivate.click();
//		
//		Thread.sleep(3000);
//		wt1.until(ExpectedConditions.elementToBeClickable(okbutton));
//		okbutton.click();
//		
//		Thread.sleep(3000);
//		
//		wt1.until(ExpectedConditions.elementToBeClickable(confirmbutton));
//		confirmbutton.click();
//		
//		
//		wt1.until(ExpectedConditions.visibilityOf(phasemsg));
//		boolean Phasemsg = phasemsg.isDisplayed();
//	
//	
////	boolean PhaseName1 = phasename1.isDisplayed();
//	
//	if(Phasemsg == true) {
//		
//		System.out.println("Phase deacticvation Passed");
//		
//	}else {
//		
//		System.out.println("Phase deacticvation failed");
//	}
//	
	 String PN = txtProjectName.getText();
	   System.out.println(PN);
	   

	wt1.until(ExpectedConditions.visibilityOf(clickprojectDeactivate));
	
	clickprojectDeactivate.click();
	
	Thread.sleep(3000);
	wt1.until(ExpectedConditions.elementToBeClickable(prookbutton));
	prookbutton.click();
		
	Thread.sleep(3000);
	wt1.until(ExpectedConditions.elementToBeClickable(proconfirmbutton));
	proconfirmbutton.click();
	
	Thread.sleep(3000);
	   wt1.until(ExpectedConditions.visibilityOf(searchProject));
	   searchProject.sendKeys(PN);
	   searchProject.sendKeys(Keys.ENTER);
	   	
	 
	  try {
	   boolean cnfproject = confirmProjectName.isDisplayed();
		   if(cnfproject != true) {
			   
			   System.out.println("Project deactivated successfully");
		   }else {
			   System.out.println("project deactivation fail");
		   }
	  }catch(Exception e) {
		  
	  }
	}
}
