package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

WebDriver ldriver;
	
	public DropDown(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	} 
	


	@FindBy(xpath="//*[@id=\"navbar\"]/div/div/ul/li[6]/a")
	@CacheLookup
	WebElement ClickExternalAgents;
	
	@FindBy(xpath="//*[@id=\"filter-state\"]")
	@CacheLookup
	WebElement State;
	
	@FindBy(xpath="//*[@id=\"filter-companytype\"]")
	@CacheLookup
	WebElement Companytype;
	
	@FindBy(xpath="//*[@id=\"filter-status\"]")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath="//*[@id=\"c-externalagents-filter-btn\"]")
	@CacheLookup
	WebElement clickGO;
	
	@FindBy(xpath="//*[@id]/div/div[2]/span")
	@CacheLookup
	WebElement getagent;
	
//methods==========================================================================================================================================================================================
	


public void ExtAgent() {
	ClickExternalAgents.click();
	
}
	
	public void companytype() throws InterruptedException {
		
		Select drop = new Select(Companytype);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Home Builder")) {
			
			 dropdown .get(i).click();

			 break; 
		 }

		 }
		 

		 
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void state() throws InterruptedException {
		
		Select drop = new Select(State);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Alabama")) {
			 
			String statename = dropdown.get(i).getText();
			 dropdown .get(i).click();

			 break; 
		 }
		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void status() throws InterruptedException {
		
		Select drop = new Select(Status);
		List<WebElement> dropdown=drop.getOptions();

		 for(int i=0;i<dropdown.size();i++){
//
//		 String drop_down_values=dropdown.get(i).getText();
//            System.out.println("dropdown values are "+drop_down_values);
		 if(dropdown.get(i).getText().equals("Inactive")) {
			 
			 String statusname = dropdown.get(i).getText();
			 dropdown .get(i).click();

			 break; 
		 }

		 }
//		drop.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void ClickGO() {
		clickGO.click();
		
	}
	
	public void GetAgent() {
		getagent.click();
		
	}
	
}
