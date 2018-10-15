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
	LoginUsernamePage loginUsernamePage;
	LoginPasswordPage loginPasswordPage;
	 
	@Given("^I am on site home page$")
	public void navigatingToHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage = basePage.navigateToHomePage();		
	}

	@Given("^I navigated to login page$")
	public void goToLoginPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginUsernamePage = homePage.navigateToLoginPage();
	}

	@When("^I enter \"([^\"]*)\" on my account page$")
	public void enterUserNameAndContinue(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPasswordPage = loginUsernamePage.loginUsername(username);	    
	}

	@When("^I enter \"([^\"]*)\" on signin page$")
	public void enterPasswordAndContinue(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPasswordPage.loginUsername(password);
	}

	@Then("^I should see warning message$")
	public void isNotificationShown() throws Throwable {
		assertTrue(loginPasswordPage.isNotificationMessageDisplayed());
	}


	
}
