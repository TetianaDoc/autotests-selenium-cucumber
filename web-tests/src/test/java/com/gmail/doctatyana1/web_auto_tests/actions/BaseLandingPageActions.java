package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.pages.BaseLandingPage;
import lombok.Getter;

/**
 * Actions for {@link BaseLandingPage}
 */
@Getter
public abstract class BaseLandingPageActions extends BasePageActions {

    public BaseLandingPageActions(BaseLandingPage page) {
        super(page);
    }

    //Actions provided for Elements of .leftMenu on #headerPanel

    public boolean isSolutionsTitleDisplayed() {
        return ((BaseLandingPage) getPage()).getSolutionsTitle().isDisplayed();
    }

    public boolean isAboutUsLinkOnLeftMenuEnabled() {
        return ((BaseLandingPage) getPage()).aboutUsLinkOnLeftMenu.isEnabled();
    }

    public boolean isServicesLinkOnLeftMenuEnabled() {
        return ((BaseLandingPage) getPage()).servicesLinkOnLeftMenu.isEnabled();
    }

    public boolean isProductsPageLinkOnLeftMenuEnabled() {
        return ((BaseLandingPage) getPage()).productsPageLinkOnLeftMenu.isEnabled();
    }

    public boolean isLocationsPageLinkOnLeftMenuEnabled() {
        return ((BaseLandingPage) getPage()).locationsPageLinkOnLeftMenu.isEnabled();
    }

    public boolean isAdminPageLinkOnLeftMenuEnabled() {
        return ((BaseLandingPage) getPage()).adminPageLinkOnLeftMenu.isEnabled();
    }

    //Actions provided for Elements of .button on #headerPanel

    public boolean isHomeButtonEnabled() {
        return ((BaseLandingPage) getPage()).homeButton.isEnabled();
    }

    public boolean isAboutUsButtonEnabled() {
        return ((BaseLandingPage) getPage()).aboutUsButton.isEnabled();
    }

    public boolean isContactButtonEnabled() {
        return ((BaseLandingPage) getPage()).contactButton.isEnabled();
    }

//Actions provided for Elements of #loginPanel on #leftPanel of #bodyPanel

    public boolean isUsernameInputEnabled() {
        return ((BaseLandingPage) getPage()).usernameInput.isEnabled();
    }

    public boolean isPasswordInputEnabled() {
        return ((BaseLandingPage) getPage()).passwordInput.isEnabled();
    }

    public boolean isLogInButtonEnabled() {
        return ((BaseLandingPage) getPage()).logInButton.isEnabled();
    }

    public boolean isRestorePasswordLinkEnabled() {
        return ((BaseLandingPage) getPage()).restorePasswordLink.isEnabled();
    }
    public boolean isCustomerLoginTitleEnabled(){
        return ((BaseLandingPage) getPage()).customerLoginTitle.isEnabled();
    }
    public boolean isSignUpLinkEnabled(){
        return ((BaseLandingPage) getPage()).signUpLink.isEnabled();
    }
    public boolean isUsernameTitleDisplayed(){
        return ((BaseLandingPage) getPage()).usernameTitle.isDisplayed();
    }
    public boolean isPasswordTitleDisplayed(){
        return ((BaseLandingPage)getPage()).passwordTitle.isDisplayed();
    }

    //Actions provided for Elements of #topPanel

    public boolean isLogoImgHomeLinkEnabled(){
        return ((BaseLandingPage)getPage()).logoImgHomeLink.isEnabled();
    }
    public boolean isSloganTitleDisplayed(){
        return ((BaseLandingPage)getPage()).sloganTitle.isDisplayed();
    }
    public boolean isAdminImgLinkEnabled(){
        return ((BaseLandingPage)getPage()).adminImgLink.isEnabled();
    }

    //Actions provided for Elements on #footermainPanel

    public boolean isHomeLinkOnFooterPanelEnabled(){
        return ((BaseLandingPage)getPage()).homeLinkOnFooterPanel.isEnabled();
    }
    public boolean isAboutUsLinkOnFooterPanelEnabled(){
        return ((BaseLandingPage)getPage()).aboutUsLinkOnLeftMenu.isEnabled();
    }

    public boolean isServicesLinkOnFooterPanelEnabled(){
        return ((BaseLandingPage)getPage()).servicesLinkOnFooterPanel.isEnabled();
    }
    public boolean isProductsPageLinkOnFooterPanelEnabled(){
        return ((BaseLandingPage)getPage()).productsPageLinkOnFooterPanel.isEnabled();
    }
    public boolean isLocationsPageLinkOnFooterPanelEnabled(){
        return ((BaseLandingPage)getPage()).locationsPageLinkOnFooterPanel.isEnabled();
    }
    public boolean isForumPageLinkEnabled(){
        return ((BaseLandingPage)getPage()).forumPageLink.isEnabled();
    }
    public boolean isSiteMapLinkEnabled(){
        return ((BaseLandingPage)getPage()).siteMapLink.isEnabled();
    }
    public boolean isContactUsLinkEnabled(){
        return ((BaseLandingPage)getPage()).contactUsLink.isEnabled();
    }
    public  boolean isCopyrightTitleDisplayed(){
        return ((BaseLandingPage)getPage()).copyrightTitle.isDisplayed();
    }
    public boolean isVisitUsLinkEnabled(){
        return ((BaseLandingPage)getPage()).visitUsLink.isEnabled();
    }

    //For Cucumber
    public abstract boolean elementByNameIsVisible(String elementName);

    public void tearDown() {

    }
}
