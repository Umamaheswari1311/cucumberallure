package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	public static WebDriver driver;

	public void elementClick(WebElement ele)
	{	
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));			
		    ele.click();	
	}	
	public boolean elementIsPresent(WebElement ele)
	{	
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele) );
			
		    	if(ele.isDisplayed())
		    	{
		    		return true;
		    	}
		    	else
		    	{
		    		return false;
		    	}
		    		
	}
}
