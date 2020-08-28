package com.insurance.testCases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = BrowserConnection.BrowserConnection("Chrome");
		login = new LoginPage(driver);
		register = new RegisterNewUserPage(driver);
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		Thread.sleep(200); // wait for the page to load
		login.clickOnRegister();
	}

	@Test
	public void test() throws InterruptedException {
		register.registNewUser();
		register.clickOnRegisterButton();
		assertFalse(register.validateUserRegistered()); // if the user are created, you should be redirected to the
														// login
														// page
	}

	@Test
	public void test2() throws InterruptedException {
		register.registNewUser();
		register.clickOnResetButton();
		assertTrue(register.validateUserRegistered()); // if the user aren't regitered, you should stay on the register
														// page

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
