package com.gmail.doctatyana1.web_auto_tests.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import com.gmail.doctatyana1.web_auto_tests.pages.BasePage;
import com.gmail.doctatyana1.web_auto_tests.pages.HomeBasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

@Getter
public abstract class BasePageActions implements PageAction {

    private final BasePage page;

    public BasePageActions(BasePage page) {
        this.page = page;
    }

    public boolean elementByNameIsVisible(String elementName) {
        return page.getDriver().findElement(By.xpath(String.format("//*[text()=%s]", elementName))).isDisplayed();
    }

    public void tearDown() {
        page.getDriver().quit();
    }
}
