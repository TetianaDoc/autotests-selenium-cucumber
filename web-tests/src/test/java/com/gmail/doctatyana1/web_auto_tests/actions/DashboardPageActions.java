package com.gmail.doctatyana1.web_auto_tests.actions;

import com.gmail.doctatyana1.web_auto_tests.pages.DashboardPage;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * Provides actions for {@link DashboardPage} page.
 */
@Slf4j
public final class DashboardPageActions implements PageAction {

  private final DashboardPage page;

  public DashboardPageActions(WebDriverProvider webDriverProvider) {
    this.page = new DashboardPage(webDriverProvider.getRemoteWebDriver());
  }

  @Override
  public boolean isPageReady() {
    return page.isReady();
  }

  public boolean isHeaderLogoImageDisplayed() {
    return page.getHeaderLogoImage().isDisplayed();
  }
  public boolean isActualWeakAndYearDisplayed() {return page.getActualWeekAndYear().isDisplayed();}
  public boolean isCompanyNameDisplayed() {return page.getCompanyName().isDisplayed();}
  public boolean isRefreshButtonEnabled() {return page.getRefreshButton().isEnabled();}
  public boolean isProfileButtonEnabled() {return page.getProfileButton().isEnabled();}
  public boolean isMyProfileLinkEnabled() {return page.getMyProfileLink().isEnabled();}
  public boolean isLogoutLinkEnabled() {return page.getLogoutLink().isEnabled();}
  public boolean isTimetableDisplayed() {return page.getTimetable().isDisplayed();}
  public boolean isTimetableListDisplayed() {return page.getTimetableList().isDisplayed();}
  public boolean isTimetableCompaniesLinkEnabled() {return page.getTimetableCompaniesLink().isEnabled();}
  public boolean isMenuButtonEnabled() {return page.getMenuButton().isEnabled();}
  public boolean isHomeHeaderDisplayed() {return page.getHomeHeader().isDisplayed();}
  public boolean isDashboardMenuLinkEnabled() {return page.getDashboardMenuLink().isEnabled();}
  public boolean isCompanyMenuLinkEnabled() {return page.getCompanyMenuLink().isEnabled();}
  public boolean isEmployeesMenuLinkEnabled() {return page.getEmployeesMenuLink().isEnabled();}
 // public boolean isGroupsInProductsMenuLinkEnabled() {return page.getGroupsInProductsMenuLink().isEnabled();}
  //public boolean isProductsServicesInProductsMenuLinkEnabled() {
  //  return page.getProductsServicesInProductsMenuLink().isEnabled();}
  public boolean isProductsMenuLinkEnabled() {return page.getGroupsInProductsMenuLink().isEnabled();}
  public boolean isBotsMenuLinkEnabled() {return page.getBotsInBotsMenuLink().isEnabled();}
  //public boolean isHandlersInBotsMenuLinkEnabled() {return page.getHandlersInBotsMenuLink().isEnabled();}
//  public boolean isBotsInBotsMenuLinkEnabled() {return page.getBotsInBotsMenuLink().isEnabled();}
  public boolean isCrmMenuLinkEnabled() {return page.getCrmMenuLink().isEnabled();}
  public boolean isStatisticsMenuLinkEnabled() {return page.getStatisticsMenuLink().isEnabled();}
  public boolean isPreviewButtonEnabled() {return page.getPreviewButton().isEnabled();}
  public boolean isNextButtonEnabled() {return page.getNextButton().isEnabled();}
  public boolean isTodayButtonEnabled() {return page.getTodayButton().isEnabled();}
  public boolean isMonthButtonEnabled() {return page.getMonthButton().isEnabled();}
  public boolean isWeekButtonEnabled() {return page.getWeekButton().isEnabled();}
  public boolean isDayButtonEnabled() {return page.getDayButton().isEnabled();}
  public boolean isListButtonEnabled() {return page.getListButton().isEnabled();}
  public boolean isWeekViewTableDisplayed() {return page.getWeekViewTable().isDisplayed();}
  public boolean isSupportLinkEnable() {return page.getSupportLink().isEnabled();}
  public boolean isHelpLinkEnabled() {return page.getHelpLink().isEnabled();}

}
