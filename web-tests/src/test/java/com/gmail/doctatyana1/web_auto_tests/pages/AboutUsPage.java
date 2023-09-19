package com.gmail.doctatyana1.web_auto_tests.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * About us page.
 */

@Getter
public class AboutUsPage extends BaseLandingPage {

    public AboutUsPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }

    public AboutUsPage(RemoteWebDriver driver) {
        super(driver);
        isLoaded();
    }

    @Override
    public boolean isReady() {
        getWait().until(visibilityOfAllElements(getUsernameInput()));
        return getUsernameInput().isDisplayed();
    }

    @FindBy(className = "title")
    private WebElement infoTitle;
}
