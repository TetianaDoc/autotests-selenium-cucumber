package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.AboutUsPage;
import com.gmail.doctatyana1.web_auto_tests.pages.ServicesPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import lombok.extern.slf4j.Slf4j;

/**
 * Provides actions for {@link AboutUsPage} page.
 */


public class AboutUsPageActions extends BaseLandingPageActions implements PageAction {

    private final AboutUsPage page;

    public AboutUsPageActions(WebDriverProvider webDriverProvider, String url) {
        super(new AboutUsPage(webDriverProvider.getRemoteWebDriver(), url));
        page = (AboutUsPage) getPage();
    }

    public AboutUsPageActions(WebDriverProvider webDriverProvider) {
        super(new AboutUsPage(webDriverProvider.getRemoteWebDriver()));
        page = (AboutUsPage) getPage();
    }

    public boolean isInfoTitleDisplayed() {
        return page.getInfoTitle().isDisplayed();
    }

    @Override
    public boolean isPageReady() {
        return getPage().isReady();
    }

    //For Cucumber
    @Override
    public boolean elementByNameIsDisplayed(String elementName) {
        return false;
    }

}
