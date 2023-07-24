package com.gmail.doctatyana1.web_auto_tests.tests;

import static com.google.common.base.Strings.isNullOrEmpty;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.gmail.doctatyana1.web_auto_tests.core.Browser;
import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.core.WebDriverProvider;
import com.gmail.doctatyana1.web_auto_tests.core.utils.EncryptionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

/**
 * Basic class for all tests.
 */
@Slf4j
public abstract class BaseTest {

  protected static final Environment DEFAULT_ENVIRONMENT = Environment.PROD;
  protected static final Browser DEFAULT_BROWSER = Browser.CHROME;

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());

  protected static WebDriverProvider provider;

  private static String decryptionPassword;

  static protected void setUp() {
    try {
      decryptionPassword = Files.lines(Paths.get("src/test/resources/decr-pass"))
          .findFirst()
          .orElseThrow(FileNotFoundException::new);
    } catch (IOException e) {
      log.error("Error reading a decr-pass file, decryption key didn't set");
    }
    provider = new WebDriverProvider(getBrowser());
  }

  protected static Environment getEnvironment() {
    String environment = System.getProperty("qa.env");
    Environment environmentType;
    if (isNullOrEmpty(environment)) {
      environmentType = DEFAULT_ENVIRONMENT;
    } else {
      environmentType = Environment.valueOf(environment.toUpperCase(Locale.ROOT));
    }
    return environmentType;
  }

  static protected void tierDown() {
    provider.quit();
  }

  static protected String decrypt(String encryptedText) throws Exception {
    return EncryptionUtils.decrypt(encryptedText, decryptionPassword);
  }

  static protected <T> T readTestData(File fileData, Class<T> testDataClass)
      throws IOException {
    return OBJECT_MAPPER.readValue(fileData, testDataClass);
  }

  private static Browser getBrowser() {
    String browser = System.getProperty("qa.browser");
    Browser browserType;
    if (isNullOrEmpty(browser)) {
      browserType = DEFAULT_BROWSER;
    } else {
      browserType = Browser.valueOf(browser.toUpperCase(Locale.ROOT));
    }
    return browserType;
  }
}
