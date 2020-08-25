package com.insurance;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerButton;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement buttonLogIn;

	/**
	 * Initialize the web elements
	 * 
	 * @param WebDriver
	 */
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {

		try {
			userName.sendKeys(user);
			password.sendKeys(pass);
			buttonLogIn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("an error occurred" + e);
		}
	}

	public void clickOnRegister() throws NoSuchElementException {
		if (registerButton.isDisplayed()) {
			registerButton.click();
		} else {
			System.out.println("The element was not found or isn't clickable");
		}
	}

	public boolean validateLoginPage() {
		return buttonLogIn.isDisplayed();
	}
}
