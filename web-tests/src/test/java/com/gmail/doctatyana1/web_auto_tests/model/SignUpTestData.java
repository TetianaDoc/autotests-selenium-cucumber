package com.gmail.doctatyana1.web_auto_tests.model;

import com.gmail.doctatyana1.web_auto_tests.core.Environment;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * Data for {@link SignUpPage} tests.
 */
@Getter
@Setter
public class SignUpTestData extends BaseTestData {

  private String basicUrl;
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private String phone;
  private String ssn;
  private String username;
  private String password;
  private String confirm;

  private String loanAmount;
  private String downPayment;
  //private String fromAccountId;

  @Getter
  @Setter
  public static class SignUpTestDataByEnv {

    Map<Environment, SignUpTestData> envs;
  }
}
