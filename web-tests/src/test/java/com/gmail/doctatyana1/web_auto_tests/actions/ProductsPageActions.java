package com.gmail.doctatyana1.web_auto_tests.actions;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.pages.ProductsPage;

public class ProductsPageActions extends BaseLandingPageActions implements PageAction{

    private final ProductsPage page;

    public ProductsPageActions(WebDriverProvider webDriverProvider, String url) {
        super(new ProductsPage(webDriverProvider.getRemoteWebDriver(), url));
        page=(ProductsPage) getPage();
    }

    public ProductsPageActions(WebDriverProvider webDriverProvider) {
        super(new ProductsPage(webDriverProvider.getRemoteWebDriver()));
        page = (ProductsPage) getPage();
    }

    @Override
    public boolean elementByNameIsVisible(String elementName) {
        return false;
    }

    @Override
    public boolean isPageReady() {
        return getPage().isReady();
    }

    public boolean isProductsPageTitleDisplayed(){
        return page.getProductsPageTitle().isDisplayed();
    }


}
