package com.gmail.doctatyana1.web_auto_tests.actions;

import com.gmail.doctatyana1.web_auto_tests.pages.BasePage;
import com.gmail.doctatyana1.web_auto_tests.pages.HomeBasePage;
import lombok.Getter;

@Getter
public abstract class BaseHomePageActions extends BasePageActions {

    private final HomeBasePage page;

    public BaseHomePageActions(HomeBasePage page) {
        super(page);
        this.page = page;
    }

    public boolean isLogoImgDisplayed() {
        return page.getLogoImg().isDisplayed();
    }

    public boolean isContactButtonEnabled() {
        return page.getContactButton().isEnabled();
    }

    public abstract boolean elementByNameIsVisible(String elementName);

    public void tearDown() {

    }
}
