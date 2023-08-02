package com.gmail.doctatyana1.web_auto_tests.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Provides actions for {@link SignUpPage}.
 */
//@Slf4j
//public final class SignUpPageActions extends BasePageActions implements PageAction {
//
//  private final SignUpPage page;
//
//  public SignUpPageActions(WebDriverProvider webDriverProvider, String url) {
//    super(new SignUpPage(webDriverProvider, url));
//    page=(SignUpPage) getPage();
//  }
//
//  public SignUpPageActions(WebDriverProvider webDriverProvider) {
//    super(new SignUpPage(webDriverProvider));
//    page=(SignUpPage) getPage();
//  }
//
//  @Override
//  public boolean isPageReady() {
//    return page.isReady();
//  }
//
//  public boolean isRestorePasswordLinkEnabled() {
//    return page.getRestorePasswordLink().isEnabled();
//  }
//
//  public void signUp(String user, String password) {
//    page.getEmailInput().sendKeys(user);
//    page.getPasswordInput().sendKeys(password);
//    page.getConfirmPasswordInput().sendKeys(password);
//    page.getSignUpButton().click();
//  }
//
//  public boolean isEyeIconEnabled() {
//    return page.getEyeIcon().isEnabled();
//  }
//
//  public boolean isSelectedPackageButtonEnabled() {
//    return page.getSelectedPackage().isEnabled();
//  }
//
//  public boolean isSignInLinkEnabled() {
//    return page.getSignInLink().isEnabled();
//  }
//
//  public boolean isFirstNameInputEnabled() {
//    return page.getFirstnameInput().isEnabled();
//  }
//
//  public boolean isRecaptchaDisplayed() {
//    return page.getRecaptcha().isDisplayed();
//  }
//
//  public void waitUntilSignInLinkClickable() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//  }
//
//  public void returnToSignInPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//    page.getSignInLink().click();
//  }
//
//  public void openSignInPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//    page.getSignInLink().click();
//  }
//
//  public void openRestorePasswordPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
//    page.getRestorePasswordLink().click();
//  }
//
//  public void changePackage(String packageCode) {
//    page.getSelectedPackage().click();
//    page.getWait().until(visibilityOf(page.getListOfPackages()));
//    page.getPackages().stream().filter(e -> e.getAttribute("data-value").equals(packageCode))
//        .findFirst()
//        .orElseThrow(IllegalStateException::new)
//        .click();
//    page.getWait().until(visibilityOf(page.getSelectedPackage()));
//  }
//
//  public String getSelectedPackage() {
//    return page.getSelectedPackageInput().getAttribute("value");
//  }
//
//  public void waitUntilRestorePasswordLinkEnabled() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
//  }
//
//  public void returnToRestorePasswordPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
//    page.getRestorePasswordLink().click();
//  }
//}
