package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;
import lombok.extern.slf4j.Slf4j;

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
    public boolean elementByNameIsDisplayed(String elementName) {
        return false;
    }

    //Actions provided for SignUp
  public void signUp(String firstName, String lastName, String address, String city,
                     String state, String zipCode, String phone, String ssn,
                     String username, String password, String confirm) {
    page.getFirstNameInput().sendKeys(firstName);
    page.getLastNameInput().sendKeys(lastName);
    page.getAddressStreetInput().sendKeys(address);
    page.getAddressCityInput().sendKeys(city);
    page.getAddressStateInput().sendKeys(state);
    page.getAddressZipCodeInput().sendKeys(zipCode);
    page.getPhoneNumberInput().sendKeys(phone);
    page.getSsnInput().sendKeys(ssn);
    page.getUserNameInput().sendKeys(username);
    page.getPasswordInput().sendKeys(password);
    page.getConfirmPasswordInput().sendKeys(confirm);
    page.getRegisterButton().click();
  }
}
