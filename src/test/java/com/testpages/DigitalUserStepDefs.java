package com.testpages;

import org.openqa.selenium.WebDriver;

import com.objectpages.DigitalUser;
import com.objectpages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Khushboo Taneja
 *
 */
public class DigitalUserStepDefs {

	
private HomePage homePage;
	
	private WebDriver driver;
	
	private DigitalUser digitalUser;

	
	@Given("^Keep the mouse on services heading$")
	public void keep_the_mouse_on_services_heading() throws Throwable {
		homePage = new HomePage(driver);
		homePage.hoverServices();
	}
	
	@When("^I click on digital user$")
	public void i_click_on_digital_user() throws Throwable {
		homePage = new HomePage(driver);
		homePage.clickOnDigitalUser();
	}
	
	@Then("^Verify the Title of digital user page$")
	public String verify_the_Title_of_digital_user_page() throws Throwable {
			String title = driver.getTitle();
			return title;
		}
}
