package pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createpackage {
	
	WebDriver ldriver;
	
	public createpackage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(partialLinkText="House & La")
	@CacheLookup
	WebElement Houseandland;
	
	
	@FindBy(xpath="//a[contains(text(),'Create House & Land')]")
	@CacheLookup
	WebElement CreatePackage;
	
	@FindBy(xpath="//*[@id=\"filter-estate\"]")
	@CacheLookup
	WebElement Projectdropdown;
	
	@FindBy(xpath="//*[@id=\"filter-stage\"]")
	@CacheLookup
	WebElement Phasedropdown;
	
	@FindBy(xpath="//*[@id=\"filter-lot\"]")
	@CacheLookup
	WebElement Lotropdown;

	
	@FindBy(xpath="//*[@id=\"filter-plan\"]")
	@CacheLookup
	WebElement Plandropdown;
	
	@FindBy(xpath="//*[@id=\"c-more-filter\"]/div")
	@CacheLookup
	WebElement DownArrow;
	
	@FindBy(xpath="//*[@id=\"filter-facade\"]")
	@CacheLookup
	WebElement Elevation;
	
	@FindBy(xpath="//*[@id=\"c-handl-filter-btn\"]")
	@CacheLookup
	WebElement CP;
	
	@FindBy(xpath="/html/body/div[9]/div[7]/div/button")
	@CacheLookup
	WebElement Ok;
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	@CacheLookup
	WebElement SelectPackage;
	
	@FindBy(css="#ca-detail-edit-btn")
	@CacheLookup
	WebElement EditPackage;
	
//Image=======================================================================================================================================================================================
	
	@FindBy(xpath="//span[@id='images-add-btn']")
	@CacheLookup
	WebElement addProImagebtn;
	
	@FindBy(xpath="//input[@id='assetname']")
	@CacheLookup
	WebElement txtproImageName;
	
	@FindBy(xpath="//select[@id='assetsubtype']")
	@CacheLookup
	WebElement ProImgDropdown;
	
	@FindBy(xpath="//form[@id='assetdropzone']")
	@CacheLookup
	WebElement proUpasset;
	
	@FindBy(xpath="//button[@id='c-add-edit-asset']")
	@CacheLookup
	WebElement AddproImage;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement proimageconfirmbtn;
	
//Document====================================================================================================================================================================================
	
	@FindBy(xpath="//span[@id='documents-add-btn']")
	@CacheLookup
	WebElement addproDocumenrtbtn;
	
	@FindBy(xpath="//input[@id='assetname']")
	@CacheLookup
	WebElement txtproDocName;
	
	@FindBy(xpath="//select[@id='assetsubtype']")
	@CacheLookup
	WebElement proDocDropdown;
	
	@FindBy(xpath="//div[contains(text(),'Drop here or click')]")
	@CacheLookup
	WebElement UpproDoc;
	
	@FindBy(xpath="//button[@id='c-add-edit-asset']")
	@CacheLookup
	WebElement AddproDoc;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement proDocconfirmbtn;
	
	@FindBy(xpath="//*[@id=\"assetdropzonePreview\"]/div/div[3]")
	@CacheLookup
	WebElement progressbar;
	
	
	
//Methods======================================================================================================================================================================================
	
	
	public void clickLink()
	{
		Houseandland.click();
	}

	public void clickcreatepackage()
	{
		
		CreatePackage.click();
	}
	
	public void prodropdown() throws InterruptedException
	{
		
		Select drop = new Select(Projectdropdown);
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
	
	public void phasedropdown() throws InterruptedException
	{
		
		Select drop = new Select(Phasedropdown);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("1A")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void lotdropdown() throws InterruptedException
	{
		
		Select drop = new Select(Lotropdown);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("1A-F-10")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void plandropdown() throws InterruptedException
	{
		
		Select drop = new Select(Plandropdown);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Amberley - Amberley")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void clickdownarrow()
	{
		DownArrow.click();
	}
	
	public void elevationdropdown() throws InterruptedException
	{
		
		Select drop = new Select(Elevation);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("A")) {
			 
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	
	public void clickCP()
	{
		boolean sp = CP.isEnabled();
		if(sp==true) {
		CP.click();
		}else {
			
			System.out.println("Check the dropdowns ");
		}
	}
	
	public void clickOK()
	{
		Ok.click();
	}
	
	public void selectpackage() throws InterruptedException
	{	
		
		  String parent = ldriver.getWindowHandle(); 
		    SelectPackage.click();
		    
            Set<String> allWindows = ldriver.getWindowHandles();
            
            int count = allWindows.size();
            
           //System.out.println("Total window "+ count);
             
           for(String child:allWindows) {
           	
           	if(!parent.equalsIgnoreCase(child)) {
           		
                      ldriver.switchTo().window(child);
                      
                      Thread.sleep(3000);
//                      EditPackage.click();
                      break;
                      
	}
           }
	}
	
//	public void editpackage()
//	{
//		 Actions builder = new Actions(ldriver);
//	     builder.moveToElement(EditPackage).click(EditPackage);
//	     builder.perform();
////		EditPackage.click();
//	}
//Image=======================================================================================================================================================================================	
	public void clickAddproimageButton()
	{
		 Actions builder = new Actions(ldriver);
	     builder.moveToElement(addProImagebtn).click(addProImagebtn);
	     builder.perform();
		
//		 JavascriptExecutor js = (JavascriptExecutor) ldriver;
//			
////			WebDriverWait wt =  new WebDriverWait(ldriver,10);
////			wt.until(ExpectedConditions.visibilityOf(addproDocumenrtbtn));
//			 js.executeScript("arguments[0].scrollIntoView();", addProImagebtn);
//		
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
//Doc=========================================================================================================================================================================================
	
	public void clickAddprodocButton()
	{
		 JavascriptExecutor js = (JavascriptExecutor) ldriver;
		
//		WebDriverWait wt =  new WebDriverWait(ldriver,10);
//		wt.until(ExpectedConditions.visibilityOf(addproDocumenrtbtn));
		 js.executeScript("arguments[0].scrollIntoView();", addproDocumenrtbtn);
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

}
