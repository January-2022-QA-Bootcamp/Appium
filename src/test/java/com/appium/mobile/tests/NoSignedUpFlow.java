package com.appium.mobile.tests;

import org.testng.annotations.Test;

import com.appium.mobile.base.BaseClass;

public class NoSignedUpFlow extends BaseClass{

	@Test
	public void testNonSignedUpUserFlow() {
		catalogPage.clickBikeLight(actions);
		itemPage.clickAddToCart(actions);
		itemPage.clickCart(actions);
		checkoutPage.clickProceedToCheckout(actions);
		loginPage.inputUserName(actions, "Agent009");
		loginPage.inputPassword(actions, "superMan");
		loginPage.clickLogin(actions);
		loginPage.assertEqualErrorMsg(actions,"Provided credentials do not match any user in this service.");
	}
}
