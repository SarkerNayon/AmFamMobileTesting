package stepDefinations;

import org.openqa.selenium.WebDriver;

import com.pages.CovidResource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	WebDriver driver = BaseClass.driver;
	CovidResource cResource = new CovidResource(driver);

	@Given("user on Santander.com home page")
	public void user_on_santander_com_home_page() {
		System.out.println(driver.getTitle());
	}

	@When("user click on learn about Covid19 resource")
	public void user_click_on_learn_about_covid19_resource() {
		// cResource.getResposed.click();
		cResource.covidResponseButton(driver);
	}

	@When("user click on Branch locator")
	public void user_click_on_branch_locator() {
		cResource.scrDown(driver);
		cResource.atmLocator.click();
	}

	@When("user click on filter")
	public void user_click_on_filter() {
		// cResource.alrtHandle(driver);
		cResource.filter.click();
	}

	@When("user select location type branch")
	public void user_select_location_type_branch() {
		cResource.branch.click();
	}

	@When("user click close filter")
	public void user_click_close_filter() {
		cResource.close.click();
	}

	@When("user typed their zip code")
	public void user_typed_their_zip_code() {
		cResource.searchBox.click();
		cResource.searchBox.sendKeys("10007");
	}

	@Then("user should see some location on the map")
	public void user_should_see_some_location_on_the_map() {
	}
}
