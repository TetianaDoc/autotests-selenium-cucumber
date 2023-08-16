package com.gmail.doctatyana1.web_auto_tests.model;

import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.pages.LandingPage;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * Data for {@link LandingPage} tests.
 */
@Getter
@Setter
public class SignInTestData extends BaseTestData {

  @Getter
  @Setter
  public static class SignInTestDataByEnv {

    Map<Environment, SignInTestData> envs;
  }
}
