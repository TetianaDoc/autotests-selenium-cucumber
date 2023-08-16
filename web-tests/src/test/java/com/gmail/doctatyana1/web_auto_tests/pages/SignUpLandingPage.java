package com.gmail.doctatyana1.web_auto_tests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import java.util.List;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sign Up page for registration.
 */
@Getter
public final class SignUpLandingPage extends BaseLandingPage {

  public SignUpLandingPage(WebDriverProvider webDriverProvider, String url) {
    super(webDriverProvider.getRemoteWebDriver(), url);
    load();
    isLoaded();
  }

  public SignUpLandingPage(WebDriverProvider webDriverProvider) {
    super(webDriverProvider.getRemoteWebDriver());
  }

  @Override
  public void isLoaded() throws Error {
    super.isLoaded();
    getWait().until(elementToBeClickable(emailInput));
  }

  @Override
  public boolean isReady() {
    return emailInput.isEnabled();
  }

  @FindBy(css = "input[name=\"email\"]")
  private WebElement emailInput;

  @FindBy(css = "input[name=\"firstName\"]")
  private WebElement firstnameInput;

  @FindBy(css = "input[name=\"newPassword\"]")
  private WebElement passwordInput;

  @FindBy(css = "input[name=\"confirmPassword\"]")
  private WebElement confirmPasswordInput;

  @FindBy(css = "button[type=\"submit\"]")
  private WebElement signUpButton;

  @FindBy(css = "a[href=\"/restore-password\"]")
  private WebElement restorePasswordLink;

  @FindBy(css = "a[href=\"/login\"]")
  private WebElement signInLink;

  @FindBy(css = "svg[class*=\"MuiSvgIcon\"]")
  private WebElement eyeIcon;

  @FindBy(css = "iframe[title=\"reCAPTCHA\"]")
  private WebElement recaptcha;

  @FindBy(id = "mui-component-select-servicePackageCode")
  private WebElement selectedPackage;

  @FindBy(css = "input[name='servicePackageCode']")
  private WebElement selectedPackageInput;

  @FindBy(css = "li[class*='MuiListItem-gutters MuiListItem-button']")
  private List<WebElement> packages;

  @FindBy(css = "ul[class*='MuiList-root MuiMenu-list MuiList-padding']")
  private WebElement listOfPackages;
}
