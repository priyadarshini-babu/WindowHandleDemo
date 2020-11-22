package StepDefinitions;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTabsInSameWindow {

	WebDriver driver;
	String oldtab;

	@Before
	public void createConnection() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	@Given("User opens new tab")
	public void user_opens_new_tab() throws InterruptedException {
		driver.get("https://www.gmail.com");

		oldtab = driver.getWindowHandle();

		driver.findElement(By.linkText("Terms")).click();

	}

	@Then("User switchs back to previous opened tab")
	public void user_switchs_back_to_previous_opened_tab() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0).toString());

		//driver.switchTo().window(oldtab);
		driver.get("https://www.freecrm.com");

	}

	@After
	public void closeConnection() {
		driver.quit();
	}

}
