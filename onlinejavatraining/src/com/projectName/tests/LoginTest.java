package com.projectName.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.projectName.pages.LoginPage;

public class LoginTest{
	
	LoginPage lp;
	
	@Test
	public void loginTest() throws Exception {
	   
		lp=new LoginPage();
		lp.clearEmail();
		lp.enterEmail();
		lp.clearPassword();
		lp.enterPassword();
		lp.getFacebookText();
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPassword();
		Thread.sleep(2000);
		lp.readExcelData("Email", 3, 1, "ExcelSheetName");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result) throws Exception {
		lp.captureScreenshot(result);
				
	}

}
