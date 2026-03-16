package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	WebDriver driver;

	@Test
	public void doLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		driver = new ChromeDriver();

		t1.driver = driver; // ⭐ IMPORTANT LINE

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("wrong_id")).click(); // intentional failure
	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {

		t1.captureScreenshot(result2);

	}

}