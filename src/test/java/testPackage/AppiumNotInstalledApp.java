package testPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class AppiumNotInstalledApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion","12");
		dc.setCapability("deviceName", "Pixel 4 XL");
		dc.setCapability("app",new File("./apps/Demo.apk").getAbsolutePath());
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement bikeLight = driver.findElement(By.xpath("//android.widget.TextView[@text='Sauce Labs Bike Light']"));
		bikeLight.click();
		
		WebElement addToCart = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Add To Cart button']"));
		addToCart.click();
		
		WebElement cart = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='cart badge']"));
		cart.click();
		
		WebElement proceedToCheckout = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Proceed To Checkout button']"));
		proceedToCheckout.click();
		
		WebElement userName = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Username input field']"));
		userName.sendKeys("user005");
		
		WebElement pass = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Password input field']"));
		pass.sendKeys("pass");
		
		WebElement login = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Login button']"));
		login.click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='generic-error-message']/android.widget.TextView"));
		
		Assert.assertEquals(errorMsg.getText(),"Provided credentials do not match any user in this service.");
		
	}
}
