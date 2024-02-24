package testFiles.tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.BookingPage;
import PageObjects.LoginPage;
import testFiles.testcomponents.BaseTestForAll;

public class LoginPageTest extends BaseTestForAll {

	@Test(dataProvider = "getData")
	public void getlaunchApplication(HashMap<String, String> input) throws IOException, InterruptedException {
		launchapplication();
		page.getLogin(input.get("email"), input.get("password"));
		BookingPage bpage = new BookingPage(driver);
		bpage.getPurchaseProduct();

	}

	@DataProvider
	public Object[][] getData() {
		HashMap<String, String> max = new HashMap<String, String>();
		max.put("email", "katakatladurgaprasad@gmail.com");
		max.put("password", "Chinna5237");
		max.put("productName", "Blue Green");

		HashMap<String, String> max1 = new HashMap<String, String>();
		max1.put("email", "katakatladurgaprasad@gmail.com");
		max1.put("password", "Chinna5237");
		max1.put("productName", "Mint Green");

		return new Object[][] { { max }, { max1 } };
	}
}
