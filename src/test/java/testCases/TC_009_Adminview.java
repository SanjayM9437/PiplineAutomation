package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPortal;
import pageObjects.LoginPage;

public class TC_009_Adminview extends BaseClass{
	String Newregion = "funcTest";
	
	@Test
	public void AdminView() throws IOException, InterruptedException {
		
		
		LoginPage lp=new LoginPage(driver);
		AdminPortal AP = new AdminPortal(driver);
		
		
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
	   
//	   Thread.sleep(3000);
//	   AP.Editdetail();
//	   logger.info("Clicked on edit");
//	   
////	   String companyname = randomestring();
////	   AP.CompanyName(companyname);
//	   
//	   AP.StateDD();
//	   Thread.sleep(3000);
//	   
//	   AP.ClickSave();
//	   
//	   try {
//    		
//    		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"companyname-error\"]")).isDisplayed();
////    		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
//		    if(errmsg==true) {
//		    	logger.info("fill the mandatory fields");
//		    	captureScreen(driver,"Mycompany");
//				Assert.assertTrue(false);
//	    	
//	    	
//	    }
//    		 
//    		
//    	}catch(Exception e) {
//    		
//    	}
////Branch==========================================================================================================================================================================================	   
//	   Thread.sleep(3000);
//	   AP.ClickAddBranch();
//	   
//	   Thread.sleep(3000);
//	   String branchname = randomestring();
//	   AP.AddBranchName(branchname);
//	   
//	   Thread.sleep(3000);
//	   String streetname = randomestring();
//	    AP.Addstreet(streetname);
//	   
//	    Thread.sleep(3000);
//	    String suburbname = randomestring(); 
//	    AP.Addsuburb(suburbname);
//	    
//	    Thread.sleep(3000);
//	    AP.Addstate();
//	    
//	    Thread.sleep(3000);
//	    AP.Addpostcode("12345");
//	   
//	    Thread.sleep(3000);
//	    AP.Officetype();
//	    
//	    Thread.sleep(3000);
//	    AP.ClickSavebranch();
//
//	    
//	    try {
//	 		
//	 		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"branchname-error\"]")).isDisplayed();
////	 		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
//		    if(errmsg==true) {
//		    	captureScreen(driver,"Branch");
//				Assert.assertTrue(false);
//	    	logger.info("fill the mandatory fields");
//	    	
//	    }
//	 		 
//	 		
//	 	}catch(Exception e) {
//	 		
//	 	} 
//	    logger.info("Branch added successfully");
//	    
////Location=============================================================================================================================================================================================	    
// 
//	    AP.AddLocatipn();
//	    
////	    String rehionname = randomestring();
//	    AP.locName(this.Newregion);
//	    Thread.sleep(3000);
//	    
//	    String contactnumber = randomeNum8();
//	    AP.contact(contactnumber);
//	    
//	    Thread.sleep(3000);
//	    String Streetname = randomestring();
//	    AP.Street(Streetname);
//	    
//	    Thread.sleep(3000);
//	    String Suburbname = randomestring();
//	    AP.Suburb(Suburbname); 
//	    
//	    Thread.sleep(3000);
//	    AP.State();
//	    
//	    Thread.sleep(3000);
//	    AP.postcode("12345");
//	    
//	    Thread.sleep(3000);
//	    AP.clickLocationSave();
//	    
//	    try {
//	 		
//	 		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"locationname-error\"]")).isDisplayed();
////	 		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
//		    if(errmsg==true) {
//		    	captureScreen(driver,"Branch");
//				Assert.assertTrue(false);
//	    	logger.info("fill the mandatory fields");
//	    	
//	    }
//	 		 
//	 		
//	 	}catch(Exception e) {
//	 		
//	 	}  
//	    logger.info("Location Added successfully");
	}	    
//	  
//@Test(priority=2,dependsOnMethods="AdminView")
//public void EditLocation() throws InterruptedException {
//		
//		AdminPortal AP = new AdminPortal(driver);
//		
//	    AP.AddLocatipn();
//	    
//	    AP.loccheckbox();
//	    String Locname = randomestring();
//	    AP.locName(Locname);
//	    Thread.sleep(3000);
//	    
//	    String contactnumber = randomeNum8();
//	    AP.contact(contactnumber);
//	    
//	    Thread.sleep(3000);
//	    String Streetname = randomestring();
//	    AP.Street(Streetname);
//	    
//	    Thread.sleep(3000);
//	    String Suburbname = randomestring();
//	    AP.Suburb(Suburbname); 
//	    
//	    Thread.sleep(3000);
//	    AP.State();
//	    
//	    Thread.sleep(3000);
//	    AP.postcode("12345");
//	    
//	    AP.Regiondd();
//		 
//		 AP.EditexistingLocation();
//		 
//		    try {
//		 		
//		 		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"locationname-error\"]")).isDisplayed();
////		 		boolean errmsg1 = driver.findElement(By.xpath("//*[@id=\"selectorplan-error\"]")).isDisplayed();
//			    if(errmsg==true) {
//			    	captureScreen(driver,"Branch");
//					Assert.assertTrue(false);
//		    	logger.info("fill the mandatory fields");
//		    	
//		    }
//		 		 
//		 		
//		 	}catch(Exception e) {
//		 		
//		 	} 
//		    logger.info("Location edited successfully"); 
//	}
////LegalContent====================================================================================================================================================================================
//	
//	@Test(priority=3,dependsOnMethods="AdminView")
//	public void LegalContent() throws IOException, InterruptedException {
//		
//		AdminPortal AP = new AdminPortal(driver);
//		
//		AP.EditLoginMsg();
//		
//		Thread.sleep(3000);
//		String Text = "Login Message";
//		AP.AddloginMessage(Text);
//		
//		Thread.sleep(3000);
//		AP.SaveLoginMsg();
//		
//		Thread.sleep(3000);
//	String Text1 = driver.findElement(By.xpath("//*[@id=\"ca-branding-lm-view\"]/span")).getText();
//	logger.info(Text1);
//		if(Text1.contains(Text)){
//			
//			logger.info("Login message added successfully");
//		}else {
//			
//			logger.info("No Login Message added");
//			captureScreen(driver,"legalcontent");
//			Assert.assertTrue(false);
//		}
//		
////		Thread.sleep(3000);
////		AP.EditTC();
////		
////		Thread.sleep(3000);
////		String Text2 = "Terms and Conditions";
////		AP.AddTCMessage(Text2);
////		
////		Thread.sleep(3000);
////		AP.CAncelTCMsg();
////		
////		String Text3 = driver.findElement(By.xpath("//*[@id=\"ca-branding-ltandc-view\"]/span")).getText();
////		if(Text1.contains(Text2)){
////			
////			logger.info(" TC message added successfully");
////		}else {
////			
////			logger.info("No TC Message added");
////			captureScreen(driver,"legalcontent");
////			Assert.assertTrue(false);
////		}
//		
//		
//}
	
		    
////Add User========================================================================================================================================================================================	   

@Test(priority=4,dependsOnMethods="AdminView")
public void AddUsers() throws InterruptedException, IOException {
	
	
	AdminPortal AP = new AdminPortal(driver);
		   AP.ADDUsers();
	   
//	   String UserEmail = randomeemail();
//	   AP.Emailusers(UserEmail + "@" + "runway.com");
//	   
//	   AP.BranchDD();
//	   
//	   AP.ADDroles();
//	   
//	   
//	   Thread.sleep(3000);
//	   AP.selectroles();
//	   Thread.sleep(3000);
//	  AP.SendInvitation();
	   
	   AP.GetUsers();
	   AP.Clickgo();
//	   
	   AP.EditUsersdetails();
	   
//	   String usernname = randomestring();
//	   AP.EditUsersname(usernname);
	   
	   AP.EditStatedd();
	   
	   AP.ClickEditsave();
	   try {
    		
    		boolean errmsg = driver.findElement(By.xpath("//*[@id=\"contactfirstname-error\"]")).isDisplayed();
    	
		    if(errmsg==true) {
		    	captureScreen(driver,"Design");
				Assert.assertTrue(false);
	    	logger.info("fill the mandatory fields");
	    	
	    }
    		 
    		
    	}catch(Exception e) {
    		
    	}
	   
	   AP.ClickOK();
	   
       AP.editbranch();
	   
	   AP.Selectcheckbox();
	   
	   AP.ClickRolesave();
	    
	   AP.ClickRoleOK();
	     Thread.sleep(3000);
	     
	   String username =  driver.findElement(By.xpath("//*[@id=\"ca-user-detail-show\"]/tbody/tr[1]/td[2]")).getText();
	   
	   
	   AP.Duser(); 
	   Thread.sleep(3000);
	   AP.Yes();
	   
	   Thread.sleep(3000);
	   AP.ok();
	   
	   AP.StatuDDDD();
	   
//	   Thread.sleep(5000);
//	   AP.ClickGO();
//	   
	   Thread.sleep(5000);
	   WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"filter-keyword\"]"));
	   searchbar.sendKeys(username);
	   
	   searchbar.sendKeys(Keys.ENTER);
	   
  
	   String username1 =  driver.findElement(By.xpath("//*[@id=\"user-dashboard-div\"]/div/div/div[3]/div/strong")).getText();
	   if(username1.contains(username)) {
		   
		   logger.info("User Deactivated Successfully");
	   }else {
		   captureScreen(driver,"AdminView");
			Assert.assertTrue(false);
		   logger.info("User Deactivated Failed");
	   }	   	   
	   }
	
	@Test(priority=5,dependsOnMethods="AdminView")
	public void  ActivateUser() throws InterruptedException, IOException {
		
		AdminPortal AP = new AdminPortal(driver);
		
		AP.clickDuser();
		
		String username =  driver.findElement(By.xpath("//*[@id=\"ca-user-detail-show\"]/tbody/tr[1]/td[2]")).getText();
		
		Thread.sleep(3000);
		AP.ActivateUser();
		
		Thread.sleep(3000);
		AP.Yesa();
		
		Thread.sleep(3000);
		AP.OKa();
		
		 Thread.sleep(5000);
		   WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"filter-keyword\"]"));
		   searchbar.sendKeys(username);
		   
		   searchbar.sendKeys(Keys.ENTER);
		
		   String username1 =  driver.findElement(By.xpath("//*[@id=\"user-dashboard-div\"]/div/div/div[2]/div/strong")).getText();
		   if(username1.contains(username)) {
			   
			   logger.info("User Activated Successfully");
		   }else {
			   
			   captureScreen(driver,"ActivateUser");
				Assert.assertTrue(false);
			   logger.info("User Activation Failed");
		   }
	}
//	
//	@Test(priority=6,dependsOnMethods="AdminView")
//	public void Resetpassword() throws IOException, InterruptedException {
//		
//		AdminPortal AP = new AdminPortal(driver);
//		
//		AP.ClickActive();
//		
//		Thread.sleep(3000);
//		AP.Resetpassword();
//		
//		AP.Newpassword("");//Welcome123
//		
//		AP.Confirmpassword("");//Welcome123
//		
//	    AP.Updaetpswd();
//	    
//	    boolean errormsg = driver.findElement(By.xpath("//*[@id=\"new-password-error\"]")).isDisplayed();
//	    boolean errormsg1 = driver.findElement(By.xpath("//*[@id=\"confirm-password-error\"]")).isDisplayed();
//		
//	    if(errormsg == true || errormsg1 == true ) {
//	    	
//	    	 logger.info("passwrod reset unsuccessfully");
//	    	 captureScreen(driver,"ResetPassword");
//				Assert.assertTrue(false);
//	 	  
//		   }else {
//			   
//			   logger.info("password reset successfull");
//		   }
//	    	
//	    }
	


}
	
	

