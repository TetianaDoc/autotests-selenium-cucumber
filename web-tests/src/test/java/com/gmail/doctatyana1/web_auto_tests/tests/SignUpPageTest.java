package com.gmail.doctatyana1.web_auto_tests.tests;


import static org.assertj.core.api.Assertions.assertThat;

import com.gmail.doctatyana1.web_auto_tests.actions.SignInPageActions;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;
//import com.gmail.doctatyana1.web_auto_tests.actions.RestorePasswordPageActions;
//import com.gmail.doctatyana1.web_auto_tests.actions.SignUpPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.SignUpTestData;
import com.gmail.doctatyana1.web_auto_tests.model.SignUpTestData.SignUpTestDataByEnv;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests for {@link SignUpPage} page.
 */
@TestMethodOrder(OrderAnnotation.class)
class SignUpPageTest extends BaseTest {

  private static final String TEST_DATA = "src/test/resources/test-data/signUp-test-data.yaml";
  private static SignUpTestData signUpTestData;
  private static SignInPageActions signInPageActions;
 // private static SignUpPageActions signUpActions;
 // private static RestorePasswordPageActions restorePasswordPageActions;


  @BeforeAll
  static void beforeAll() throws IOException {
    setUp();
    SignUpTestDataByEnv signUpTestDataByEnv =
        readTestData(new File(TEST_DATA), SignUpTestDataByEnv.class);
    signUpTestData = signUpTestDataByEnv.getEnvs().get(getEnvironment());
 //   signUpActions = new SignUpPageActions(provider, signUpTestData.getBasicUrl());
    signInPageActions = new SignInPageActions(provider);
   // restorePasswordPageActions = new RestorePasswordPageActions(provider);
  }

  @AfterAll
  static void afterAll() {
    tierDown();
  }

  @Test
  @Order(1)
  void shouldProperDisplayAllElementsOnSignUpPage() {
    // Act
//    signUpActions.waitForCookieConsentDisplayed();
    // Assert
//    assertThat(signUpActions.isPageReady()).isTrue();
//    assertThat(signUpActions.isRestorePasswordLinkEnabled()).isTrue();
//    assertThat(signUpActions.isSelectedPackageButtonEnabled()).isTrue();
//    assertThat(signUpActions.isLogoImgDisplayed()).isTrue();
//    assertThat(signUpActions.isFirstNameInputEnabled()).isTrue();
//    assertThat(signUpActions.isRecaptchaDisplayed()).isTrue();
  }

  @Test
  @Order(2)
  void shouldAcceptCookieOnSignInPage() {
    // Act
    //signUpActions.acceptCookie();

    // Assert
    //assertThat(signUpActions.isCookieConsentDisplayed()).isFalse();
  }}

//  @Order(3)
//  @ParameterizedTest
//  @ValueSource(strings = {"UA", "PL", "RU", "EN"})
//  void shouldChangeLanguageOnSignUpPage(String languageCode) throws Exception {
//    // Act
//    signUpActions.changeLanguage(languageCode);
//
//    // Assert
//    assertThat(signUpActions.getSelectedLanguage()).isEqualTo(languageCode);
//  }
//
//  @Order(4)
//  @ParameterizedTest
//  @ValueSource(strings = {"FREE", "S", "M"})
//  void shouldChangeLanguageOnSignInPage(String packageCode) {
//    // Act
//    signUpActions.changePackage(packageCode);
//
//    // Assert
//    assertThat(signUpActions.getSelectedPackage()).isEqualTo(packageCode);
//  }
//
//  @Test
//  @Order(5)
//  void shouldOpenSignInPage() {
//    // Act
//    signUpActions.openSignInPage();
//
//    // Assert
//    signInPageActions.waitUntilSignUpLinkClickable();
//    assertThat(signInPageActions.isSignUpLinkEnabled()).isTrue();
//  }
//
//  @Test
//  @Order(6)
//  void shouldReturnToSignUpPage() {
//    //Act
//    signInPageActions.returnToSignUpPage();
//
//    //Assert
//    signUpActions.waitUntilSignInLinkClickable();
//    assertThat(signUpActions.isSignInLinkEnabled()).isTrue();
//  }
//
//  @Test
//  @Order(7)
//  void shouldOpenRestorePasswordPage() {
//    //Act
//    signUpActions.openRestorePasswordPage();
//
//    //Assert
//    restorePasswordPageActions.waitUntilSignUpLinkEnabled();
//    assertThat(restorePasswordPageActions.isSignUpLinkEnabled()).isTrue();
//  }
//
//  @Test
//  @Order(8)
//  void shouldReturnToSignUpPageFromRestorePasswordPage() {
//    //Act
//    restorePasswordPageActions.returnToSignUpPage();
//
//    //Assert
//    signUpActions.waitUntilSignInLinkClickable();
//    assertThat(signUpActions.isSignInLinkEnabled()).isTrue();
//  }
//}
