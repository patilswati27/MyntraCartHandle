package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Your Email Address']")
	WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='login-login-button']")
    WebElement logIn;	
	
	public void login(String username,String Password) {
		userName.sendKeys(username);
		password.sendKeys(Password);
		logIn.click();
	}
	
}
