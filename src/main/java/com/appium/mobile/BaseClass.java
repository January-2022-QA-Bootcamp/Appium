package com.appium.mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion","12");
		//dc.setCapability("deviceName", "Pixel 4 XL");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("appPackage", "com.google.android.calculator");
		
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
