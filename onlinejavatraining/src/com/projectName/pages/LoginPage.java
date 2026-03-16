package com.projectName.pages;

import com.projectName.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();
	}

	// click on email field
	public void clickEmail() {
		clickWebElement("Email");
		handleLogger("LoginPage", "Clicked Email Field");
	}

	// Enter Email
	public void enterEmail() {
		enterData("Email", "TestData1");
		handleLogger("LoginPage", "Email id entered");
	}

	// Clear email Field
	public void clearEmail() {
		clearWebElement("Email");
		handleLogger("LoginPage", "cleared email text field");
	}

	// click on password field
	public void clickPassword() {
		clickWebElement("Password");
		handleLogger("LoginPage", "Clicked Password Field");
	}

	// Enter Email
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Password entered");
	}

	// Clear email Field
	public void clearPassword() {
		clearWebElement("Password");
		handleLogger("LoginPage", "cleared password text field");
	}

	// get facebook text
	public void getFacebookText() {
		getTextofWebElement("FacebookText");
		handleLogger("LoginPage", "fetching facebook text");
	}

	// click on login Button
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage", "clicked login button");
	}

}
