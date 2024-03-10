package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;

	String url = "https://www.fb.com";//from dev1 & from dev2
	
	@BeforeTest
	public void setup() {
		//open the browser here
		driver = new ChromeDriver();//opens the chrome browser
		
		//open the url
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		//close the browser
		driver.quit();
	}

}
