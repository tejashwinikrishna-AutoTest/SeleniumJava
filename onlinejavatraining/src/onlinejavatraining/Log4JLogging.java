package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {

		//create a logger instance
		Logger logger=Logger.getLogger("Log4JLogging");

		//Configur log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\Tejaswini\\eclipse-workspace\\onlinejavatraining\\src\\onlinejavatraining\\log4j.properties");

		//Open Browser Instance
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("Open Browser Instance");

		//Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		//Launch Application
		driver.get("https://www.facebook.com/");
		logger.info("Application launched");

		//check if the web element is displayed or not
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("Web element found");
		} catch (Exception e) {

			logger.info("Web Element Not Found");
		}
		
	}

}
