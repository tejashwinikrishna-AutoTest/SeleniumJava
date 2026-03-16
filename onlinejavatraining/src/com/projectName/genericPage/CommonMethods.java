package com.projectName.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage {

	// if a class is having a constructor and the child is extending the class then
	// it shld also have it own constructor
	// super keyword first the constructor will execute
	public CommonMethods() throws Exception {
		super();
	}

	// get text of web element
	public void getTextofWebElement(String webElementKey) {
		String getTextofWebElement = driver.findElement(By.xpath(pro2.getProperty(webElementKey))).getText();
		System.out.println(getTextofWebElement);
	}

	// click of web element
	public void clickWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).click();
	}

	// click list of web element \
	public void clickListOfWebElement(String webElementKey, String testData) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(pro2.getProperty(webElementKey)));
		for (int i = 0; i < listOfElements.size(); i++) {
			if (listOfElements.get(i).getText().equalsIgnoreCase(pro3.getProperty(testData))) {
				listOfElements.get(i).click();
			}
		}
	}

	// Clear web element
	public void clearWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).clear();
	}

	// enter data
	public void enterData(String webElementKey, String testdata) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).sendKeys(pro3.getProperty(testdata));
	}

	// Mouse Hover
	public void moveToElement(String webElementKey) {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(pro2.getProperty(webElementKey)))).build().perform();
	}

	// select dropdown value using visible text
	public void selectDropDownValue(String webElementKey, String testdata) {
		WebElement ele = driver.findElement(By.xpath(pro2.getProperty(webElementKey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(pro3.getProperty(testdata));
	}

	// Read Excel Data
	public void readExcelData(String webElementKey, int rowNo, int coulmnNo, String excelSheetName) throws Exception {
		File src = new File(".\\src\\com\\projectName\\resources\\Short Notes.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(excelSheetName);
		String abc = sh.getRow(rowNo).getCell(coulmnNo).getStringCellValue();
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).sendKeys(abc);

	}

	// Handle Explicit Wait
	public void handleExplicitWait_elementToBeClickable(String webElementKey) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(pro2.getProperty(webElementKey)))).click();
	}

	// Handle Log File
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(pro1.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}

	// capture Screenshot
	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			// Create ref of TakesScreenshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenshotAs() to capture the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed ,screenshot captured.");

		}
	}
}