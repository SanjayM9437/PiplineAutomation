package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

public class HomeList {
	
WebDriver ldriver;
	
	public HomeList(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement linkHomes;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[3]/ul/li[4]/a")
	@CacheLookup
	WebElement homelist;
	
	@FindBy(xpath="//*[@id=\"c-home-filter-btn\"]")
	@CacheLookup
	WebElement ClickGo;
	
	@FindBy(xpath="//*[@id=\"c-newplan-btn\"]")
	@CacheLookup
	WebElement Clicknewplan;
	
	@FindBy(xpath="//*[@id=\"selectorrange\"]")
	@CacheLookup
	WebElement Rangedd;
	
	@FindBy(xpath="//*[@id=\"selectordesign\"]")
	@CacheLookup
	WebElement DesignDD;
	
	@FindBy(xpath="//*[@id=\"selectorplan\"]")
	@CacheLookup
	WebElement planname;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Clicksave;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOK;
	
	@FindBy(xpath="//*[@id=\"dimension-add-btn\"]")
	@CacheLookup
	WebElement ClickAddDimension;
	
	@FindBy(xpath="//*[@id=\"dimensionvalue-1017451426464774786\"]")
	@CacheLookup
	WebElement AddDimensionvalue;
	
	@FindBy(xpath="//*[@id=\"c-add-bulk-edit-dimension\"]")
	@CacheLookup
	WebElement Adddimension;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement dimensionconfirmbtn;
	
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
	
	@FindBy(xpath="//*[@id=\"assetdropzonePreview\"]/div/div[3]")
	@CacheLookup
	WebElement progressbar;

//Search project==================================================================================================================================================================================
	@FindBy(xpath="//*[@id=\"ca-homeproduct-detail-show\"]/tbody/tr[4]/td[2]")
	@CacheLookup
	WebElement planName;
	
	
	@FindBy(xpath="//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")
	@CacheLookup
	WebElement ckickhomelist;
	
	@FindBy(xpath="//*[@id=\"homelisttable_filter\"]/label/input")
	@CacheLookup
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id]/tr/td[2]/div/div")
	@CacheLookup
	WebElement planname1;
	
	@FindBy(xpath="//*[@id=\"c-home-plan-deactivate\"]")
	@CacheLookup
	WebElement deactivate;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement Confirmbtn;
	
	@FindBy(xpath="/html/body/div[11]/div[7]/div/button")
	@CacheLookup
	WebElement Okbtn;
	
	@FindBy(xpath="//*[@id=\"homelisttable_filter\"]/label/input")
	@CacheLookup
	WebElement searchbar2;
	
	@FindBy(xpath="//*[@id=\"homelisttablebody\"]/tr/td")
	@CacheLookup
	WebElement deactvatedplan;
	
	@FindBy(xpath="//button[contains(text(),'Go')]")
	@CacheLookup
	WebElement deactvatedgo;
	
//Methods=========================================================================================================================================================================================
	
	public void ClickHomes() {
		linkHomes.click();
	
		
	}
	
	public void clickhomelist() {
		homelist.click();
	
		
	}
	
	public void clicknewplan() {
		Clicknewplan.click();
	
		
	}
	public void RangeDD() throws InterruptedException {
		
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
	
	public void DesignDD() throws InterruptedException {
		
		Select drop = new Select(DesignDD);
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
	
	public void PlanName(String pName) {
		planname.sendKeys(pName);
		
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
		
		 
		public void getPlan() throws InterruptedException
		{
			String pn = planName.getText();
//			System.out.println(rn);
			
			ckickhomelist.click();
			
			Thread.sleep(3000);
			
			ClickGo.click();
			
			Thread.sleep(5000);
			
			   WebDriverWait wt1 = new WebDriverWait(ldriver,10);
			   wt1.until(ExpectedConditions.visibilityOf(searchbar));
			   searchbar.sendKeys(pn);
			   searchbar.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(3000);
			
//			   wt1.until(ExpectedConditions.visibilityOf(confirmProjectName));
			   
			   String CPN = planname1.getText();
//			   System.out.println(CPN);
			   if(CPN.equals(pn)) {
				   
				   System.out.println("HomePlan created Successfully");
			   }else {
				   
				   System.out.println("Homeplan creation failed");
			   }
			   
			   
//			   planname1.click();
			   
               String parent = ldriver.getWindowHandle(); 
               planname1.click();
               
             Thread.sleep(5000);
              
//             ldriver.findElement(By.xpath("//a[contains(text(),'Print')]")).click();
             
             
              Set<String> allWindows = ldriver.getWindowHandles();
             
             int count = allWindows.size();
             
            //System.out.println("Total window "+ count);
              
            for(String child:allWindows) {
            	
            	if(!parent.equalsIgnoreCase(child)) {
            		
                       ldriver.switchTo().window(child);
                       
                       Thread.sleep(3000);
            	   

        			   wt1.until(ExpectedConditions.visibilityOf(deactivate)); 
        			   deactivate.click();
        			   
        			   Thread.sleep(3000);
        			   Confirmbtn.click();
        			   
        			   Thread.sleep(3000);
        			   Okbtn.click();
        			   
//        			   wt1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"c-home-filter-btn\"]")));
//        			   ClickGo.click();
        			   
        			 
        			   Thread.sleep(3000);
        			   deactvatedgo.click();
        				  
        			   
        			   Thread.sleep(10000);
        			   
        			   wt1.until(ExpectedConditions.visibilityOf(searchbar2));
        			   searchbar2.clear();
        			   searchbar2.sendKeys(pn);
        			   searchbar2.sendKeys(Keys.ENTER);
        			   
        			   boolean CPN1 = deactvatedplan.isDisplayed();
        			   //			   System.out.println(CPN);
        			   if(CPN1==true) {
        				   
        				   System.out.println("Plan deactivate Successfully");
        			   }else {
        				   
        				   System.out.println("Plan deactivation failed");
        			   }
                       // driver.close();
            	
            	}
            }
			   
			
			   
			}
}

	
	
	
	
	

	
	

