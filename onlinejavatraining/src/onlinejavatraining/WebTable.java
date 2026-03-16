package onlinejavatraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// launch the chrome browser instance
		WebDriver driver = new ChromeDriver();// since no url is pasted it is blank instance
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// open the url using get method
		driver.get("https://testautomationpractice.blogspot.com/");

		// create a list of all name
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr/td[1]"));
		System.out.println("total names :" + names.size());

		// create a list of CPU
		List<WebElement> Memorys = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr/td[4]"));
		System.out.println("total Memorys :" + Memorys.size());

		String expectedResult = "Internet Explorer";

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).getText().equalsIgnoreCase(expectedResult)) {
				System.out.println(names.get(i).getText() + "==" + Memorys.get(i).getText());
			}
		}



		Actions ac = new Actions(driver);
		WebElement table = driver.findElement(By.id("productTable"));
		ac.moveToElement(table).build().perform();
		List<WebElement> Pages = driver.findElements(By.xpath("//ul[@class='pagination']/li"));
		System.out.println("total number of pages : " + Pages.size());
		for (WebElement p : Pages) {
			p.click();
			List<WebElement> electroobj = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
			System.out.println(electroobj.size());
			String s = "Fitness Tracker";
			for (WebElement element : electroobj) {
				if (element.getText().equalsIgnoreCase(s)) {
					WebElement checkbox=driver.findElement(By.xpath("//td[text()='"+s+"']/following-sibling::td/input[@type='checkbox']"));
					checkbox.click();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					//a anchor tag is used to find links in the webpage
				}
			}
		}
	}

}