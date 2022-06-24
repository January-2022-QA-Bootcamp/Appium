package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainAppiumInstalledApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion","12");
		//dc.setCapability("deviceName", "Pixel 4 XL");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("appPackage", "com.google.android.calculator");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		WebElement digit_4 = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		digit_4.click();
		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		plus.click();
		WebElement digit_2 = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
		digit_2.click();
		WebElement equal = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		equal.click();
		WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
		System.out.println("Result is :" + result.getText());
		
		driver.quit();
		
	}
}
