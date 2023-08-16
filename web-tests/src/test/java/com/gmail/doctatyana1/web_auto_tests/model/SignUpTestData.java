package com.gmail.doctatyana1.web_auto_tests.model;

import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpLandingPage;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * Data for {@link SignUpLandingPage} tests.
 */
@Getter
@Setter
public class SignUpTestData extends BaseTestData {

  @Getter
  @Setter
  public static class SignUpTestDataByEnv {

    Map<Environment, SignUpTestData> envs;
  }
}
