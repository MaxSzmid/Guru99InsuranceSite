package com.insurance.testCases;


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
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/**working here*/
	}

}
