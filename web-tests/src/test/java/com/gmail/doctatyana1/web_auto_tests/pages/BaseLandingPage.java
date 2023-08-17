package com.gmail.doctatyana1.web_auto_tests.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Base landing page for pages {@link LandingPage}, {@link SignUpPage}, {@link RestorePasswordPage}.
 */

@Getter
public abstract class BaseLandingPage extends BasePage {

    public BaseLandingPage(RemoteWebDriver remoteWebDriver, String url) {
        super(remoteWebDriver, url);
    }

    public BaseLandingPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }

    //Elements of .leftMenu on #headerPanel

    @FindBy(className = "Solutions")
    public WebElement solutionsTitle;

    @FindBy(css = ".leftmenu>li a[href*=\"about.htm\"]")
    public WebElement aboutUsLinkOnLeftMenu;

    @FindBy(css = ".leftmenu>li a[href*=\"services.htm\"]")
    public WebElement servicesLinkOnLeftMenu;

    @FindBy(css = ".leftmenu>li a[href=\"http://www.parasoft.com/jsp/products.jsp\"]")
    public WebElement productsPageLinkOnLeftMenu;

    @FindBy(css = ".leftmenu>li a[href*=\"http://www.parasoft.com/jsp/pr/contacts.jsp\"]")
    public WebElement locationsPageLinkOnLeftMenu;

    @FindBy(css = ".leftmenu>li a[href*=\"admin.htm\"]")
    public WebElement adminPageLinkOnLeftMenu;

    //Elements of .button on #headerPanel

    @FindBy(css = ".home a[href*='/parabank/index.htm;']")
    public WebElement homeButton;

    @FindBy(css = ".button>li a[href*=\"about.htm\"]")
    public WebElement aboutUsButton;

    @FindBy(css = ".button>li a[href*=\"contact.htm\"]")
    public WebElement contactButton;

    //Elements of #loginPanel on #leftPanel of #bodyPanel

    @FindBy(css = "input[name=\"username\"]")
    public WebElement usernameInput;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement passwordInput;

    @FindBy(css = "input[value=\"Log In\"]")
    public WebElement logInButton;

    @FindBy(css = "a[href*='lookup.htm']")
    public WebElement restorePasswordLink;

    @FindBy(xpath = "//div/h2[text()=\"Customer Login\"]")
    public WebElement customerLoginTitle;

    @FindBy(css = "a[href*=\"register.htm\"]")
    public WebElement signUpLink;

    @FindBy(xpath = "//form/p/b[text()=\"Username\"]")
    public WebElement usernameTitle;

    @FindBy(xpath = "//form/p/b[text()=\"Password\"]")
    public WebElement passwordTitle;

//Elements of #topPanel

    @FindBy(css = ".logo[title=\"ParaBank\"]")
    public WebElement logoImgHomeLink;

    @FindBy(xpath = "//div/p[text()=\"Experience the difference\"]")
    public WebElement sloganTitle;

    @FindBy(className = "admin")
    public WebElement adminImgLink;

//Elements on #footermainPanel

    @FindBy(css = "#footerPanel a[href*=\"/parabank/index.htm\"]")
    public WebElement homeLinkOnFooterPanel;

    @FindBy(css = "#footerPanel a[href*=\"about.htm\"]")
    public WebElement aboutUsLinkOnFooterPanel;

    @FindBy(css = "#footerPanel a[href*=\"services.htm\"]")
    public WebElement servicesLinkOnFooterPanel;

    @FindBy(css = "#footerPanel a[href=\"http://www.parasoft.com/jsp/products.jsp\"]")
    public WebElement productsPageLinkOnFooterPanel;

    @FindBy(css = "#footerPanel  a[href*=\"http://www.parasoft.com/jsp/pr/contacts.jsp\"]")
    public WebElement locationsPageLinkOnFooterPanel;

    @FindBy(css = "#footerPanel a[href=\"http://forums.parasoft.com/\"]")
    public WebElement forumPageLink;

    @FindBy(css = "#footerPanel a[href*=\"/parabank/sitemap.htm\"]")
    public WebElement siteMapLink;

    @FindBy(css = "#footerPanel a[href*=\"contact.htm\"]")
    public WebElement contactUsLink;

    @FindBy(className = "copyright")
    public WebElement copyrightTitle;

@FindBy(css=".visit a[href=\"http://www.parasoft.com/\"]")
    public WebElement visitUsLink;
}
