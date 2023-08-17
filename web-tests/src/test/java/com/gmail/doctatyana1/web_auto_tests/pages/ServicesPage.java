package com.gmail.doctatyana1.web_auto_tests.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
public class ServicesPage extends BaseLandingPage {

    public ServicesPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }
    public ServicesPage(RemoteWebDriver remoteWebDriver){
        super(remoteWebDriver);
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @FindBy(xpath = "//div/span[text()='Available Bookstore SOAP services:']")
    public WebElement servicesTitle;

}
