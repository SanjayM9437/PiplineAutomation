package testCases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPortal;
import pageObjects.ExternalAgents;
import pageObjects.LoginPage;

public class TC_011_ExtAgent extends BaseClass{
	
	String User;
	
	@Test
	public void ExtAgents() throws IOException, InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		AdminPortal AP = new AdminPortal(driver);
		ExternalAgents EA = new ExternalAgents(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("PIPELINE SALES REP"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		AP.Clickmodeswitch();
		AP.Selectview();
		
	   String pagetitle = driver.getTitle();
	       
	   if(pagetitle.equalsIgnoreCase("PIPELINE ADMIN")) {
		   
		   logger.info("Admin View");
		   
	   }else {
		   
		   logger.info("Not admin View");
		   captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
	   }
	   
	   EA.clickextagent();
	   
	   EA.Listview();
	   boolean button = driver.findElement(By.xpath("//*[@id=\"extagentsdetialtable_length\"]")).isDisplayed();
	   
	   if(button == true) {
		   
		   logger.info("list view");
		   
	   }else {
		   
		   logger.info("grid view");
	   }
	   
	   EA.CreateNew();
	   
	   WebElement project = driver.findElement(By.xpath("//*[@id=\"project-display\"]"));
	   project.click();
	   
	   Thread.sleep(2000);
	   boolean errorpop = driver.findElement(By.xpath("/html/body/div[9]/h2")).isDisplayed();
	   if(errorpop == true) {
		   
		   logger.info("Please save the details first");
		   driver.findElement(By.xpath("/html/body/div[9]/div[7]/div/button")).click();
	   }else {
		   
		   
	   }
	   
	   Thread.sleep(2000);
	   String extName = randomestring();
	   EA.Name(extName);
	   
	   Thread.sleep(2000);
	   String strtname = randomestring();
	   EA.street(strtname);
	   
	   Thread.sleep(2000);
	   String suname = randomestring();
	   EA.suburb(suname);
	   
	   Thread.sleep(2000);
	   EA.state();
	   
	   Thread.sleep(2000);
	   EA.postcode("12345");
	   
	   Thread.sleep(2000);
	   EA.companytype();
	   
	   Thread.sleep(2000);
	   EA.officetype();
	   
	   Thread.sleep(2000);
	   EA.savedetails();
	   
	   try {
   		
   		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"companyname-error\"]")).isDisplayed();
//   		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
		    if(errmsg==true) {
		    	logger.info("fill the mandatory fields");
		    	captureScreen(driver,"ExtAgent");
				Assert.assertTrue(false);
	    	
	    	
	    }
   		 
   		
   	}catch(Exception e) {
   		
   	}
	   
	   logger.info("ExtAgent Created");
	   
	}
	
@Test(priority=2,dependsOnMethods="ExtAgents")	
public void ADDAttachements() throws InterruptedException {
	
	
	ExternalAgents EA = PageFactory.initElements(driver, ExternalAgents.class);
	
	 Thread.sleep(2000);
	EA.Adduserss();
	
	 Thread.sleep(2000);
	String email = randomestring();
    EA.email(email + "@" + "runway.com");
    
    Thread.sleep(2000);
    EA.AddRole();
    
    Thread.sleep(2000);
    String Firstn = randomestring();
    EA.firsname(Firstn);
    
    Thread.sleep(2000);
    String lastnm = randomestring();
    EA.lastname(lastnm); 
    
    Thread.sleep(2000);
    String mob = randomeNum8();
    EA.mobile(mob);
    
    Thread.sleep(2000);
    EA.clickSave();
    
	   try {
	   		
	   		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"userEmail-error\"]")).isDisplayed();
