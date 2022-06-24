package com.appium.mobile.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.mobile.common.CommonActions;

public class CatalogPage {
	
	public CatalogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sauce Labs Bike Light']")
	public WebElement bikeLight;
	
	public void clickBikeLight(CommonActions actions) {
		actions.click(bikeLight);
	}
}
