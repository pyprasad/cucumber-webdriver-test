package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
		 
	public HomePage navigateToHomePage() {
		driver.navigate().to("https://www.amazon.co.uk");
		driver.manage().window().maximize(); 
		return new HomePage(driver); 
	}
 
}