//	   		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
			    if(errmsg==true) {
			    	logger.info("fill the mandatory fields");
			    	captureScreen(driver,"ExtAgent");
					Assert.assertTrue(false);
		    	
		    	
		    }
	   		 
	   		
	   	}catch(Exception e) {
	   		
	   	}
	   
	   Thread.sleep(2000);
	   EA.ClickOK();
	   
	   this.User = driver.findElement(By.xpath("//*[@id=\"ca-company-detail-show\"]/tbody/tr[1]/td[2]")).getText();
	   
	   Thread.sleep(2000);
	   EA.Clickmodeswitch();
	   
	   Thread.sleep(2000);
	   EA.Selectview();
	   
	   Thread.sleep(2000);
	   EA.clickLink();
	   
	   Thread.sleep(2000);
	   EA.clickLandListLink();
	   
	   Thread.sleep(2000);
	   EA.Status();
	   
	   Thread.sleep(2000);
	   EA.clickGo();
	   
	   Thread.sleep(2000);
	   EA.selectbox();
	   
	   Thread.sleep(2000);
	   EA.Actions();
	   
	   WebElement search = driver.findElement(By.xpath("//*[@id=\"jqac-include-partners\"]"));
	   search.sendKeys(User);
	  
	   Thread.sleep(2000);
	   EA.clickagent();
	   Thread.sleep(2000);
	   EA.publish();
	   
	   Thread.sleep(2000);
	   EA.okpublish();
	   
	   driver.navigate().refresh();
	   
//	   Thread.sleep(2000);
//	   EA.Clickmodeswitch();
//	   
//	   Thread.sleep(2000);
//	   EA.Selectview2();
//	   
//	   Thread.sleep(2000);
//	   EA.clickextagent();
//	   
//	   Thread.sleep(2000);
//	   search.sendKeys(User);
//	   search.sendKeys(Keys.ENTER);
}

@Test(priority=3,dependsOnMethods="ExtAgents")
public void AddProject() throws IOException, InterruptedException {
	

	AdminPortal AP = new AdminPortal(driver);
	ExternalAgents EA = new ExternalAgents(driver);
	
	AP.Clickmodeswitch();
	AP.Selectview();
	
   String pagetitle = driver.getTitle();
       
   if(pagetitle.equalsIgnoreCase("PIPELINE ADMIN")) {
	   
	   logger.info("Admin View");
	   
   }else {
	   
	   logger.info("Not admin View");
	   captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		
   }
   
   EA.clickextagent();
   
   
   logger.info(this.User);
   
   EA.SearchAgent1(this.User);
  
   Thread.sleep(2000);
   EA.AgentName();
   
   Thread.sleep(5000);
   driver.navigate().refresh();
   
}
  @Test(priority=4,dependsOnMethods="ExtAgents") 
  public void Deactivate() throws InterruptedException {
	  
	  ExternalAgents EA = new ExternalAgents(driver);
	  Thread.sleep(2000);
	EA.Deactivate();
	
	Thread.sleep(2000);
	EA.yes();
	
	Thread.sleep(2000);
	EA.ok();
	  String btntext = driver.findElement(By.xpath("//button[contains(text(),'Activate')]")).getText();
	  if(btntext.contains("Activate")) {
		  
		  logger.info("Deactivated successfully");
	  }else {
		  
		  logger.info("Decativation unsucessfull");
	  }
	  
	  Thread.sleep(2000);
	  EA.inactUser();
	  
	  

	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header-breadcrumb\"]/div[1]/ol/li[2]/a")).click();
}
  
//  @Test(priority=5,dependsOnMethods="ExtAgents") 
//  public void EditAgentDetails() throws InterruptedException {
//	  
//	  ExternalAgents EA = new ExternalAgents(driver);
//	  
//	  Thread.sleep(2000);
//	  EA.clickestagent();
//	  
//	  Thread.sleep(2000);
//	  EA.editagent();
//	  
//	  String btntext = driver.findElement(By.xpath("//*[@id=\"ca-company-detail-show\"]/tbody/tr[1]/td[2]")).getText();
//	  
//	  Thread.sleep(2000);
//	  String Firstn = randomestring();
//	  EA.EdtName(Firstn);
//	  
//	  Thread.sleep(2000);
//	  EA.Savedet();
//	  
//	  Thread.sleep(3000);
//	  String btntext1 = driver.findElement(By.xpath("//*[@id=\"ca-company-detail-show\"]/tbody/tr[1]/td[2]")).getText();
//	  
//	  if(btntext1!=btntext) {
//		  
//		  logger.info("Agent details Edited successfully");
//	  }else {
//		  logger.info("Agent details Editing process failed");
//	  }
//	  
//	 
//	  
//  }
  

	  
	 	  
  }

