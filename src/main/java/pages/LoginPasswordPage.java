package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPasswordPage extends BasePage{

	@FindBy(how = How.CSS, css = "#ap_password")
	private WebElement passwordInputField;
	@FindBy(how = How.CSS, css = "#signInSubmit")
	private WebElement signInButton;
	@FindBy(how = How.CSS, css = "#auth-warning-message-box")
	private WebElement warningMessageNotification;

	public LoginPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public void loginUsername(String password) {
		passwordInputField.sendKeys(password);
		signInButton.click();
	}
	
	public Boolean isNotificationMessageDisplayed() {
		return warningMessageNotification.isDisplayed();
	}
	

}
