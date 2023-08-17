package com.gmail.doctatyana1.web_auto_tests.tests;


import static org.assertj.core.api.Assertions.assertThat;

import com.gmail.doctatyana1.web_auto_tests.actions.LandingPageActions;
import com.gmail.doctatyana1.web_auto_tests.pages.SignUpPage;
//import com.gmail.doctatyana1.web_auto_tests.actions.RestorePasswordPageActions;
import com.gmail.doctatyana1.web_auto_tests.actions.SignUpPageActions;
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

/**
 * Tests for {@link SignUpPage} page.
 */

@TestMethodOrder(OrderAnnotation.class)
class SignUpPageTest extends BaseTest {

    private static final String TEST_DATA = "src/test/resources/test-data/signUp-test-data.yaml";
    private static SignUpTestData signUpTestData;
    private static LandingPageActions landingPageActions;
    private static SignUpPageActions signUpActions;
    // private static RestorePasswordPageActions restorePasswordPageActions;


    @BeforeAll
    static void beforeAll() throws IOException {
        setUp();
        SignUpTestDataByEnv signUpTestDataByEnv =
                readTestData(new File(TEST_DATA), SignUpTestDataByEnv.class);
        signUpTestData = signUpTestDataByEnv.getEnvs().get(getEnvironment());
        signUpActions = new SignUpPageActions(provider, signUpTestData.getBasicUrl());
//        landingPageActions = new LandingPageActions(provider, signUpTestData.getBasicUrl());
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
        //Assert
        assertThat(signUpActions.isPageReady()).isTrue();
        assertThat(signUpActions.isSignUpPageTitleDisplayed()).isTrue();
        assertThat(signUpActions.isFirstNameInputEnabled()).isTrue();
        assertThat(signUpActions.isLastNameInputEnabled()).isTrue();
        assertThat(signUpActions.isAddressStreetInputEnabled()).isTrue();
        assertThat(signUpActions.isAddressCityInputEnabled()).isTrue();
        assertThat(signUpActions.isAddressStateInputEnabled()).isTrue();
        assertThat(signUpActions.isAddressZipCodeInputEnabled()).isTrue();
        assertThat(signUpActions.isPhoneNumberInputEnabled()).isTrue();
        assertThat(signUpActions.isSsnInputEnabled()).isTrue();
        assertThat(signUpActions.isUserNameInputEnabled()).isTrue();
        assertThat(signUpActions.isPasswordInputEnabled()).isTrue();
        assertThat(signUpActions.isConfirmPasswordInputEnabled()).isTrue();
        assertThat(signUpActions.isRegisterButtonEnabled()).isTrue();
    }
}


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

