package com.gmail.doctatyana1.web_auto_tests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Dashboard (home page after a user login) page of the app.
 */
@Getter
public final class DashboardPage extends BasePage {

  public DashboardPage(RemoteWebDriver driver) {
    super(driver);
  }

  @Override
  public boolean isReady() {
    getWait().until(visibilityOfAllElements(actualWeekAndYear));
    return actualWeekAndYear.isDisplayed();
  }

  @FindBy(css = "img[src=\"/logo_eng_background.png\"]")
  private WebElement headerLogoImage;

  @FindBy(className = "fc-left")
  private WebElement actualWeekAndYear;

  @FindBy(id="default-company-selector")
  private WebElement companyName;

  @FindBy(css="button[aria-label=\"Refresh\"]")
  private WebElement refreshButton;

  @FindBy(css="button[aria-label=\"Profile\"]")
  private WebElement profileButton;

  @FindBy(css="a[href=\"/my-profile\"]")
  private WebElement myProfileLink;

  @FindBy(css="li[class=\"MuiButtonBase-root MuiListItem-root MuiMenuItem-root logout\"]")
  private WebElement logoutLink;

  @FindBy(css="p[class=\"MuiTypography-root\"]")
  private WebElement timetable;

  @FindBy(css="ul[class=\"MuiList-root\"]")
  private WebElement timetableList;

  @FindBy(css="a[href=\"companies/6/3\"]")
  private WebElement timetableCompaniesLink;

  @FindBy(css = "button[class=\"MuiButtonBase-root MuiIconButton-root\"]")
  private WebElement menuButton;

  @FindBy(css = "h6[class*=\"MuiTypography-root\"]")
  private WebElement homeHeader;

  @FindBy(css="a[href=\"/\"]")
  private WebElement dashboardMenuLink;

  @FindBy(css = "a[href=\"/companies\"]")
  private WebElement companyMenuLink;

  @FindBy(css="a[href=\"/employees\"]")
  private WebElement employeesMenuLink;

  @FindBy(css="a[href=\"/product-groups\"]")
  private WebElement groupsInProductsMenuLink;

  @FindBy(css="a[href=\"/products\"]")
  private WebElement productsServicesInProductsMenuLink;

  @FindBy(id = "products_1")
  private WebElement productsMenuLink;

  @FindBy(id="agents_1")
  private WebElement botsMenuLink;

  @FindBy(css="a[href=\"/agent-handlers\"]")
  private WebElement handlersInBotsMenuLink;

  @FindBy(css="a[href=\"/agents\"]")
  private WebElement botsInBotsMenuLink;

  @FindBy(id="crm_1")
  private WebElement crmMenuLink;

  @FindBy(css="a[href=\"/clients\"]")
  private WebElement clientsInCrmMenuLink;

  @FindBy(css="a[href=\"/clients-support\"]")
  private WebElement supportInCrmMenuLink;

  @FindBy(css="a[href=\"/stats\"]")
  private WebElement statisticsMenuLink;

  @FindBy(css = "button[class*=\"fc-customPrev-button fc-button fc-button-primary\"]")
  private WebElement previewButton;

  @FindBy(css = "button[class*=\"fc-customNext-button fc-button fc-button-primary\"]")
  private WebElement nextButton;

  @FindBy(css = "button[class*=\"fc-customToday-button fc-button fc-button-primary\"]")
  private WebElement todayButton;

  @FindBy(css = "button[class*=\"fc-customDayGridMonth-button fc-button fc-button-primary\"]")
  private WebElement monthButton;

  @FindBy(css = "button[class*=\"fc-customTimeGridWeek-button fc-button fc-button-primary\"]")
  private WebElement weekButton;

  @FindBy(css = "button[class*=\"fc-customTimeGridDay-button fc-button fc-button-primary\"]")
  private WebElement dayButton;

  @FindBy(css = "button[class*=\"fc-customList-button fc-button fc-button-primary\"]")
  private WebElement listButton;

  @FindBy(className = "fc-view fc-timeGridWeek-view fc-timeGrid-view")
  private WebElement weekViewTable;

  @FindBy(xpath = "//main/div/div/div/div/button/span[contains(text(), 'Support')]")
  private WebElement supportLink;

  @FindBy(xpath = "//main/div/div/div/div/button/span[contains(text(), 'Help')]")
  private WebElement helpLink;

}
