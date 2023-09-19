package com.gmail.doctatyana1.web_auto_tests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Sign Up page for registration.
 */

@Getter
public final class SignUpPage extends BaseLandingPage {

    public SignUpPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }

    @Override
    public void isLoaded() throws Error {
        super.isLoaded();
        getWait().until(elementToBeClickable(getHomeButton()));
    }

    @Override
    public boolean isReady() {
        return getLogoImgHomeLink().isEnabled();
    }

    @FindBy(xpath = "//div/h1[text()='Signing up is easy!']")
    private WebElement signUpPageTitle;

    @FindBy(id = "customer.ssn")
    private WebElement ssnInput;

    @FindBy(id = "customer.username")
    private WebElement userNameInput;

    @FindBy(id = "customer.password")
    private WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswordInput;

    @FindBy(css = "input[value='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//div/p[text()='Your account was created successfully. You are now logged in.']")
    private WebElement registrationConfirmationText;


}
