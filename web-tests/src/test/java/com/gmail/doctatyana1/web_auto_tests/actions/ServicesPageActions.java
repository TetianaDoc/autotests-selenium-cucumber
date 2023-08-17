package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.ServicesPage;

/**
 * Actions provided for {@link ServicesPage}
 */

public class ServicesPageActions extends BaseLandingPageActions implements PageAction {

    private final ServicesPage page;

    public ServicesPageActions(WebDriverProvider webDriverProvider) {
        super(new ServicesPage(webDriverProvider.getRemoteWebDriver()));
        page = (ServicesPage) getPage();
    }

    public ServicesPageActions(WebDriverProvider webDriverProvider, String url) {
        super(new ServicesPage(webDriverProvider.getRemoteWebDriver(), url));
        page = (ServicesPage) getPage();
    }

    public boolean isServicesTitleDisplayed() {
        return page.getServicesTitle().isDisplayed();
    }


    @Override
    public boolean isPageReady() {
        return getPage().isReady();
    }

    @Override
    public boolean elementByNameIsVisible(String elementName) {
        return false;
    }

}
