package com.gmail.doctatyana1.web_auto_tests.actions;

/**
 * Provides actions for {@link RestorePasswordPage}.
 */
//@Slf4j
//public final class RestorePasswordPageActions extends BasePageActions implements PageAction {
//
//  private final RestorePasswordPage page;
//
//  public RestorePasswordPageActions(WebDriverProvider webDriverProvider, String url) {
//    super(new RestorePasswordPage(webDriverProvider, url));
//    page = (RestorePasswordPage) getPage();
//  }
//
//  public RestorePasswordPageActions(WebDriverProvider webDriverProvider) {
//    super(new RestorePasswordPage(webDriverProvider));
//    page = (RestorePasswordPage) getPage();
//  }
//
//  @Override
//  public boolean isPageReady() {
//    return page.isReady();
//  }
//
//  public boolean isSignUpLinkEnabled() {
//    return page.getSignUpLink().isEnabled();
//  }
//
//  public boolean isSignInLinkEnabled() {
//    return page.getSignInLink().isEnabled();
//  }
//
//  public void waitUntilSignInLinkEnabled() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//  }
//
//  public boolean isRestorePasswordButtonDisplayed() {
//    return page.getRestorePassword().isDisplayed();
//  }
//
//  public boolean isRestorePasswordButtonDisabled() {
//    return !page.getRestorePassword().isEnabled();
//  }
//
//  public void returnToSignInPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//    page.getSignInLink().click();
//  }
//
//  public void waitUntilSignUpLinkEnabled() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignUpLink()));
//  }
//
//  public void returnToSignUpPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignUpLink()));
//    page.getSignUpLink().click();
//  }
//
//  public void openSignInPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//    page.getSignInLink().click();
//  }
//
//  public void waitUntilSignInLinkClickable() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignInLink()));
//  }
//
//  public void openSignUpPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getSignUpLink()));
//    page.getSignUpLink().click();
//  }
//}
