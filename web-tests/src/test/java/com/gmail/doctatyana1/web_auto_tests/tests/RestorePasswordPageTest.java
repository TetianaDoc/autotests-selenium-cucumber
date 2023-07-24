package com.gmail.doctatyana1.web_auto_tests.tests;


import static org.assertj.core.api.Assertions.assertThat;

import com.gmail.doctatyana1.web_auto_tests.actions.SignInPageActions;
import com.gmail.doctatyana1.web_auto_tests.pages.RestorePasswordPage;
import com.gmail.doctatyana1.web_auto_tests.actions.RestorePasswordPageActions;
import com.gmail.doctatyana1.web_auto_tests.actions.SignUpPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.RestorePasswordTestData;
import com.gmail.doctatyana1.web_auto_tests.model.RestorePasswordTestData.RestorePasswordTestDataByEnv;

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
 * Tests for {@link RestorePasswordPage} page.
 */
@TestMethodOrder(OrderAnnotation.class)
class RestorePasswordPageTest extends BaseTest {

  private static final String TEST_DATA = "src/test/resources/test-data/restorePassword-test-data.yaml";
  private static RestorePasswordTestData restorePasswordTestData;
  private static SignInPageActions signInActions;
  private static SignUpPageActions signUpPageActions;
  private static RestorePasswordPage restorePasswordPage;
  private static RestorePasswordPageActions restorePasswordPageActions;

  @BeforeAll
  static void beforeAll() throws IOException {
    setUp();
    RestorePasswordTestDataByEnv restorePasswordTestDataByEnv =
        readTestData(new File(TEST_DATA), RestorePasswordTestDataByEnv.class);
    restorePasswordTestData = restorePasswordTestDataByEnv.getEnvs().get(getEnvironment());
    restorePasswordPageActions = new RestorePasswordPageActions(provider, restorePasswordTestData.getBasicUrl());
    signInActions = new SignInPageActions(provider);
    signUpPageActions = new SignUpPageActions(provider);

  }

  @AfterAll
  static void afterAll() {
    tierDown();
  }

  @Test
  @Order(1)
  void shouldProperDisplayAllElementsOnRestorePasswordPage() {
    // Act
    restorePasswordPageActions.waitForCookieConsentDisplayed();

    // Assert
    assertThat(restorePasswordPageActions.isPageReady()).isTrue();
    assertThat(restorePasswordPageActions.isIconDisplayed()).isTrue();
    assertThat(restorePasswordPageActions.isRestorePasswordButtonDisabled()).isTrue();
    assertThat(restorePasswordPageActions.isRestorePasswordButtonDisplayed()).isTrue();
    assertThat(restorePasswordPageActions.isSelectLanguageButtonEnabled()).isTrue();
    assertThat(restorePasswordPageActions.isProgramVersionDisplayed()).isTrue();
    assertThat(restorePasswordPageActions.isCookieConsentDisplayed()).isTrue();
    assertThat(restorePasswordPageActions.isConfirmCookieButtonEnabled()).isTrue();
    assertThat(restorePasswordPageActions.isSupportButtonEnabled()).isTrue();
    assertThat(restorePasswordPageActions.isSignUpLinkEnabled()).isTrue();
  }

  @Test
  @Order(2)
  void shouldAcceptCookieOnRestorePasswordPage() {
    // Act
    restorePasswordPageActions.acceptCookie();

    // Assert
    assertThat(restorePasswordPageActions.isCookieConsentDisplayed()).isFalse();
  }

  @Order(3)
  @ParameterizedTest
  @ValueSource(strings = {"UA", "PL", "RU", "EN"})
  void shouldChangeLanguageOnRestorePasswordPage(String languageCode) throws Exception {
    // Act
    restorePasswordPageActions.changeLanguage(languageCode);

    // Assert
    assertThat(restorePasswordPageActions.getSelectedLanguage()).isEqualTo(languageCode);
  }

  @Test
  @Order(4)
  void shouldOpenSignInPage() {
    // Act
    restorePasswordPageActions.openSignInPage();

    // Assert
    signInActions.waitUntilRestorePasswordLinkClickable();
    assertThat(signInActions.isRestorePasswordLinkEnabled()).isTrue();
  }

  @Test
  @Order(5)
  void shouldReturnToRestorePasswordPage() {
    //Act
    signInActions.returnToRestorePasswordPage();

    //Assert
    restorePasswordPageActions.waitUntilSignInLinkClickable();
    assertThat(restorePasswordPageActions.isSignInLinkEnabled()).isTrue();
  }

  @Test
  @Order(6)
  void shouldOpenSignUpPage() {
    // Act
    restorePasswordPageActions.openSignUpPage();

    // Assert
    signUpPageActions.waitUntilRestorePasswordLinkEnabled();
    assertThat(signUpPageActions.isRestorePasswordLinkEnabled()).isTrue();
  }

  @Test
  @Order(7)
  void shouldReturnToRestorePasswordPageFromSignUpPage() {
    //Act
    signUpPageActions.returnToRestorePasswordPage();

    //Assert
    restorePasswordPageActions.waitUntilSignUpLinkEnabled();
    assertThat(restorePasswordPageActions.isSignUpLinkEnabled()).isTrue();
  }
}
