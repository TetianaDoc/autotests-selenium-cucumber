package com.gmail.doctatyana1.web_auto_tests.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.SignInPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Provides actions for {@link SignInPage}.
 */
@Slf4j
public final class SignInPageActions extends AuthBasePageActions implements PageAction {

  private final SignInPage page;

  public SignInPageActions(WebDriverProvider webDriverProvider, String url) {
    super(new SignInPage(webDriverProvider, url));
    page=(SignInPage) getPage();
  }

  public SignInPageActions(WebDriverProvider webDriverProvider) {
    super(new SignInPage(webDriverProvider));
    page=(SignInPage) getPage();
  }

  @Override
  public boolean isPageReady() {
    return page.isReady();
  }

  public boolean isRestorePasswordLinkEnabled() {
    return page.getRestorePasswordLink().isEnabled();
  }

  public void signIn(String user, String password) {
    page.getWait().until(elementToBeClickable(page.getUsernameInput()));
    page.getUsernameInput().sendKeys(user);
    page.getPasswordInput().sendKeys(password);
    page.getSignInButton().click();
  }

  public boolean isEyeIconEnabled() {
    return page.getEyeIcon().isEnabled();
  }

  public boolean isSignUpLinkEnabled() {
    return page.getSignUpLink().isEnabled();
  }

  public void openSignUpPage() {
    page.getWait().until(elementToBeClickable(page.getSignUpLink()));
    page.getSignUpLink().click();
  }

  public void waitUntilSignUpLinkClickable() {
    page.getWait().until(elementToBeClickable(page.getSignUpLink()));
  }

  public void openRestorePasswordPage() {
    page.getWait().until(elementToBeClickable(page.getRestorePasswordLink()));
    page.getRestorePasswordLink().click();
  }

  public void returnToSignUpPage() {
    page.getWait().until(elementToBeClickable(page.getSignUpLink()));
    page.getSignUpLink().click();
  }

  public void waitUntilRestorePasswordLinkClickable() {
    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
  }

  public void returnToRestorePasswordPage() {
    page.getWait().until(elementToBeClickable(page.getRestorePasswordLink()));
    page.getRestorePasswordLink().click();
  }
}
