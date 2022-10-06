package POM_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import base_package.BaseHRMClass;

public class POM_HRapp extends BaseHRMClass{
	
	//object repository
	@FindBy(id="txtUsername") WebElement Username;//(driver.findElement(By.
	@FindBy(id="txtPassword") WebElement Password;
	@FindBy(id="btnLogin") WebElement Loginbtn;
	@FindBy(css="#menu_pim_viewMyDetails") WebElement Myinfo;
	@FindBy(linkText="Contact Details") WebElement Contactdetails;
	@FindBy(css="#contact-details > div:nth-child(2) > div.head > h1") WebElement Detailspage;
	@FindBy(css="#btnSave") WebElement Editbutton;
	@FindBy(css="#contact_street1") WebElement Address1;
	@FindBy(css="#contact_city") WebElement Cityname;
	@FindBy(css="#contact_province") WebElement Provincename;
	@FindBy(css="#contact_emp_zipcode") WebElement Zipcode;
	@FindBy(css="#contact_country") WebElement Countryname;
	@FindBy(css="#contact_emp_mobile") WebElement Mobilenumber;
	@FindBy(css="#contact_emp_work_email") WebElement Workemail;
	@FindBy(css="#btnSave") WebElement Savebutton;
	
	//initialize page elements
	
	public POM_HRapp() {
		
		PageFactory.initElements(driver,this);
	}
	
	
    public String Verify() {
		
		return driver.getTitle();
	}
	
	public void typeusername(String name,String pass) {
		
		Username.sendKeys(name);
		Password.sendKeys(pass);
		/*
		 * Loginbtn.click(); Thread.sleep(2000); Myinfo.click(); Contactdetails.click();
		 * Editbutton.click();
		 */
		
		}
		/*
		 * public void Details_page(String add,String city,String province,String
		 * zip,String country,String mob,String email){
		 * 
		 * WebDriverWait wait= new WebDriverWait(driver,100);
		 * wait.until(ExpectedConditions.visibilityOf(Address1));
		 * 
		 * Address1.sendKeys(add); Cityname.sendKeys(city);
		 * Provincename.sendKeys(province); Zipcode.sendKeys(zip);
		 * Countryname.sendKeys(country); Mobilenumber.sendKeys(mob);
		 * Workemail.sendKeys(email); Savebutton.click();
		 * 
		 * 
		 * 
		 * }
		 */
	
	

}
