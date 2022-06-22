package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileWeb {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion","12");
		dc.setCapability("deviceName", "Pixel 4 XL");
		dc.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		driver.get("https://zoom.us/");
	}
}
