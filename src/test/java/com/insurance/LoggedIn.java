package com.insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedIn {

	@FindBy(xpath = "//div[contains(text(),'Signed in as')]")
	private WebElement isLoggedIn;

	public LoggedIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean getValidateLogin() {
		return isLoggedIn.getText().contains("Signed in as");
	}

}
