package com.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Khushboo Taneja
 *
 */
public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver1) {
		this.driver = driver1;
	}

	By servicesHover = By.xpath("(//a[contains(text(),'Services')])[1]");
	
	By clickDigitalUser = By.xpath("(//a[@href ='/en/services/digital-user'][1])");
	
	
	
	public void hoverServices() throws InterruptedException {
		WebElement serviceHover = driver.findElement(servicesHover);
		Actions actions = new Actions(driver);
		actions.moveToElement(serviceHover);
		actions.build().perform();
		Thread.sleep(1000);
	}
	
	public void clickOnDigitalUser() {
		driver.findElement(clickDigitalUser).click();
	}

}
