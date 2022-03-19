package com.nativeAppPages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateAmFamAcount {
	
	@FindBy(id = "com.amfam.myamfam:id/tvCreateAccount")
	public MobileElement CreateAnAccount;
	@FindBy(id = "com.amfam.myamfam:id/name")
	public MobileElement LastName;
	@FindBy(id = "com.amfam.myamfam:id/next")
	public MobileElement NextButton;
	@FindBy(id = "com.amfam.myamfam:id/dob")
	public MobileElement DOB;
	@FindBy(id = "com.amfam.myamfam:id/next")
	public MobileElement NextVerifyButton;
	@FindBy(id = "com.amfam.myamfam:id/zip")
	public MobileElement ZipCode;
	
	
	public CreateAmFamAcount(AppiumDriver <MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void createAnAccount() {
		CreateAnAccount.click();
	}
	public void lastName() {
		LastName.sendKeys("Ahmed");
	}
	public void nextButton() {
		NextButton.click();
	}
	public void doBirth() {
		DOB.sendKeys("10201990");
	}
	public void nextVerify() {
		NextVerifyButton.click();
	}
	public void zipCode() {
		ZipCode.sendKeys("10475");
	}
	
}
