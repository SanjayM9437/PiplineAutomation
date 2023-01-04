package pageObjects;

import java.util.List;

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

public class Homes {
	
	WebDriver ldriver;
	
	public Homes(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement linkHomes;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/ul/li[2]/a")
	@CacheLookup
	WebElement linkRanges;
	
	@FindBy(xpath="//*[@id=\"c-newrange-btn\"]")
	@CacheLookup
	WebElement ClickNewRange;
	
	@FindBy(xpath="//*[@id=\"selectorrange\"]")
	@CacheLookup
	WebElement txtRangeName;
	
	@FindBy(xpath="//*[@id=\"selectorowner\"]")
	@CacheLookup
	WebElement BuilderDD;
	
	@FindBy(xpath="//*[@id=\"selectorbranch\"]")
	@CacheLookup
	WebElement BranchDD;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Clicksave;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOK;
	
	@FindBy(xpath="//*[@id=\"ca-detail-edit-btn\"]")
	@CacheLookup
	WebElement Clickedit;
	
	@FindBy(xpath="//*[@id=\"ca-homeproduct-detail-show\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement rangename;
	
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")
	@CacheLookup
	WebElement ckickrange;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"range-container\"]/div[1]/div/div[2]")
	@CacheLookup
	WebElement rangename1;
	
//Sales Rep===================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"salesrep-add\"]")
	@CacheLookup
	WebElement ClickAddSalesRep;
	
	@FindBy(xpath="//*[@id=\"salesrepid\"]")
	@CacheLookup
	WebElement Contactdropdown;
	
	@FindBy(xpath="//*[@id=\"c-save-salesrep\"]")
	@CacheLookup
	WebElement ClickAdd;
	
	@FindBy(xpath="//*[@id=\"c-cancel-salesrep\"]")
	@CacheLookup
	WebElement Clickcancel;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOKcontact;
	
	
//Image=======================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"images-add-btn\"]")
	@CacheLookup
	WebElement addProImagebtn;
	
	@FindBy(xpath="//*[@id=\"assetname\"]")
	@CacheLookup
	WebElement txtproImageName;
	
	@FindBy(xpath="//*[@id=\"assetsubtype\"]")
	@CacheLookup
	WebElement ProImgDropdown;
	
	@FindBy(xpath="//*[@id=\"assetdropzone\"]")
	@CacheLookup
	WebElement proUpasset;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-asset\"]")
	@CacheLookup
	WebElement AddproImage;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement proimageconfirmbtn;
	
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
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement progressbar;

//Gallery=====================================================================================================================================================================================
	@FindBy(xpath="//*[@id=\"gallery-add-btn\"]")
	@CacheLookup
	WebElement addgaltbtn;
	
	@FindBy(xpath="//*[@id=\"galleryname\"]")
	@CacheLookup
	WebElement txtgalName;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-gallery\"]")
	@CacheLookup
	WebElement Addgal;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement galconfirmbtn;
	
	
//Methods======================================================================================================================================================================================
	
	public void clickHomes()
	{
		linkHomes.click();
	}

	public void clickRanges()
	{
		
		linkRanges.click();
	}
	
	public void clickNewRanges()
	{
		
		ClickNewRange.click();
	}
	
	public void setrangeName(String Rname)
	{
		txtRangeName.sendKeys(Rname);
	}
	
	public void HomeBuilderDD() throws InterruptedException {
		
		Select drop = new Select(BuilderDD);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Coventry Homes")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void HomeBranchDD() throws InterruptedException {
		
		Select drop = new Select(BranchDD);
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
	
	public void clickSave()
	{
		Clicksave.click();
	}
	
	public void clickOK()
	{
		ClickOK.click();
	}
	
	public void clickEdit()
	{
		Clickedit.click();
	}
	
//Sales Rep===================================================================================================================================================================================
	
	public void ClickAddlotbranch()
	{
		 Actions builder = new Actions(ldriver);
	     builder.moveToElement(ClickAddSalesRep).click(ClickAddSalesRep);
	     builder.perform();
	 

		}

	public void Clickbranchdd()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"salesrepid\"]")));
		Select rearload = new Select(Contactdropdown);
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
		ClickOKcontact.click();

		}
