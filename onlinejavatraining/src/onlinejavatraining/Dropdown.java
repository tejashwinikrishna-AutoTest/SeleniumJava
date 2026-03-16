package onlinejavatraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// launch the chrome browser instance
				WebDriver driver = new ChromeDriver();//since no url is pasted it is blank instance
				driver.manage().window().maximize();

				//open the url using get method
				driver.get("https://testautomationpractice.blogspot.com/");

				//1st Way
				Thread.sleep(2000);
				driver.findElement(By.id("country")).sendKeys("India");

				//2nd way
				Thread.sleep(2000);
				List<WebElement> countries=driver.findElements(By.xpath("//select[@id='country']/option"));
				System.out.println("Total countries :"+countries.size());
				countries.get(0).click();//US
				Thread.sleep(2000);
				countries.get(8).click();//Brazil

				//3rd way
				WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
				Select ctry=new Select(country);
				Thread.sleep(2000);
				ctry.selectByIndex(5);//Australia
				Thread.sleep(2000);
				ctry.selectByValue("china");
				Thread.sleep(2000);
				ctry.selectByVisibleText("India");

				//4th way
				List<WebElement> dropdown=ctry.getOptions();
				System.out.println("total dropdown  value :"+dropdown.size());
				for (WebElement element : dropdown) {
					if(element.getText().equalsIgnoreCase("Japan")) {
						element.click();
					}
				}

	}

}
