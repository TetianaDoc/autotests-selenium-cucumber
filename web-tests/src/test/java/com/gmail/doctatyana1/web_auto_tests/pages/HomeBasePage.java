package com.gmail.doctatyana1.web_auto_tests.pages;

import java.util.List;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Base home page for pages {@link SignInPage}, {@link SignUpPage}, {@link RestorePasswordPage}.
 */

@Getter
public abstract class HomeBasePage extends BasePage {

  public HomeBasePage(RemoteWebDriver remoteWebDriver, String url) {
    super(remoteWebDriver, url);
    load();
    isLoaded();
  }

  public HomeBasePage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
  }

  @FindBy(css = "input[name=\"username\"]")
  public WebElement usernameInput;

  @FindBy(css = "input[name=\"password\"]")
  private WebElement passwordInput;

  @FindBy(css = "input[value=\"Log In\"]")
  private WebElement logInButton;

  @FindBy(css = "a[href*=lookup]")
  private WebElement restorePasswordLink;

  @FindBy(css = "img[class*=logo]")
  private WebElement logoImg;

  @FindBy(css = "a[href*=register]")
  private WebElement signUpLink;

  @FindBy(css = "li[class=home]")
  private WebElement homeButton;

  @FindBy(css = "li[class=aboutus]")
  private WebElement aboutUsButton;

  @FindBy(css = "li[class=contact]")
  private WebElement contactButton;

}
