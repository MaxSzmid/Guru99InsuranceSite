package com.insurance.testCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.insurance.BrowserConnection;
import com.insurance.HomePage;
import com.insurance.LoggedIn;
import com.insurance.LoginPage;

public class LoginPageTestCase {
	LoginPage login;
	WebDriver driver;
	LoggedIn validationLoggedIn;

	@Before
	public void setUp() throws Exception {
		driver = BrowserConnection.BrowserConnection("chrome");
		login = new LoginPage(driver);
		validationLoggedIn = new LoggedIn(driver);
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		login.login("123@gmail.com", "123");
		Thread.sleep(2000);
		assertTrue(validationLoggedIn.getValidateLogin());
		
	}

}
