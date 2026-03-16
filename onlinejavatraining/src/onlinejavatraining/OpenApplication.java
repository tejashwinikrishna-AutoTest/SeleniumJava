package onlinejavatraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		// set the property of chrome browser= webriver.chrome.driver and pass
		// chromedriver path=where chromedriver is present
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		// launch the chrome browser instance
		WebDriver driver = new ChromeDriver();//since no url is pasted it is blank instance
		driver.manage().window().maximize();

		//open the url using get method
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");

		//open the url using navigate method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");

		//refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();

		//navigate back to facebook
		Thread.sleep(2000);
		driver.navigate().back();

		//navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();

		//fetch the current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		//fetch the title of webpage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		//close the browser instance
		Thread.sleep(2000);
		driver.close();

	}

}
