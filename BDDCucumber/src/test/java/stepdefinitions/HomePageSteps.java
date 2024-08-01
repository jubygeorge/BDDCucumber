package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;

public class HomePageSteps {
	WebDriver driver = BaseClass.getDriver();
	HomePage hp;
	
	String ActualHomePageURL;
	String ExpectedHomePageURL;

	@Given("I am in the Luma HomePage")
	public void i_am_in_the_luma_home_page() {
		BaseClass.getLogger().info(" Home Page ");
		hp = new HomePage(driver);
		System.out.println("Home Page loaded");
	}

	@And("I verify the homepage url")
	public void i_verify_the_homepage_url() {
		ActualHomePageURL = hp.getHomePageURL();
		ExpectedHomePageURL = "https://magento.softwaretestingboard.com/";
		assertEquals(ActualHomePageURL, ExpectedHomePageURL);
	
	}

	@When("I click on Sign In link")
	public void i_click_on_sign_in_link() {

	}

	@And("I enter the email as {string} and password as {string}")
	public void i_enter_the_email_as_and_password_as(String string, String string2) {

	}

	@And("click on the SignIn button")
	public void click_on_the_sign_in_button() {

	}

	@Then("I will be logged into the application and I verify the Welcome message")
	public void i_will_be_logged_into_the_application_and_i_verify_the_welcome_message() {
	}

}
