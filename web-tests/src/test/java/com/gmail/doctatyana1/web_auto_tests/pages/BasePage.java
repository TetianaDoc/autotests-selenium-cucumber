package com.gmail.doctatyana1.web_auto_tests.pages;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Wait;

/**
 * Base page for page that requires features of {@link LoadableComponent}.
 */
@Slf4j
public abstract class BasePage extends LoadableComponent<BasePage> {

  private final RemoteWebDriver driver;
  private final Wait<WebDriver> wait;
  private final String url;

  public BasePage(RemoteWebDriver driver) {
    this(driver, null);
  }

  public BasePage(RemoteWebDriver driver, String url) {
    this.driver = driver;
    this.url = url;
    wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5));
    PageFactory.initElements(driver, this);
  }

  protected RemoteWebDriver getDriver() {
    return driver;
  }

  public Wait<WebDriver> getWait() {
    return wait;
  }

  @Override
  protected void load() {
    checkArgument(!isNullOrEmpty(url), "Parameter 'url' must be set");
    log.info("Loading a page with url {}", url);
    driver.get(url);
  }

  @Override
  protected void isLoaded() throws Error {
    if (pageSourcePresents(driver)) {
      log.info("The page {} loaded successfully", this.getClass().getName());
      return;
    }
    throw new Error("Error load a page " + this.getClass().getName());
  }

  private static boolean pageSourcePresents(RemoteWebDriver driver) {
    String source;
    try {
      source = driver.executeScript("return document.body.innerHTML").toString();
    } catch (Exception ex) {
      log.warn("Error executing a innerHtml script", ex);
      source = driver.getPageSource();
    }
    log.debug("Page source of length {} {}",
        source.length(), source.length() > 500 ? source.substring(0, 500) : source);
    return true;
  }

  public abstract boolean isReady();


}
