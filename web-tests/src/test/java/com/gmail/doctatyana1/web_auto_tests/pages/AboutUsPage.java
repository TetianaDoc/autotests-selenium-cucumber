package com.gmail.doctatyana1.web_auto_tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

@Getter
public class AboutUsPage extends BaseLandingPage {


    public AboutUsPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }

    public AboutUsPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }

    /**
     * About Us page
     */

    @Override
    public boolean isReady() {
        getWait().until(visibilityOfAllElements(usernameInput));
        return usernameInput.isDisplayed();
    }

    @FindBy(className = "title")
    private WebElement infoTitle;
}
