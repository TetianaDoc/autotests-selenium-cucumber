package com.gmail.doctatyana1.web_auto_tests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sign In page for login to the app.
 */
@Getter
public final class SignInPage extends AuthBasePage {

  public SignInPage(WebDriverProvider webDriverProvider, String url) {
    super(webDriverProvider.getRemoteWebDriver(), url);
    load();
    isLoaded();
  }

  public SignInPage(WebDriverProvider webDriverProvider) {
    super(webDriverProvider.getRemoteWebDriver());
  }

  @Override
  public void isLoaded() throws Error {
    super.isLoaded();
    getWait().until(elementToBeClickable(usernameInput));
  }

  @Override
  public boolean isReady() {
    return usernameInput.isEnabled();
  }

  @FindBy(css = "input[name=\"username\"]")
  private WebElement usernameInput;

  @FindBy(css = "input[name=\"password\"]")
  private WebElement passwordInput;

  @FindBy(css = "button[type=\"submit\"]")
  private WebElement signInButton;

  @FindBy(css = "a[href=\"/restore-password\"]")
  private WebElement restorePasswordLink;

  @FindBy(css = "svg[class*=\"MuiSvgIcon\"]")
  private WebElement eyeIcon;

  @FindBy(css = "a[href=\"/sign-up\"]")
  private WebElement signUpLink;

}
