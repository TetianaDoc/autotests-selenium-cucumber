package com.gmail.doctatyana1.web_auto_tests.actions;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Provides actions for {@link SignUpPage}.
 */

@Slf4j
public final class SignUpPageActions extends BaseLandingPageActions implements PageAction {

    private final SignUpPage page;

    public SignUpPageActions(WebDriverProvider webDriverProvider, String url) {
        super(new SignUpPage(webDriverProvider.getRemoteWebDriver(), url));
        page = (SignUpPage) getPage();
    }

    public SignUpPageActions(WebDriverProvider webDriverProvider) {
        super(new SignUpPage(webDriverProvider.getRemoteWebDriver()));
        page = (SignUpPage) getPage();
    }

    @Override
    public boolean isPageReady() {
        return getPage().isReady();
    }

    public boolean isSignUpPageTitleDisplayed() {
        return page.getSignUpPageTitle().isDisplayed();
    }

    public boolean isFirstNameInputEnabled() {
        return page.getFirstNameInput().isEnabled();
    }

    public boolean isLastNameInputEnabled(){
        return page.getLastNameInput().isEnabled();
    }

    public boolean isAddressStreetInputEnabled(){
        return page.getAddressStreetInput().isEnabled();
    }

    public boolean isAddressCityInputEnabled(){
        return page.getAddressCityInput().isEnabled();
    }

    public boolean isAddressStateInputEnabled(){
        return page.getAddressStateInput().isEnabled();
    }

    public boolean isAddressZipCodeInputEnabled(){
        return page.getAddressZipCodeInput().isEnabled();
    }

    public boolean isPhoneNumberInputEnabled(){
        return page.getPhoneNumberInput().isEnabled();
    }

    public boolean isSsnInputEnabled(){
        return page.getSsnInput().isEnabled();
    }

    public boolean isUserNameInputEnabled(){
        return page.getUserNameInput().isEnabled();
    }

    public boolean isPasswordInputEnabled(){
        return page.getPasswordInput().isEnabled();
    }


    public boolean isConfirmPasswordInputEnabled(){
        return page.getConfirmPasswordInput().isEnabled();
    }

    public boolean isRegisterButtonEnabled(){
        return page.getRegisterButton().isEnabled();
    }

    //For Cucumber
    @Override
    public boolean elementByNameIsVisible(String elementName) {
        return false;
    }

//  public void signUp(String user, String password) {
//    page.getEmailInput().sendKeys(user);
//    page.getPasswordInput().sendKeys(password);
//    page.getConfirmPasswordInput().sendKeys(password);
//    page.getSignUpButton().click();
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


//  public void waitUntilRestorePasswordLinkEnabled() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
//  }
//
//  public void goToRestorePasswordPage() {
//    page.getWait().until(ExpectedConditions.elementToBeClickable(page.getRestorePasswordLink()));
//    page.getRestorePasswordLink().click();
//  }
}
