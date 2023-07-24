package com.gmail.doctatyana1.web_auto_tests.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import com.gmail.doctatyana1.web_auto_tests.pages.AuthBasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

/**
 * Provides base actions for authorisation page actions {@link RestorePasswordPageActions}, {@link SignInPageActions}, {@link
 * SignUpPageActions}.
 */
@Getter
public abstract class AuthBasePageActions implements PageAction {

  private final AuthBasePage page;

  public AuthBasePageActions(AuthBasePage page) {
    this.page = page;
  }

  public boolean isIconDisplayed() {
    return page.getIcon().isDisplayed();
  }

  public boolean isSupportButtonEnabled() {
    return page.getSupportButton().isEnabled();
  }

  public boolean isProgramVersionDisplayed() {
    return page.getProgramVersion().isDisplayed();
  }

  public boolean isSelectLanguageButtonEnabled() {
    return page.getSelectedLanguage().isEnabled();
  }

  public boolean isCookieConsentDisplayed() {
    try {
      return page.getCookieConsent().isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isConfirmCookieButtonEnabled() {
    return page.getConfirmCookieButton().isEnabled();
  }

  public void acceptCookie() {
    page.getConfirmCookieButton().click();
  }

  public void waitForCookieConsentDisplayed() {
    page.getWait().until(visibilityOf(page.getCookieConsent()));
  }

  public void changeLanguage(String languageCode) {
    page.getSelectedLanguage().click();
    page.getWait().until(visibilityOf(page.getListOfLanguages()));
    page.getLanguages().stream().filter(e -> e.getText().equals(languageCode))
        .findFirst()
        .orElseThrow(IllegalStateException::new)
        .click();
    page.getWait().until(visibilityOf(page.getSelectedLanguage()));
  }

  public String getSelectedLanguage() {
    return page.getSelectedLanguage()
        .findElement(By
            .cssSelector("div[class*='MuiInputBase-input MuiInput-input'"))
        .getText();
  }

}
