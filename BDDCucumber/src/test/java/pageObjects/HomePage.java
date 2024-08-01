package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;

public class HomePage  extends BaseClass {
	WebDriver driver;
	
	By lnkSignIn  = By.linkText("Sign In ");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageURL() {
		return driver.getCurrentUrl();
	}
}
