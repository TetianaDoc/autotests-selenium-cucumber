package com.gmail.doctatyana1.web_auto_tests.pages;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import java.util.List;
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
    public SignUpPage(RemoteWebDriver remoteWebDriver){
        super(remoteWebDriver);
    }

    @Override
    public void isLoaded() throws Error {
        super.isLoaded();
        getWait().until(elementToBeClickable(homeButton));
    }

    @Override
    public boolean isReady() {
        return firstNameInput.isEnabled();
    }

    @FindBy(xpath = "//div/h1[text()='Signing up is easy!']")
    private WebElement signUpPageTitle;

    @FindBy(id = "customer.firstName")
    private WebElement firstNameInput;

    @FindBy(id="customer.lastName")
    private WebElement lastNameInput;

    @FindBy(id="customer.address.street")
    private WebElement addressStreetInput;

    @FindBy(id="customer.address.city")
    private WebElement addressCityInput;

    @FindBy(id="customer.address.state")
    private WebElement addressStateInput;

    @FindBy(id="customer.address.zipCode")
    private WebElement addressZipCodeInput;

    @FindBy(id="customer.phoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(id="customer.ssn")
    private WebElement ssnInput;

    @FindBy(id="customer.username")
    private WebElement userNameInput;

    @FindBy(id = "customer.password")
    private WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswordInput;

    @FindBy(css = "input[value='Register']")
    private WebElement registerButton;

}
