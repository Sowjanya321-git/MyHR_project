package testlayer;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_package.POM_HRapp;
import base_package.BaseHRMClass;

public class Test_class extends BaseHRMClass{
	POM_HRapp app;
	
	public Test_class() {
		
		super();
	}
	
	
	@BeforeClass
	
	public void Initsetup() {
		
		initiate();
		app=new POM_HRapp();
	}
	
	@Test(priority=1)
	
	public void Login() throws InterruptedException {
		
		String pagetitle=app.Verify();
		Assert.assertEquals(pagetitle, "OrangeHRM");
		app.Loginpage("Admin","admin123");
		
		
		
		}
	
	@Test(priority=2, dependsOnMethods= {"Login"})
	
	public void Details() throws InterruptedException {
		
		app.Details_page("236-gardens","Boston","Cali", "T2j0S7", "US", "8234565423", "");
		Thread.sleep(2000);
		
	}
	
	
	
	  @AfterClass
	  
	  public void Closepage() {
		    
			
	  driver.close();
	  
	  }
	 
	

}
