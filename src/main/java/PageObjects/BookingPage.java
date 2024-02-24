package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	WebDriver driver;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBar;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchButton;

	@FindBy(xpath = "//img[@alt='Lava Hero 600+ (Blue Green), Auto Call Recording, FM Recording, Keypad Mobile, Basic Mobile']")
	WebElement clickProduct;

	@FindBy(xpath = "//li[contains(@class,'dimension-value-list-item')]")
	List<WebElement> listOfColours;

	@FindBy(id = "buy-now-button")
	WebElement buyNow;

	public void getPurchaseProduct() throws InterruptedException {
		String d = "Mint Green";

		searchBar.sendKeys("lava hero 600 plus");
		searchButton.click();
		Thread.sleep(5000); clickProduct.click();
		for (WebElement one : listOfColours) {

			if (one.getText().equalsIgnoreCase("Mint Green")) {
				one.click();
				break;
			}

		}
		buyNow.click();

	}

}
