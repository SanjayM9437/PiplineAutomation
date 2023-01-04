package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPortal;
import pageObjects.LoginPage;
import pageObjects.Permissions;

public class TC_010_Permissions extends BaseClass{
	
	@Test()
	public void permissions() throws InterruptedException, IOException {
		
		LoginPage lp=new LoginPage(driver);
		AdminPortal AP = new AdminPortal(driver);
		Permissions p = new Permissions(driver);
		
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
	   
	   p.ClickPermission();
	   
//	   Thread.sleep(2000);
//	   p.AddRole();
//	   Thread.sleep(2000);
//	   p.NewROle("Test Role");
//	   Thread.sleep(2000);
//	   
//	   p.SaveRole();
//	   
//		try {
//			
//			
//			boolean errormsg = driver.findElement(By.xpath("//*[@id=\"c-roleedit-1038001609751702619\"]/div[1]/div/label")).isDisplayed();
//			
//			if(errormsg==true) {
//				 logger.info("fill the mandatory fileds");
//				 captureScreen(driver,"Roles");
//					Assert.assertTrue(false);
//				 
//			}
//		}catch(Exception e) {
//			
//		}
//	   
//	   p.ClickOK();
//	   Thread.sleep(3000);
//	    
//	   WebElement t=driver.findElement(By.xpath("//*[@id=\"jq-autoadd-newinput-panel\"]"));
//	      //identify child nodes with ./child::* expression in xpath
//	      List<WebElement> c = t.findElements(By.xpath("./child::*"));
//	      // iterate child nodes
//	      for ( WebElement i : c ) {
//	      //getText() to get text for child nodes
////	      System.out.println(i.getText());
//	      if(i.getText().contains("Test Role")) {
//	    	  
//	    	  logger.info("Role Added successfully");
//	    	
//	    	  
//	      }
//	      }
	}
	
@Test(priority=2,dependsOnMethods="permissions") 	
public void editrole() throws InterruptedException {
	
	Permissions p = new Permissions(driver);
	
	   WebElement t=driver.findElement(By.xpath("//*[@id=\"jq-autoadd-newinput-panel\"]"));
	      //identify child nodes with ./child::* expression in xpath
	      List<WebElement> c = t.findElements(By.xpath("./child::*"));
	      // iterate child nodes
	      for ( WebElement i : c ) {
	      //getText() to get text for child nodes
//	      System.out.println(i.getText());
	      if(i.getText().contains("Test Role")) {
	    	  
	    	  Thread.sleep(3000);
	    	  p.Editrole();
	    	  
	    	  Thread.sleep(3000);
	    	  p.NEDitROle("Test Role3");
	    	
	    	  
	    	  Thread.sleep(3000);
	    	  p.saveEditrole();
	    	  
	    	  Thread.sleep(3000);
	    	  p.OKRole();
	    	  logger.info("Role edited successfully");
	    	  
	      }
	      }
}

@Test(priority=3,dependsOnMethods="permissions")    
public void DeleteRole() throws InterruptedException {
	
	Permissions p = new Permissions(driver);
	
		   WebElement t1=driver.findElement(By.xpath("//*[@id=\"jq-autoadd-newinput-panel\"]"));
		      //identify child nodes with ./child::* expression in xpath
		      List<WebElement> c1 = t1.findElements(By.xpath("./child::*"));
		      // iterate child nodes
		      for ( WebElement i1 : c1 ) {
		      //getText() to get text for child nodes
//		      System.out.println(i1.getText());
		      if(i1.getText().contains("Test Role3")) {
		    	 

		    	  Thread.sleep(3000);
		    	  p.DeleteRole();
		    	  
		    	  Thread.sleep(3000);
		    	  p.Yes();
		    	  
		    	  boolean successpop = driver.findElement(By.xpath("/html/body/div[9]/h2")).isDisplayed();
		    	  if(successpop!=true) {
		    		  
		    		  logger.info("Role deleted successfully");
		    		  Thread.sleep(3000);
			    	  p.OKRole();
		    	  }
		    	  
		      }else {
		    	  
		    	  logger.info("Not able to delete");
		      }
		           
	   }
}


}	  
		
	



