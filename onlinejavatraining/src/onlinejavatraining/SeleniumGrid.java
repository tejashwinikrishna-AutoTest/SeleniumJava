package onlinejavatraining;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	@DataProvider(parallel=true)//responsible to run the test in parallel when we deal with 
	public Object[][] sendData(){
		Object arr[][]=new Object[2][2];
		
		arr[0][0]="Email_1";
		arr[0][1]="chrome";
		
		arr[1][0]="Email_2";
		arr[1][1]="chrome";
		
		return arr;
	}
	
	@Test(dataProvider="sendData")
	public void login(String username,String browserName) throws Exception {
		//desired capabilities is used to tell selenium grid what kind of browser or env we want  to run the test on
		DesiredCapabilities cap=null;// declared the desiredCapabilities to null
		if(browserName.equalsIgnoreCase("chrome")){
		cap=DesiredCapabilities.chrome();//we are creating chromebrowser capabilities
		cap.setBrowserName("chrome");//setting browser name as chrome with capabilities
		cap.setPlatform(Platform.ANY);//it will allow execution in any os for selenium grid concept
		//we are supposed to connect to the selenium web driver grid on port 4444
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);//same like webdriver we use remote webdriver in selenium web grid
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
	}
	}

}
