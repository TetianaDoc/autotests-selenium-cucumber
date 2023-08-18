package com.gmail.doctatyana1.web_auto_tests.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Base class for all tests data classes.
 */
@Getter
@Setter
public abstract class BaseTestData {

  private String basicUrl;
  private String username;
  private String password;
}
