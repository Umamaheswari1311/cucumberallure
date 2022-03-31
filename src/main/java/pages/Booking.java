package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.BasePage;

public class Booking extends BasePage {
	//Page Factory - OR:
		
			@FindBy(xpath="//h1")
			WebElement Title;

			@FindBy(id="oneway")
			WebElement oneway;
			@FindBy(id="roundTrip")
			WebElement RoundTrip;
			public Booking(WebDriver driver){

		        this.driver = driver;
		        //This initElements method will create all WebElements
		        PageFactory.initElements(driver, this);

		    }
			
			public boolean checkPageTitle()
			{
				elementIsPresent(Title);
				return false;
			}
			
			public void click_Oneway()
			{
				elementClick(oneway);
			}
			public void click_RoundTrip()
			{
				elementClick(RoundTrip);
			}
	}


