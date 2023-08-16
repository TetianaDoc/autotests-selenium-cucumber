package com.gmail.doctatyana1.web_auto_tests.model;
import com.gmail.doctatyana1.web_auto_tests.pages.AboutUsPage;
import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * Data for {@link AboutUsPage} tests.
 */
@Getter
@Setter
public class AboutUsTestData extends BaseTestData {

  @Getter
  @Setter
  public static class AboutUsTestDataByEnv {

    Map<Environment, AboutUsTestData> envs;
  }
}
