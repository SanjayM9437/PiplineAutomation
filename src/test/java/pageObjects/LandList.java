package pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
import org.testng.Assert;

public class LandList {
	
	
	WebDriver ldriver;
	
//	WebDriverWait wt = new WebDriverWait(ldriver,10);
	
	public LandList(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement linkLand;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[1]/ul/li[2]/a")
	@CacheLookup
	WebElement linklandlist;
	
	@FindBy(xpath="//button[contains(text(),' Go')]")
	@CacheLookup
	WebElement ClickGo;
	
	@FindBy(xpath="//button[contains(text(),'New Lot')]")
	@CacheLookup
	WebElement ClickNewLot;
	
//New Lot==========================================================================================================================================================================================	
	
	@FindBy(xpath="//*[@id=\"selectorland\"]")
	@CacheLookup
	WebElement txtLotName;
	
	@FindBy(xpath="//*[@id=\"selectorestate\"]")
	@CacheLookup
	WebElement LProdropdown;
	
	@FindBy(xpath="//*[@id=\"selectorstage\"]")
	@CacheLookup
	WebElement Lphasedropdown;
	
	@FindBy(xpath="//*[@id=\"selectordisplayprice\"]")
	@CacheLookup
	WebElement LdispPrice;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Clicksave;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOK;
// ADD Dimensions=================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"dimension-add-btn\"]")
	@CacheLookup
	WebElement ClickAddDimensions;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-4281411426462007773\"]")
	@CacheLookup
	WebElement TextLotArea;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-3152861426462007772\"]")
	@CacheLookup
	WebElement TextLotWidth;
	
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-7082201570511406114\"]")
	@CacheLookup
	WebElement TextLotGroup;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-4464371426462502322\"]")
	@CacheLookup
	WebElement ClickcornerLot;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-8461681564978873245\"]")
	@CacheLookup
	WebElement ClickrearLoad;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-2032861628666698408\"]")
	@CacheLookup
	WebElement ClicksignatureLot;
	
	@FindBy(xpath="//*[@id=\"c-add-bulk-edit-dimension\"]")
	@CacheLookup
	WebElement ClickADD;
	
//Add Lot Branches ===============================================================================================================================================================================
	
	@FindBy(xpath="//span[@id='branch-add']")
	@CacheLookup
	WebElement ClickAddLotBranches;
	
	@FindBy(xpath="//*[@id=\"clientcompanyid\"]")
	@CacheLookup
	WebElement Branchdropdown;
	
	@FindBy(xpath="//*[@id=\"c-save-branch\"]")
	@CacheLookup
	WebElement ClickAdd;
	
	@FindBy(xpath="//*[@id=\"c-cancel-branch\"]")
	@CacheLookup
	WebElement Clickcancel;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOKBranch;
//Dates===========================================================================================================================================================================================
	@FindBy(xpath="//span[@id='date-add-btn']")
	@CacheLookup
	WebElement ClickAddDates;
	
	@FindBy(xpath="//*[@id=\"eventtypename\"]")
	@CacheLookup
	WebElement EventDropdown;
	
	@FindBy(xpath="//*[@id=\"eventdatevalue\"]")
	@CacheLookup
	WebElement SelectDate;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-event\"]")
	@CacheLookup
	WebElement ClickAdddates;
	
	@FindBy(xpath="//*[@id=\"c-cancel-event\"]")
	@CacheLookup
	WebElement ClickCancelevent;
	
//	@FindBy(xpath="//*[@id=\"eventdatevalue-error\"]")
//	@CacheLookup
//	WebElement Eventerror;
	
//Lot Attacahement================================================================================================================================================================================	

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
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div")
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
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement proDocconfirmbtn;
	
	@FindBy(xpath="//*[@id=\"assetdropzonePreview\"]/div/div[3]")
	@CacheLookup
	WebElement progressbar;
	
	
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
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement proDripconfirmbtn;
	
