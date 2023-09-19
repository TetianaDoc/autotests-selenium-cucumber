package com.gmail.doctatyana1.web_auto_tests.pages;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Services page
 */

@Getter
public class ServicesPage extends BaseLandingPage {

    public ServicesPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }
    public ServicesPage(RemoteWebDriver driver){
        super(driver);
        isLoaded();
    }

    @Override
    public boolean isReady() {
        getWait().until(visibilityOfAllElements(servicesTitle));
        return servicesTitle.isDisplayed();
    }

    @FindBy(xpath = "//div/span[text()='Available Bookstore SOAP services:']")
    private WebElement servicesTitle;

}
