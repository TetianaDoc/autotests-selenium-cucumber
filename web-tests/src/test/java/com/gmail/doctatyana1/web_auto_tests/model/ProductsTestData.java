package com.gmail.doctatyana1.web_auto_tests.model;
import com.gmail.doctatyana1.web_auto_tests.pages.ProductsPage;
import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * Data for {@link ProductsPage} tests.
 */
@Getter
@Setter
public class ProductsTestData extends BaseTestData {

  @Getter
  @Setter
  public static class ProductsTestDataByEnv {

    Map<Environment, ProductsTestData> envs;
  }
}