//Lot search  and  Deactivate=====================================================================================================================================================================	
	
	@FindBy(xpath="//*[@id=\"ca-landproduct-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement LotNo;
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")
	@CacheLookup
	WebElement Landlist;
	
	@FindBy(xpath="//*[@id=\"c-land-filter-btn\"]")  
	@CacheLookup
	WebElement Goclick;
	
	@FindBy(xpath="/html[1]/body[1]/div[10]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/input[1]")
	@CacheLookup
	WebElement Searchbar;
	
	@FindBy(xpath="//*[@id]/td[2]/div/div")
	@CacheLookup
	WebElement Lotname1;
	
	
	@FindBy(xpath="//span[contains(text(),'Deactivate')]")
	@CacheLookup
	WebElement clickprojectDeactivate;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement prookbutton;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement proconfirmbutton;
	
	@FindBy(xpath="//*[@id=\"c-land-filter-btn\"]")
	@CacheLookup
	WebElement deacGO;
	
	@FindBy(xpath="//*[@id=\"landlisttable_filter\"]/label/input")
	@CacheLookup
	WebElement search2;
	
//Methods=========================================================================================================================================================================================
	public void clickLink()
	{
		linkLand.click();
	}

	public void clickLandListLink()
	{
		
		linklandlist.click();
	}
	
	public void clickGo()
	{
		
		ClickGo.click();
	}
	
	public void clickNewlot()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'New Lot')]")));
		ClickNewLot.click();
	}
	
	public void setLotName(String Lname)
	{
		txtLotName.sendKeys(Lname);
	}
	
	public void LotProjectDropdown() throws InterruptedException {
		
		Select drop = new Select(LProdropdown);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Sandbrock Ranch")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void LotPhaseDropdown() {
		
		
		Select phasedrop = new Select(Lphasedropdown);
	
	     phasedrop.selectByIndex(1);
	}
	
	public void setLotPrice(String Pvalue)
	{
		LdispPrice.sendKeys(Pvalue);
	}
	
	public void ClickSave()
	{
		Clicksave.click();
	}
	
	public void ClickOK()
	{
		ClickOK.click();
	}
	
	public void ClickAddDimension()
	{
		ClickAddDimensions.click();
	}
	
	public void SetLotArea(String LArea)
	{
		TextLotArea.sendKeys(LArea);
	}
	
	public void SetLotWidth(String LWidth)
	{
		TextLotWidth.sendKeys(LWidth);
	}
	
	public void SetLotGroup(String LGroup)
	{
		TextLotGroup.sendKeys(LGroup);
	}
	
public void CornerLot() {
		
		
		Select cornerlotdropdown = new Select(ClickcornerLot);
		cornerlotdropdown.selectByIndex(0);
	}

public void RearLoaded() {
	
	
	Select rearload = new Select(ClickrearLoad);
	rearload.selectByIndex(0);
}

public void SignatureLot() {
	
	
	Select signaturelot = new Select(ClicksignatureLot);
	signaturelot.selectByIndex(0);
}

public void ClickAdd()
{
	ClickADD.click();

	}
//Branch==========================================================================================================================================================================================
public void ClickAddlotbranch()
{
	 Actions builder = new Actions(ldriver);
     builder.moveToElement(ClickAddLotBranches).click(ClickAddLotBranches);
     builder.perform();
 

	}

public void Clickbranchdd()
{
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"clientcompanyid\"]")));
	Select rearload = new Select(Branchdropdown);
	rearload.selectByIndex(1);
	
	}

public void ClickAddbranch()
{
	ClickAdd.click();

	}

public void ClickCancel()
{
	Clickcancel.click();

	}

public void Clickokbranch()
{
	ClickOKBranch.click();

	}

//Dates===========================================================================================================================================================================================
public void ClickAdddates()

