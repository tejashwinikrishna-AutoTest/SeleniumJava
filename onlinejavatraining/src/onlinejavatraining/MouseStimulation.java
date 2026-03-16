package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseStimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/account/login");
		Actions act=new Actions(driver);

		//create electronics web element ref
		WebElement electro=driver.findElement(By.xpath("//*[text()='Electronics']"));
		//mouse hover to electronics
		Thread.sleep(3000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Realme']")).click();

		//Keyboard operations
		WebElement men=driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men,Keys.ENTER).build().perform();


	}

}
