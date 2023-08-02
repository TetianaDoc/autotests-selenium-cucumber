package com.gmail.doctatyana1.web_auto_tests.tests;


import static org.assertj.core.api.Assertions.assertThat;

import com.gmail.doctatyana1.web_auto_tests.actions.DashboardPageActions;
import com.gmail.doctatyana1.web_auto_tests.actions.SignInPageActions;
import com.gmail.doctatyana1.web_auto_tests.pages.SignInPage;
//import com.gmail.doctatyana1.web_auto_tests.actions.RestorePasswordPageActions;
//import com.gmail.doctatyana1.web_auto_tests.actions.SignUpPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.SignInTestData;
import com.gmail.doctatyana1.web_auto_tests.model.SignInTestData.SignInTestDataByEnv;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests for {@link SignInPage} page.
 */
@TestMethodOrder(OrderAnnotation.class)
class SignInPageTest extends BaseTest {

  private static final String TEST_DATA = "src/test/resources/test-data/signIn-test-data.yaml";
  private static SignInTestData signInTestData;
  private static SignInPageActions signInActions;
 // private static DashboardPageActions dashboardPageActions;
 // private static SignUpPageActions signUpPageActions;
  //private static RestorePasswordPageActions restorePasswordPageActions;

  @BeforeAll
  static void beforeAll() throws IOException {
    setUp();
    SignInTestDataByEnv signInTestDataByEnv =
        readTestData(new File(TEST_DATA), SignInTestDataByEnv.class);
    signInTestData = signInTestDataByEnv.getEnvs().get(getEnvironment());
    signInActions = new SignInPageActions(provider, signInTestData.getBasicUrl());
    //dashboardPageActions = new DashboardPageActions(provider);
    //signUpPageActions = new SignUpPageActions(provider);
   // restorePasswordPageActions = new RestorePasswordPageActions(provider);
  }

  @AfterAll
  static void afterAll() {
    tierDown();
  }

  @Test
  @Order(1)
  void shouldProperDisplayAllElementsOnSignInPage() {
//    // Act
//    signInActions.waitForCookieConsentDisplayed();

    // Assert
    assertThat(signInActions.isPageReady()).isTrue();
    assertThat(signInActions.isLogInButtonEnabled()).isTrue();
    assertThat(signInActions.isRestorePasswordLinkEnabled()).isTrue();
    assertThat(signInActions.isLogoImgEnabled()).isTrue();
    assertThat(signInActions.isAboutUsButtonEnabled()).isTrue();
    assertThat(signInActions.isContactButtonEnabled()).isTrue();
    assertThat(signInActions.isHomeButtonEnabled()).isTrue();
    assertThat(signInActions.isSignUpLinkEnabled()).isTrue();
  }

//  @Test
//  @Order(2)
//  @Disabled
//  void shouldAcceptCookieOnSignInPage() {
//    // Act
//    signInActions.acceptCookie();
//
//    // Assert
//    assertThat(signInActions.isCookieConsentDisplayed()).isFalse();
//  }


//  @Test
//  @Order(4)
//  @Disabled
//  void shouldOpenSignUpPage() {
//    // Act
//    signInActions.openSignUpPage();
//
//    // Assert
//    signUpPageActions.waitUntilSignInLinkClickable();
//    assertThat(signUpPageActions.isSelectedPackageButtonEnabled()).isTrue();
//  }

//  @Test
//  @Order(5)
//  @Disabled
//  void shouldReturnToSignInPage() {
//    //Act
//    signUpPageActions.returnToSignInPage();
//
//    //Assert
//    signInActions.waitUntilSignUpLinkClickable();
//    assertThat(signInActions.isSignUpLinkEnabled()).isTrue();
//  }

//  @Test
//  @Order(6)
//  @Disabled
//  void shouldOpenRestorePasswordPage() {
//    // Act
//    signInActions.openRestorePasswordPage();
//
//    // Assert
//    restorePasswordPageActions.waitUntilSignInLinkEnabled();
//    assertThat(restorePasswordPageActions.isSignInLinkEnabled()).isTrue();
//  }

//  @Test
//  @Order(7)
//  @Disabled
//  void shouldReturnToSignInPageFromRestorePasswordPage() {
//    //Act
//    restorePasswordPageActions.returnToSignInPage();
//
//    //Assert
//    signInActions.waitUntilSignUpLinkClickable();
//    assertThat(signInActions.isSignUpLinkEnabled()).isTrue();
//  }

//  @Test
//  @Order(8)
//  @Disabled
//  void shouldLogonUserAndOpenDashboardHomePage() throws Exception {
//    // Act
//    signInActions.signIn(signInTestData.getUserOrEmail(), decrypt(signInTestData.getPassword()));
//
//    // Assert
//    assertThat(dashboardPageActions.isPageReady()).isTrue();
//    assertThat(dashboardPageActions.isHeaderLogoImageDisplayed()).isTrue();
}

