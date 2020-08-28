package com.insurance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.insurance.LoginPage;

public class RegisterNewUserPage {
	// Validate the message to make sure than the web page to test is the correct
	@FindBy(xpath = "//h1[contains(text(),'Sign up as a new user')]")
	private WebElement isShowedTheWelcomeMessage;
	@FindBy(xpath = "//select[@id='user_title']")
	private WebElement title;
	@FindBy(xpath = "//input[@id='user_firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='user_surname']")
	private WebElement surname;
	@FindBy(xpath = "//input[@id='user_phone']")
	private WebElement phone;
	@FindBy(xpath = "//select[@id='user_dateofbirth_1i']")
	private WebElement DateOfBirthYear;
	@FindBy(xpath = "//select[@id='user_dateofbirth_2i']")
	private WebElement DateOfBirthMonth;
	@FindBy(xpath = "//select[@id='user_dateofbirth_3i']")
	private WebElement DateOfBirthDay;
	@FindBy(xpath = "//input[@id='licencetype_f']")
	private WebElement provitional;
	@FindBy(xpath = "//select[@id='user_licenceperiod']")
	private WebElement licencePeriod;
	@FindBy(xpath = "//select[@id='user_occupation_id']")
	private WebElement occupation;
	@FindBy(xpath = "//input[@id='user_address_attributes_street']")
	private WebElement addres;
	@FindBy(xpath = "//input[@id='user_address_attributes_city']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='user_address_attributes_county']")
	private WebElement country;
	@FindBy(xpath = "//input[@id='user_address_attributes_postcode']")
	private WebElement postalCode;
	@FindBy(xpath = "//input[@id='user_user_detail_attributes_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password_confirmation']")
	private WebElement confirmPassword;
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//input[@id='resetform']")
	private WebElement resetButton;

	private LoginPage loginPage;

	/**
	 * Initialize the web elements
	 * 
	 * @param WebDriver
	 */
	public RegisterNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void registNewUser() throws InterruptedException {

		Select titleSelect = new Select(title);
		Select dateOfBirthYeartSelect = new Select(DateOfBirthYear);
		Select dateOFBirthMonthSelect = new Select(DateOfBirthMonth);
		Select dateOfBirthDaySelect = new Select(DateOfBirthDay);
		Select licencePeriodSelect = new Select(licencePeriod);
		Select occupationSelect = new Select(occupation);

		if (isShowedTheWelcomeMessage.getText().equalsIgnoreCase("Sign up as a new user")) {
			Thread.sleep(200); // a few seconds to wait for the page to load
			titleSelect.selectByVisibleText("Sir");
			firstName.sendKeys("Max");
			surname.sendKeys("Szmid");
			phone.sendKeys("3455678234");
			dateOfBirthYeartSelect.selectByVisibleText("1995");
			dateOFBirthMonthSelect.selectByVisibleText("March");
			dateOfBirthDaySelect.selectByVisibleText("3");
			provitional.click();
			licencePeriodSelect.selectByVisibleText("15");
			occupationSelect.selectByVisibleText("Engineer");
			addres.sendKeys("jkdfgjkldfgjkl");
			city.sendKeys("Villa Carlos Paz");
			country.sendKeys("Cordoba");
			postalCode.sendKeys("5152");
			email.sendKeys("hjsdfjhnkfds@jkasd.com");
			password.sendKeys("1234");
			confirmPassword.sendKeys("1234");

		} else {
			throw new NoSuchElementException("You not are in the page to register a new user.");
		}
	}

	public void clickOnRegisterButton() {
		submitButton.click();
	}

	public void clickOnResetButton() {
		resetButton.click();
	}

	public boolean validateUserRegistered() {
		try {

			if (isShowedTheWelcomeMessage.isDisplayed()) {
				return true;
			}
			
		} catch (Exception e) {
			//dont do notinhg
		}
		return false;
	}

}
