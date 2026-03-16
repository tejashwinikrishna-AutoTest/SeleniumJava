package onlinejavatraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// launch the chrome browser instance
				WebDriver driver = new ChromeDriver();//since no url is pasted it is blank instance
				driver.manage().window().maximize();

				//open the url using get method
				driver.get("https://testautomationpractice.blogspot.com/");

				Thread.sleep(2000);
				Actions ac=new Actions(driver);
				WebElement gender=driver.findElement(By.xpath("//label[text()='Gender:']"));
				ac.moveToElement(gender).build().perform();


				//1st way of checkbok or radio button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[text()='Male']")).click();

				Thread.sleep(2000);
				List<WebElement> genderlist=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']"));
				System.out.println("total list size : "+genderlist.size());
				String expectresult="Saturday";
				for (WebElement element : genderlist) {
					if(element.getText().equalsIgnoreCase(expectresult)) {
						element.click();
					}
				}

	}

}
