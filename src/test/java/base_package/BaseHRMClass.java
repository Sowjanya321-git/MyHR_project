package base_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseHRMClass {
	
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	//Step 1 write the constructor of the class
	public BaseHRMClass()  {
		
		try {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sowjanya\\eclipse-workspace\\HRManagement\\src\\test\\java\\Environment_variables\\Config.properties");
	    prop.load(file);
		}
		
		catch(FileNotFoundException e){
			
			e.printStackTrace();
			
		}
		catch(IOException a) {
			a.printStackTrace();
		}
		
}
	
	public static void initiate() {
		
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("Firefox")) {
			 
			System.setProperty("webdriver.gecodriver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void screenshots(String Filename) {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Sowjanya\\eclipse-workspace\\HRManagement\\src\\test\\java\\screenshots\\Screenshots"+Filename+".jpg"));
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		

		
		
	}
   
}
