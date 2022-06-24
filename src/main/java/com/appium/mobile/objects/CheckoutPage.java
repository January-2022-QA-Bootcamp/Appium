package com.appium.mobile.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.mobile.common.CommonActions;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Proceed To Checkout button']")
	public WebElement proceedToCheckout;
	
	public void clickProceedToCheckout(CommonActions actions) {
		actions.click(proceedToCheckout);
	}
}
