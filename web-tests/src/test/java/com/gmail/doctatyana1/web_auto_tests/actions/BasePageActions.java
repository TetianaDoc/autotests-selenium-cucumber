package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public abstract class BasePageActions implements PageAction {

    private final BasePage page;

    public BasePageActions(BasePage page) {
        this.page = page;
    }

    public boolean elementByNameIsDisplayed(String elementName) {
        return page.getDriver()
                .findElement(By.xpath(String.format("//*[text()=%s]", elementName)))
                .isDisplayed();
    }

    public void tearDown() {
        page.getDriver().quit();
    }

    public BasePage getPage() {
        return page;
    }
}
