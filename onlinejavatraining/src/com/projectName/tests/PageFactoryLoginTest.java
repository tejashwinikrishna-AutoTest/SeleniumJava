package com.projectName.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectName.genericPage.CommonMethods;
import com.projectName.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {

	public PageFactoryLoginTest() throws Exception {
		super();
	}
	
	@Test
	public void loginTest() {
		PageFactoryLoginPage pfl=PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfl.enterEmail(pro3.getProperty("TestData1"));
		pfl.enterPassword(pro3.getProperty("TestData2"));;
	}

}
