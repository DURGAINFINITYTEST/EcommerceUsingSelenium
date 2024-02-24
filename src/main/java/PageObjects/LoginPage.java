package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement login;

	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(id = "continue")
	WebElement conti;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement submit;

	public void getLogin(String mail, String pswd) {
		login.click();
		email.sendKeys(mail);
		conti.click();
		password.sendKeys(pswd);
		submit.click();
		// TODO Auto-generated method stub

	}

	public LoginPage goTo() {
		driver.get("https://www.amazon.in/");
		LoginPage page = new LoginPage(driver);
		return page;

	}

}
