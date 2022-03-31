package stepDefinitions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Booking;




public class BaseTest {
public static WebDriver driver;
	public static Properties prop;
	public static String currentDir=System.getProperty("user.dir");
	private static final Logger log =Logger.getLogger(BaseTest.class);
	public Booking book;
	public BaseTest(){
		try {
			prop = new Properties();
			FileReader reader=new FileReader("config.properties");
			prop.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	
	public void initialization(){
		String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",currentDir+File.separator+"chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", currentDir+File.separator+"geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
		
	}
	
	
	
}
