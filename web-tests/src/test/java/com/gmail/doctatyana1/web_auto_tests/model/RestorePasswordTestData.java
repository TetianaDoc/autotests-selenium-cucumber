package com.gmail.doctatyana1.web_auto_tests.model;

import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.pages.RestorePasswordLandingPage;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * Data for {@link RestorePasswordLandingPage} tests.
 */
@Getter
@Setter
public class RestorePasswordTestData extends BaseTestData {

  @Getter
  @Setter
  public static class RestorePasswordTestDataByEnv {

    Map<Environment, RestorePasswordTestData> envs;
  }
}
