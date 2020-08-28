package com.insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConnection {

	/**
	 * 
	 * @param browserName only suport firefox and chrome.
	 * @return Webdriver
	 */
	public static WebDriver BrowserConnection(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/A77ACKER-/Desktop/geckodriver-v0.26.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/A77ACKER-/Desktop/geckodriver-v0.26.0-win64/chromedriver.exe");
			driver = new ChromeDriver();
		}

		return driver;
	}
}
