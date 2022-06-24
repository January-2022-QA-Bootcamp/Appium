package com.appium.mobile.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.appium.mobile.common.CommonActions;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='Username input field']")
	public WebElement userName;
	
	@FindBy(xpath = "//android.widget.EditText[@content-desc='Password input field']")
	public WebElement password;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Login button']")
	public WebElement login;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='generic-error-message']/android.widget.TextView")
	public WebElement errorMsg;
	
	public void inputUserName(CommonActions actions, String user) {
		actions.input(userName, user);
	}
	
	public void inputPassword(CommonActions actions, String pass) {
		actions.input(password, pass);
	}
	
	public void clickLogin(CommonActions actions) {
		actions.click(login);
	}
	
	public void assertEqualErrorMsg(CommonActions actions, String expectedErrorMsg) {
		Assert.assertEquals(actions.getText(errorMsg), expectedErrorMsg);
	}
}
