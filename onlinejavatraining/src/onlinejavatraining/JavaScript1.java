package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		//Delete all cookies
		driver.manage().deleteAllCookies();

		//JavascriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor) driver;

		//locate webelement using JavascriptExecutor
		//instead driver.findElement we use documnet.getElement and instead of sendkeys we use value
		jse.executeScript("document.getElementsByName('email')[0].value='tejashwinisuhas08@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='tejashwinisuhas08'");
		jse.executeScript("document.getElementByName('login')[0].click()");

		//scroll down using
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");

		//scrolll up using javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");

		//todo copy the jse actions from vamsi programs




	}

}
