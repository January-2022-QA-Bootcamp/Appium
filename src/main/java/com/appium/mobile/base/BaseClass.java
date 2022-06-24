package com.appium.mobile.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.appium.mobile.common.CommonActions;
import com.appium.mobile.objects.CatalogPage;
import com.appium.mobile.objects.CheckoutPage;
import com.appium.mobile.objects.ItemPage;
import com.appium.mobile.objects.LoginPage;

public class BaseClass {

	public static WebDriver driver;
	
	protected CommonActions actions;
	protected CatalogPage catalogPage;
	protected CheckoutPage checkoutPage;
	protected ItemPage itemPage;
	protected LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion","12");
		dc.setCapability("deviceName", "Pixel 4 XL");
		dc.setCapability("app",new File("./apps/Demo.apk").getAbsolutePath());
		
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initClasses();
		
	}
	
	private void initClasses() {
		actions = new CommonActions();
		catalogPage = new CatalogPage(driver);
		checkoutPage = new CheckoutPage(driver);
		itemPage = new ItemPage(driver);
		loginPage = new LoginPage(driver);
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