//Image=======================================================================================================================================================================================
	
	public void clickAddproimageButton()
	{
		 Actions builder = new Actions(ldriver);
	     builder.moveToElement(addProImagebtn).click(addProImagebtn);
	     builder.perform();
		
//		addProImagebtn.click();
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
	
//Gallery=====================================================================================================================================================================================
	
	public void clickAddgalButton()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.elementToBeClickable(addgaltbtn));
		addgaltbtn.click();
	}

	public void setgalName(String gname)
	{
		txtgalName.sendKeys(gname);
	}
	
	public void clickaddgal()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.invisibilityOf(progressbar));
		Addgal.click();
	}

	public void clickConfirmgal()
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.visibilityOf(galconfirmbtn));
		galconfirmbtn.click();
	}

//Edit====================================================================================================================================================================================
	
//	public void EditRange() {
//		
//		Clickedit.click();
//	}
//	
//	public void setnewrangeName(String Rname)
//	{
//		txtRangeName.sendKeys(Rname);
//	}
//	
//	public void HomenewBuilderDD() throws InterruptedException {
//		
//		Select drop = new Select(BuilderDD);
//		List<WebElement> dropdown=drop.getOptions();
//
//		 for(int i=0;i<dropdown.size();i++){
////
////		 String drop_down_values=dropdown.get(i).getText();
////            System.out.println("dropdown values are "+drop_down_values);
//		 if(dropdown.get(i).getText().equals("Highland Homes")) {
//			 
//			 dropdown .get(i).click();
//
//			 break; 
//		 }
//
//		 }
////		drop.selectByIndex(1);
//		Thread.sleep(3000);
//	}
//	
//	public void HomenewBranchDD() throws InterruptedException {
//		
//		Select drop = new Select(BranchDD);
//		List<WebElement> dropdown=drop.getOptions();
//
//		 for(int i=0;i<dropdown.size();i++){
////
////		 String drop_down_values=dropdown.get(i).getText();
////            System.out.println("dropdown values are "+drop_down_values);
//		 if(dropdown.get(i).getText().equals("Sandbrock Ranch")) {
//			 
//			 dropdown .get(i).click();
//
//			 break; 
//		 }
//
//		 }
////		drop.selectByIndex(1);
//		Thread.sleep(3000);
//	}
//	
//	public void clicknewSave()
//	{
//		Clicksave.click();
//	}
//	
//	public void clicknewOK()
//	{
//		ClickOK.click();
//	}
	
//Search range=================================================================================================================================================================================
	
	 
	public void getRange() throws InterruptedException
	{
		String rn = rangename.getText();
//		System.out.println(rn);
		
		ckickrange.click();
		
		Thread.sleep(3000);
		   
		   WebDriverWait wt1 = new WebDriverWait(ldriver,10);
		   wt1.until(ExpectedConditions.visibilityOf(searchbar));
		   searchbar.sendKeys(rn);
		   searchbar.sendKeys(Keys.ENTER);
		   
		   Thread.sleep(3000);
		
//		   wt1.until(ExpectedConditions.visibilityOf(confirmProjectName));
		   
		   String CPN = rangename1.getText();
//		   System.out.println(CPN);
		   if(CPN.equals(rn)) {
			   
			   System.out.println("Ranges created Successfully");
		   }else {
			   
			   System.out.println("Ranges creation failed");
		   }
		   
		   
		   rangename1.click();
		   
		   
		   
		}
	
	//Deactivate================================================
	
	@FindBy(xpath="//*[@id=\"c-home-range-deactivate\"]/span")
	@CacheLookup
	WebElement Deactivate;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement Yes;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement OK;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement search2;
	
public void deactivate() throws InterruptedException {
	
	WebDriverWait wt1 = new WebDriverWait(ldriver,10);
	
	
String rangename = ldriver.findElement(By.xpath("//*[@id=\"ca-homeproduct-detail-show\"]/tbody/tr[1]/td[2]")).getText();
	
Thread.sleep(3000);
Deactivate.click();
	
Thread.sleep(3000);
	   wt1.until(ExpectedConditions.visibilityOf(Yes));
	Yes.click();
		 
}

}
	
	
	
	
	








