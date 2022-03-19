package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CovidResource {

	public CovidResource(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(.,'our response to COVID-19')]")
	public WebElement getResposed;

	@FindBy(xpath = "(//a[@id='btn-01'])[1]")
	public WebElement atmLocator;

	@FindBy(xpath = "//span[@class='js-filter-text filter-text underline']")
	public WebElement filter;

	@FindBy(xpath = "//input[@id='spid20908']")
	public WebElement branch;

//	@FindBy(className = "close-btn filter-close js-filter-close")
//	public WebElement close;

	@FindBy(xpath = "//div[@class='close-btn filter-close js-filter-close']")
	public WebElement close;

	@FindBy(xpath = "//input[@name='locator-search-value']")
	public WebElement searchBox;

	public void alrtHandle(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void scrDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	public void covidResponseButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getResposed));
		getResposed.click();
	}

//	public void takeScreenShot(WebDriver driver) {
//		java.io.File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(file, new File(pathname:"newScreenShot.png"));
//		
//	}
}
