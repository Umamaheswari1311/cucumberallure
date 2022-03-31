package stepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.Booking;

public class BookingStepdefenition extends BaseTest {
	private static final Logger log =Logger.getLogger(BookingStepdefenition.class);

	@Given("^Open browser$")
	public void open_browser() throws Throwable {
	  log.info("Open browser");
	  initialization();
	}

	@When("^Launch the url$")
	public void launch_the_url() throws Throwable {
		  log.info("Launch the url");
		driver.get(prop.getProperty("url"));
		
	}

	@Then("^Verfiy the goibibo Title$")
	public void verfiy_the_goibibo_Title() throws Throwable {
	 
	 Assert.assertTrue(book.checkPageTitle());
	}
	
	@Then("^click one way trip$")
	public void click_one_way_trip() throws Throwable {
		book=new Booking(driver);
		log.info("click one way trip");
		book.click_RoundTrip();
		//scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
	}


}
