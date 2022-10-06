package testlayer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_package.POM_HRapp;
import base_package.BaseHRMClass;
import testdata.Excelsheet;

public class Test_class extends BaseHRMClass{
	POM_HRapp app;
	
	public Test_class() {
		
		super();
	}
	
	
	@BeforeMethod
	
	public void Initsetup() {
		
		initiate();
		screenshots("Login");
		app=new POM_HRapp();
	}
	
	  
	 
@Test(priority=1)
	
	public void Title() {
		
		String pagetitle=app.Verify();
        System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "OrangeHRM");
		
		
		
		}


@DataProvider
public Object [][] ReadData() throws EncryptedDocumentException, IOException{ 
	  Object[][] result=Excelsheet.readdata("Sheet1"); 
	  return result;
}

	@Test(priority=2, dataProvider="ReadData")
	public void Login(String name,String pass) {
		
		app.typeusername(name, pass);
	}
	
		/*
		 * @Test(priority=2, dependsOnMethods= {"Login"})
		 * 
		 * public void Details() throws InterruptedException {
		 * 
		 * app.Details_page("236-gardens","Boston","Cali", "T2j0S7", "US", "8234565423",
		 * "");
		 * 
		 * 
		 * }
		 */
	
	
	  @AfterMethod
	  
	  public void Closepage() {
		    
			
	  driver.close();
	  
	  }
	 
	

}
