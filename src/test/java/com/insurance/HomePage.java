package com.insurance;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//input[contains(@value, 'Log out')]")
	private WebElement registerButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnButtonLogOut() {
		try {
			registerButton.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
}
