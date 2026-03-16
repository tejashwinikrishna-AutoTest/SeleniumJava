package onlinejavatraining;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		//Step 1-Tab Handling
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindowsId=driver.getWindowHandles();
		System.out.println(allWindowsId);

		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		for(String ab:allWindowsId) {
			driver.switchTo().window(ab);
			if(ab.equalsIgnoreCase(parentWindowId)) {
				System.out.println(driver.getTitle());
			}
			else {
				System.out.println(driver.getCurrentUrl());
			}
		}

		driver.close();
	}

}
