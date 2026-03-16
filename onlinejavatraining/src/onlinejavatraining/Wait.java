package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// launch the chrome browser instance
				WebDriver driver = new ChromeDriver();//since no url is pasted it is blank instance
				driver.manage().window().maximize();

				//open the url using get method
				driver.get("https://testautomationpractice.blogspot.com/");

				//Thread.sleep(2000);//it will wait for 2 seconds -not recomended
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait only if the element is not located orelse it will execute without interruption
				driver.findElement(By.id("country")).sendKeys("India");

				//fetch dropdown input box attribute value
				System.out.println(driver.findElement(By.id("country")).getAttribute("value"));

				//Use explicit wait
				WebDriverWait wwait=new WebDriverWait(driver,60);
				wwait.until(ExpectedConditions.elementToBeClickable(By.id("country"))).sendKeys("Japan");




	}

}
