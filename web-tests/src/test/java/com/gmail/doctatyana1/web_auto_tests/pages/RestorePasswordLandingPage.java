package com.gmail.doctatyana1.web_auto_tests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Restore Password page for restore password.
 */
@Getter
public final class RestorePasswordLandingPage extends BaseLandingPage {

  public RestorePasswordLandingPage(WebDriverProvider webDriverProvider, String url) {
    super(webDriverProvider.getRemoteWebDriver(), url);
    load();
    isLoaded();
  }

  public RestorePasswordLandingPage(WebDriverProvider webDriverProvider) {
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

  @FindBy(css = "button[type=\"submit\"]")
  private WebElement restorePassword;

  @FindBy(css = "a[href=\"/sign-up\"]")
  private WebElement signUpLink;

  @FindBy(css = "a[href=\"/login\"]")
  private WebElement signInLink;

  @FindBy(css = "iframe[title=\"reCAPTCHA\"]")
  private WebElement recaptcha;
  }
