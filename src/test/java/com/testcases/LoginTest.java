package com.testcases;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

/**
 * @author Swati Patil
 * For User Login 
 */
public class LoginTest extends TestBase {
	@Test
	public void loginTest() {
		LoginPage page = new LoginPage(driver);
		page.login("Swatip888@gmail.com","Swati@123");
	}
}
