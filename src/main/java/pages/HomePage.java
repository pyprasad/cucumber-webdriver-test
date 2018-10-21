package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	 
	@FindBy(how = How.CSS, css="#nav-signin-tooltip > a")
	private WebElement loginButton;
	@FindBy(how = How.CSS, css="#nav-link-yourAccount > span.nav-line-2")
	private WebElement yourAccount;
	
	public HomePage (WebDriver driver) {
	      super(driver);
	 }
	
	 public void verifyLogin(String loginName) {
		WebDriverWait wait = new WebDriverWait(driver, 10); // check home page
		wait.until(ExpectedConditions.visibilityOf(loginButton));
	}
	
	public LoginPage navigateToLoginPage() {
		Boolean isLoginButtonDisplayed = loginButton.isDisplayed(); 
		if (isLoginButtonDisplayed) {
			loginButton.click();			
		} else {
			yourAccount.click();
		}
		return new LoginPage(driver);
	} 
}