package testFiles.testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;

public class BaseTestForAll {
	public WebDriver driver;
	Properties prop;
	FileInputStream fis;
	public LoginPage page;

	public WebDriver intitilizeTheDriver() throws IOException {

		prop = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\katak\\eclipse-workspace\\SEcomerceApplication\\src\\main\\java\\SEcomerceApplication\\Abastarctcomponents\\Global.Properties");
		prop.load(fis);
		String k = prop.getProperty("browser");

		if (k.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\katak\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;

	}

	public LoginPage launchapplication() throws IOException {
		driver = intitilizeTheDriver();
		page = new LoginPage(driver);
		page.goTo();
		return page;
		
		
	}
}
