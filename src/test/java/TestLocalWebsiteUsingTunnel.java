package test.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLocalWebsiteUsingTunnel {

	WebDriver driver = null;
	String user_name = System.getenv("LT_USERNAME") == null ? "<lambdatest_username>" : System.getenv("LT_USERNAME");
	String access_key = System.getenv("LT_ACCESS_KEY") == null ? "<lambdatest_accesskey>"
			: System.getenv("LT_ACCESS_KEY");

	@BeforeTest
	public void testSetUp() throws Exception {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("108.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", user_name);
		ltOptions.put("accessKey", access_key);
		ltOptions.put("project", "Local Website Testing using Selenium JAVA");
		ltOptions.put("build", "Local Website Testing");
		ltOptions.put("tunnel", true);
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);

		try {
			driver = new RemoteWebDriver(
					new URL("https://" + user_name + ":" + access_key + "@hub.LambdaTest.com/wd/hub"), browserOptions);
		} catch (MalformedURLException exc) {
			exc.printStackTrace();
		}
	}

	@Test(description = "Demonstration of Automated Local Website Testing using LambdaTest Tunnel")
	public void testLocalWebsite() throws InterruptedException {
		driver.get("https://localhost");
		driver.findElement(By.cssSelector("[for='cb1']")).click();
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
