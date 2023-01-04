package pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HouseLandList {
	
	WebDriver ldriver;
	
	public HouseLandList(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(partialLinkText="House & La")
	@CacheLookup
	WebElement Houseandland;
	
	
	@FindBy(xpath="//a[contains(text(),' House & Land List ')]")
	@CacheLookup
	WebElement Houseandlandlist;
	
	@FindBy(xpath="//*[@id=\"filter-estate\"]")
	@CacheLookup
	WebElement Projectdropdown;
	
	
	@FindBy(xpath="//*[@id=\"c-handl-filter-btn\"]")
	@CacheLookup
	WebElement ClickGo;
	
	
	@FindBy(xpath="//td[contains(text(),'200 - 200')]")
	@CacheLookup
	WebElement Clickpackage;
	
	@FindBy(xpath="//*[@id=\"ca-detail-edit-btn\"]/i")
	@CacheLookup
	WebElement ClickonEDit;
	
	@FindBy(xpath="//*[@id=\"displayprice\"]")
	@CacheLookup
	WebElement displayprice;
	
	@FindBy(xpath="//*[@id=\"ca-detail-save-btn\"]")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	@CacheLookup
	WebElement ClickonOK;

//Methods==========================================================================================================================================================================================
	
	public void clickLink()
	{
		Houseandland.click();
	}

	public void clickhouselandLink()
	{
		
		Houseandlandlist.click();
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
	
	public void clickGo()
	{
		
		ClickGo.click();
	}
	
	public void clickpackage() throws InterruptedException
	{
		WebDriverWait wt = new WebDriverWait(ldriver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'200 - 200')]")));
		
	
	
    String parent = ldriver.getWindowHandle(); 
    Clickpackage.click();
    
  Thread.sleep(5000);
   
//  ldriver.findElement(By.xpath("//a[contains(text(),'Print')]")).click();
  
  
   Set<String> allWindows = ldriver.getWindowHandles();
  
  int count = allWindows.size();
  
 //System.out.println("Total window "+ count);
   
 for(String child:allWindows) {
 	
 	if(!parent.equalsIgnoreCase(child)) {
 		
            ldriver.switchTo().window(child);
            
            Thread.sleep(3000);
            
            wt.until(ExpectedConditions.visibilityOf(ClickonEDit));
         	ClickonEDit.click();
         	
         	displayprice.sendKeys("678906");
         	
         	Save.click();
 	}



 	
 }
	}
}
