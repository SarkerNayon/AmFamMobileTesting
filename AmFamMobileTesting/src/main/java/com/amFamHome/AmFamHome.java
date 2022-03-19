package com.amFamHome;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmFamHome {
	
  public AppiumDriver <MobileElement> driver;
	
	@BeforeMethod
	public void homePage() throws MalformedURLException {
		File file=new File("src/main/resources");
		File f=new File(file,"com.amfam.myamfam_2440_apktada.com.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver <MobileElement>(url,cap);
		System.out.println("Application started.......");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
