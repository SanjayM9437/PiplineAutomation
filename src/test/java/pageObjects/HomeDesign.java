package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeDesign {
	
	WebDriver ldriver;
	
	public HomeDesign(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 

	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement linkHomes;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/ul/li[3]/a")
	@CacheLookup
	WebElement Design;
	
	@FindBy(xpath="//*[@id=\"c-newdesign-btn\"]")
	@CacheLookup
	WebElement ClickNewDesign;
	
	@FindBy(xpath="//*[@id=\"selectordesign\"]")
	@CacheLookup
	WebElement txtDesignName;
	
	@FindBy(xpath="//*[@id=\"selectorrange\"]")
	@CacheLookup
	WebElement Rangedd;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Clicksave;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOK;
	
	
	@FindBy(xpath="//*[@id=\"facades-add-btn\"]")
	@CacheLookup
	WebElement linkelevations;
	
	@FindBy(xpath="//*[@id=\"facadename\"]")
	@CacheLookup
	WebElement txtfacadeName;
	
	@FindBy(xpath="//*[@id=\"c-add-edit-facade\"]")
	@CacheLookup
	WebElement facadeADD;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement facadeOK;
	
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
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement proDocconfirmbtn;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement progressbar;
	
//Search Design================================================================================================================================================================================
	
	@FindBy(xpath="//*[@id=\"ca-homeproduct-detail-show\"]/tbody/tr[2]/td[2]")
	@CacheLookup
	WebElement DesignName;
	
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")
	@CacheLookup
	WebElement ckickdesign;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"design-container\"]/div[1]/div/div[2]")
	@CacheLookup
	WebElement designname1;
	
	@FindBy(xpath="//*[@id=\"c-home-design-deactivate\"]/span")
	@CacheLookup
	WebElement deactivate;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement Confirmbtn;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement Okbtn;
	
	@FindBy(xpath="//*[@id=\"filter-keyword\"]")
	@CacheLookup
	WebElement searchbar2;
	
	@FindBy(xpath="//*[@id=\"design-container\"]/div/div/div[2]")
	@CacheLookup
	WebElement deactvatedproject;
	
	
//Home Design Method============================================================================================================================================================================
	
	public void ClickHomes() {
		linkHomes.click();
	
		
	}
	
	public void ClickDesgin() {
		Design.click();
		
	}
	
	public void ClicknewDesgin() {
		ClickNewDesign.click();
		
	}
	
	public void DesignName(String RName) {
		txtDesignName.sendKeys(RName);
		
	}
	
	public void HomeBuilderDD() throws InterruptedException {
		
		Select drop = new Select(Rangedd);
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
	
	public void clickSave() {
		Clicksave.click();
		
	}
	
	public void ClickoK() {
		ClickOK.click();
		
	}
	
	public void AddElevation() {
		linkelevations.click();
	
		
	}
	
	public void FacadeName(String FName) {
		txtfacadeName.sendKeys(FName);
		
	}
	
	public void FacadeADD() {
		facadeADD.click();
		
	}
	
	public void FacadeOkbtn() {
		facadeOK.click();
		
	}
	
	
	
//Doc=========================================================================================================================================================================================
	
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
	
	//Search range=================================================================================================================================================================================
	
	 
		public void getDesign() throws InterruptedException
		{
			String dn = DesignName.getText();
//			System.out.println(rn);
			
			ckickdesign.click();
			
			Thread.sleep(3000);
			   
			   WebDriverWait wt1 = new WebDriverWait(ldriver,10);
			   wt1.until(ExpectedConditions.visibilityOf(searchbar));
			   searchbar.sendKeys(dn);
			   searchbar.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(3000);
			
//			   wt1.until(ExpectedConditions.visibilityOf(confirmProjectName));
			   
			   String CPN = designname1.getText();
//			   System.out.println(CPN);
			   if(CPN.equals(dn)) {
				   
				   System.out.println("Design created Successfully");
			   }else {
				   
				   System.out.println("Design creation failed");
			   }
			   
			   
			   designname1.click();
			   
			   Thread.sleep(3000);
			   deactivate.click();
			   
			   Thread.sleep(3000);
			   Confirmbtn.click();
			   
			   Thread.sleep(3000);
			   Okbtn.click();
			   
			   Thread.sleep(3000);
			   
			   wt1.until(ExpectedConditions.visibilityOf(searchbar2));
			   searchbar2.sendKeys(dn);
			   searchbar2.sendKeys(Keys.ENTER);
			   
			   boolean CPN1 = deactvatedproject.isDisplayed();
			   //			   System.out.println(CPN);
			   if(CPN1!=true) {
				   
				   System.out.println("Design deactivate Successfully");
			   }else {
				   
				   System.out.println("Design deactivation failed");
			   }
			   
			}
}
