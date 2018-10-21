package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

public class LoginStepDefs {
	
	WebDriver driver = new FirefoxDriver();
	BasePage basePage = new BasePage(driver);
	HomePage homePage;
	LoginPage loginUsernamePage;
	 
	@Given("^I am on site home page$")
	public void navigatingToHomePage() throws Throwable {
		homePage = basePage.navigateToHomePage();		
	}

	@Given("^I navigated to login page$")
	public void goToLoginPage() throws Throwable {
		loginUsernamePage = homePage.navigateToLoginPage();
	}

	
	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" on my account page and continue$")
	public void enterUserNameAndContinue(String username, String password) throws Throwable {
	    loginUsernamePage.loginUsername(username, password);	    
	}
	
	@Then("^I should see warning message$")
	public void isNotificationShown() throws Throwable {
		assertTrue(loginUsernamePage.isNotificationMessageDisplayed());
	}	
}
