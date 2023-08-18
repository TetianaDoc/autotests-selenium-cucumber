package com.gmail.doctatyana1.web_auto_tests.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css = "a[id=\"hs-eu-confirmation-button\"]")
    private WebElement cookieConsent;

    @FindBy(xpath = "//p[@class=\"h6\" and text()='Quick links']")
    private WebElement quickLinksTitle;

    @FindBy(xpath = "//p[@class='h6' and text()='PARASOFT HEADQUARTERS']")
    private WebElement headquartersTitle;

    @FindBy(css="select[aria-label='Select Language']")
    private WebElement selectLanguageMenu;

    @FindBy(css=".gt_selector option[selected]")
    private WebElement selectedLanguage;

    @FindBy(css = "  option[value]")
    private List<WebElement> languagesList;

}

