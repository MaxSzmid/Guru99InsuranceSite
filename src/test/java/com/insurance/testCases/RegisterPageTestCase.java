package com.insurance.testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.insurance.BrowserConnection;
import com.insurance.LoginPage;
import com.insurance.RegisterNewUserPage;

public class RegisterPageTestCase {
	LoginPage login;
	RegisterNewUserPage register;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = BrowserConnection.BrowserConnection("Chrome");
		login = new LoginPage(driver);
		register = new RegisterNewUserPage(driver);
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		login.clickOnRegister();
		register.registNewUser();
	}

}
