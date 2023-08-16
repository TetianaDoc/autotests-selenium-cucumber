package com.gmail.doctatyana1.web_auto_tests.model;

import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.pages.ServicesPage;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * Data for {@link ServicesPage} tests.
 */
@Getter
@Setter
public class ServicesTestData extends BaseTestData {

  @Getter
  @Setter
  public static class ServicesTestDataByEnv {

    Map<Environment, ServicesTestData> envs;
  }
}
