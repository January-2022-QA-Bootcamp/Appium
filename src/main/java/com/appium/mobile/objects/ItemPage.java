package com.appium.mobile.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.mobile.common.CommonActions;

public class ItemPage {

	public ItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sauce Labs Bike Light']")
	public WebElement addToCart;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='cart badge']")
	public WebElement cart;
	
	public void clickAddToCart(CommonActions actions) {
		actions.click(addToCart);
	}
	
	public void clickCart(CommonActions actions) {
		actions.click(cart);
	}
}
