package com.gmail.doctatyana1.web_auto_tests.pages;

import java.util.List;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Base authorization page for pages {@link SignInPage}, {@link SignUpPage}, {@link RestorePasswordPage}.
 */

@Getter
public abstract class AuthBasePage extends BasePage {

  public AuthBasePage(RemoteWebDriver remoteWebDriver, String url) {
    super(remoteWebDriver, url);
    load();
    isLoaded();
  }

  public AuthBasePage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
  }

  @FindBy(css = "img[src=\"/logo_eng.png\"]")
  private WebElement icon;

  @FindBy(xpath = "//form/div/div/div/div/div[contains(text(), 'build')]")
  private WebElement programVersion;

  @FindBy(className = "MuiButton-label")
  private WebElement supportButton;

  @FindBy(className = "CookieConsent")
  private WebElement cookieConsent;

  @FindBy(css = "button[id=\"rcc-confirm-button\"]")
  private WebElement confirmCookieButton;

  @FindBy(id = "auth-page-languages")
  private WebElement selectedLanguage;

  @FindBy(css = "li[id*='languages-']")
  private List<WebElement> languages;

  @FindBy(css = "ul[class*='MuiList-root MuiMenu-list MuiList-padding']")
  private WebElement listOfLanguages;


}
