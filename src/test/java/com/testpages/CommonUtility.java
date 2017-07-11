package com.testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author Khushboo Taneja
 *
 */
public class CommonUtility {

	WebDriver driver;
	
	public CommonUtility(WebDriver driver1) {
		this.driver = driver1;
	}
	
	@Given("^Go to \"([^\"]*)\"$")
	public void go_to(String url) throws Throwable {
		driver = new FirefoxDriver();
		driver.get(url);
	}

	@Given("^Maximize the window$")
	public void maximize_the_window() throws Throwable {
		driver.manage().window().maximize();
	}

	@Given("^Set the implicitly time$")
	public void set_the_implicitly_time() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	}


