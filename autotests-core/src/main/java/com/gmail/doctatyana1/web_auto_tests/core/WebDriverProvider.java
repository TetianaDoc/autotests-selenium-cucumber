package com.gmail.doctatyana1.web_auto_tests.core;

import java.io.File;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Instantiates a web driver instance.
 */
@Slf4j
public final class WebDriverProvider {

  private static final int IMPLICITLY_WAIT_SECS = 20;

  private static final OsType OS = OsType.from(System.getProperty("os.name"));

  private static final File LINUX_CHROME_DRIVER = new File(
      "../autotests-core/src/main/resources/web/drivers/linux/chromedriver");
  private static final File LINUX_FIREFOX_DRIVER = new File(
      "../autotests-core/src/main/resources/web/drivers/linux/geckodriver");
  private static final File MAC_CHROME_DRIVER = new File(
      "../autotests-core/src/main/resources/web/drivers/mac/chromedriver");
  private static final File MAC_FIREFOX_DRIVER = new File(
      "../autotests-core/src/main/resources/web/drivers/mac/chromedriver");

  private final RemoteWebDriver remoteWebDriver;

  public RemoteWebDriver getRemoteWebDriver() {
    return remoteWebDriver;
  }

  public WebDriverProvider(Browser browser) {
    log.info("Instantiating a WebDriver for OS {} and browser {}", OS, browser);
    this.remoteWebDriver = startRemoteWebDriver(browser);
    remoteWebDriver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECS, TimeUnit.SECONDS);
  }

  public void quit() {
    remoteWebDriver.quit();
  }

  private static RemoteWebDriver startRemoteWebDriver(Browser browser) {
    switch (browser) {
      case CHROME:
        System.setProperty("webdriver.chrome.driver", getPathToChromeDriver());
        return startChrome();
      case EDGE:
        return startEdge();
      case IE:
        return startInternetExplore();
      case FIREFOX:
        System.setProperty("webdriver.geckodriver.driver", getPathToFirefoxDriver());
        return startFirefox();
      case SAFARI:
        return startSafari();
      default:
        throw new UnsupportedOperationException("Unsupported browser " + browser);
    }
  }

  private static String getPathToChromeDriver() {
    switch (OS) {
      case LINUX:
        return LINUX_CHROME_DRIVER.getAbsolutePath();
      case MAC:
        return MAC_CHROME_DRIVER.getAbsolutePath();
      default:
        throw new UnsupportedOperationException("Unsupported chrome driver for OS " + OS);
    }
  }

  private static String getPathToFirefoxDriver() {
    switch (OS) {
      case LINUX:
        return LINUX_FIREFOX_DRIVER.getAbsolutePath();
      case MAC:
        return MAC_FIREFOX_DRIVER.getAbsolutePath();
      default:
        throw new UnsupportedOperationException("Unsupported firefox driver for OS " + OS);
    }
  }

  private static RemoteWebDriver startChrome() {
    return new ChromeDriver();
  }

  private static RemoteWebDriver startEdge() {
    return new EdgeDriver();
  }

  private static RemoteWebDriver startInternetExplore() {
    return new InternetExplorerDriver();
  }

  private static RemoteWebDriver startFirefox() {
    return new FirefoxDriver();
  }

  private static RemoteWebDriver startSafari() {
    return new SafariDriver();
  }
}
