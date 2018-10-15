package pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginUsernamePage extends BasePage {
	 
	@FindBy(how = How.CSS, css = "#ap_email")
	private WebElement usernameInputField;
	@FindBy(how = How.CSS, css = "#continue")
	private WebElement usernameContinue;

	public LoginUsernamePage(WebDriver driver) {
	   super(driver);
	}
	 
	public LoginPasswordPage loginUsername(String username) {
		usernameInputField.sendKeys(username);
		usernameContinue.click();
		return new LoginPasswordPage(driver);
	}
}