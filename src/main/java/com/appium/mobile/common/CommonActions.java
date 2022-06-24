package com.appium.mobile.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.appium.mobile.reporting.Loggers;

public class CommonActions {

	public void click(WebElement element) {
		try {
			element.click();
			Loggers.log(element + " has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log("Element Not Found : " + element);
			Assert.fail();
		}
	}
	
	public void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Loggers.log(value +" : " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log("Element Not Found : " + element);
			Assert.fail();
		}
	}
	
	public String getText(WebElement element) {
		try {
			String text = element.getText();
			Loggers.log(element + " : has text, " + text);
			return text;
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.log("Element Not Found : " + element);
			return null;
		}
	}
}