{
	 Actions builder = new Actions(ldriver);
     builder.moveToElement(ClickAddDates).click(ClickAddDates);
     builder.perform();
//	ClickAddDates.sendKeys(Keys.ENTER);

	}
public void selecteventtype()
{
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"eventtypename\"]")));
	Select eventtype = new Select(EventDropdown);
	eventtype.selectByIndex(1);

	}

public void setdate(String date)
{
	SelectDate.sendKeys(date);
	
	
	}

public void ClickonAddDate()
{
	ClickAdddates.click();
	
	}
//Lot Attachement=================================================================================================================================================================================
public void clickAddproimageButton()
{
	 Actions builder = new Actions(ldriver);
     builder.moveToElement(addProImagebtn).click(addProImagebtn);
     builder.perform();
	
//	addProImagebtn.click();
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
	 Actions builder = new Actions(ldriver);
     builder.moveToElement(addproVideobtn).click(addproVideobtn);
     builder.perform();
//	addproVideobtn.click();
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
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.elementToBeClickable(addproDocumenrtbtn));
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
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.visibilityOf(proDocconfirmbtn));
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

//Search and deactivate===========================================================================================================================================================================

public void searchanddeactivate() throws InterruptedException {
	
	String Lotnumber = LotNo.getText();
    System.out.println(Lotnumber);
	Landlist.click();
	
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.visibilityOf(ClickGo));
	ClickGo.click();
	
	 Thread.sleep(7000); 
	 
	 
	 Actions builder = new Actions(ldriver);
     builder.moveToElement(Searchbar).click(Searchbar);
     builder.perform();
	
//	wt.until(ExpectedConditions.elementToBeClickable(Searchbar));
	Searchbar.sendKeys(Lotnumber);
//	Searchbar.sendKeys(Keys.ENTER);
//	

	wt.until(ExpectedConditions.visibilityOf(Lotname1));
	String lotnumber1 = Lotname1.getText();
	
	if(lotnumber1.equals(Lotnumber)) {
		
		   System.out.println("Lot created Successfully");
	   }else {
		   
		   System.out.println("Lot creation failed");
		   Assert.assertTrue(false);
	   }
	
}
public void dectivate() throws InterruptedException {
	
	String parent = ldriver.getWindowHandle(); 
	Lotname1.click();
	String lotnumber2 = Lotname1.getText();
	
    
    Set<String> allWindows = ldriver.getWindowHandles();
   
   int count = allWindows.size();
   
  //System.out.println("Total window "+ count);
    
  for(String child:allWindows) {
  	
  	if(!parent.equalsIgnoreCase(child)) {
  		
             ldriver.switchTo().window(child);
             
             Thread.sleep(3000);
	
	WebDriverWait wt = new WebDriverWait(ldriver,10);
	wt.until(ExpectedConditions.visibilityOf(clickprojectDeactivate));
	
	clickprojectDeactivate.click();
	
	Thread.sleep(3000);
	wt.until(ExpectedConditions.elementToBeClickable(prookbutton));
	prookbutton.click();
		
	Thread.sleep(3000);
	wt.until(ExpectedConditions.elementToBeClickable(proconfirmbutton));
	proconfirmbutton.click();
	
	Thread.sleep(3000);

	wt.until(ExpectedConditions.visibilityOf(deacGO));
	deacGO.click();
	
	 Thread.sleep(7000); 
	 
	 
	 Actions builder1 = new Actions(ldriver);
     builder1.moveToElement(search2).click(search2);
     builder1.perform();
     
     search2.sendKeys(lotnumber2);
	   	   
 
// 	boolean norecord = driver.findElement(By.xpath("//*[@id=\"landlisttablebody\"]/tr/td")).isDisplayed();
// 	
// 	if(norecord==true) {
// 		
// 		   System.out.println("Package Deactivated Successfully");
// 	   }else {
// 		   
// 		   System.out.println("Package Deactivation failed");
// 		   Assert.assertTrue(false);
// 	   }  
 	}
}	  
	}
}	




