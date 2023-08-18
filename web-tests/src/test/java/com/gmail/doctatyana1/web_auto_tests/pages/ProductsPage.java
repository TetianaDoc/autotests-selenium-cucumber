package com.gmail.doctatyana1.web_auto_tests.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

@Getter
public class ProductsPage extends BaseLandingPage {

    public ProductsPage(RemoteWebDriver driver, String url) {
        super(driver, url);
        load();
        isLoaded();
    }

    public ProductsPage(RemoteWebDriver driver) {
        super(driver);
        isLoaded();
    }

    @Override
    public boolean isReady() {
        getWait().until(visibilityOfAllElements(productsPageTitle));
        return productsPageTitle.isDisplayed();
    }

    @FindBy(xpath = "//div/h1[text()='Innovative and Intelligent Software Testing Platform']")
    private WebElement productsPageTitle;
}

