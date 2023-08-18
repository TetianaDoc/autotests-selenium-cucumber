package com.gmail.doctatyana1.web_auto_tests.actions;

import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.ProductsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPageActions extends BaseLandingPageActions implements PageAction {

    private final ProductsPage page;

    public ProductsPageActions(WebDriverProvider webDriverProvider, String url) {
        super(new ProductsPage(webDriverProvider.getRemoteWebDriver(), url));
        page = (ProductsPage) getPage();
    }

    public ProductsPageActions(WebDriverProvider webDriverProvider) {
        super(new ProductsPage(webDriverProvider.getRemoteWebDriver()));
        page = (ProductsPage) getPage();
    }

    @Override
    public boolean elementByNameIsVisible(String elementName) {
        return false;
    }

    @Override
    public boolean isPageReady() {
        return getPage().isReady();
    }

    public boolean isProductsPageTitleDisplayed() {
        return page.getProductsPageTitle().isDisplayed();
    }

    public boolean isCookieConsentDisplayed() {
        return page.getCookieConsent().isDisplayed();
    }

    public boolean isQuickLinksTitleDisplayed(){
        return page.getQuickLinksTitle().isDisplayed();
    }

    public boolean isHeadquartersTitleDisplayed(){
        return page.getHeadquartersTitle().isDisplayed();
    }

    public void waitForCookieConsentDisplayed(){
         page.getWait().until(ExpectedConditions.elementToBeClickable(page.getCookieConsent()));
    }

    public void acceptCookie(){
        page.getCookieConsent().click();
    }

}
