package onlinejavatraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		//find the total number of frames present on web page
		int allFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrames);

		for(int i=0;i<allFrames;i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String exptext="Open Paytm App";
			String acttext=driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if(acttext.equalsIgnoreCase(exptext)) {
				System.out.println("element found");
				break;
			}
			else {
				System.out.println("element not found");
			}
		}



	}

}
