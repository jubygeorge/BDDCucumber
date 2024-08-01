package pageObjects;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;

public class HomePage  extends BaseClass {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageURL() {
		return driver.getCurrentUrl();
	}
}
