package com.insurance.testCases;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.insurance.BrowserConnection;
import com.insurance.HomePage;
import com.insurance.LoginPage;

public class HomePageTestCase {
	WebDriver driver;
	HomePage home;
	LoginPage login;

	@Before
	public void setUp() throws Exception {
		driver = BrowserConnection.BrowserConnection("chrome");
		login = new LoginPage(driver);
		home = new HomePage(driver);
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		Thread.sleep(200);
		login.login("123@gmail.com", "123");
	}

	@Test
	public void test() {
		home.clickOnButtonLogOut();
		assertTrue(login.validateLoginPage());

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
