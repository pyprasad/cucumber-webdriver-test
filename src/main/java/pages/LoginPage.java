package pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage extends BasePage {
	 
	@FindBy(how = How.ID, id = "ap_email")
	private WebElement usernameInputField;
	
	@FindBy(how = How.ID, id = "ap_password")
	private WebElement passwordInputField;
	
	@FindBy(how = How.ID, id = "signInSubmit")
	private WebElement signInButton;
	
	@FindBy(how = How.ID, id = "auth-warning-message-box")
	private WebElement warningMessageNotification;
	
	public LoginPage(WebDriver driver) {
	   super(driver);
	}
	 
	public void loginUsername(String username, String password) {
		usernameInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		signInButton.click();
	}
	
	public Boolean isNotificationMessageDisplayed() {
		return warningMessageNotification.isDisplayed();
	}
}