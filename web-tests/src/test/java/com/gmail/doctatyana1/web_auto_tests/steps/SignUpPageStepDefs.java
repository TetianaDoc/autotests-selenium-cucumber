package com.gmail.doctatyana1.web_auto_tests.steps;

import com.gmail.doctatyana1.web_auto_tests.actions.SignUpPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.SignUpTestData;
import com.gmail.doctatyana1.web_auto_tests.tests.BaseTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPageStepDefs extends BaseTest {
    private static final String TEST_DATA = "src/test/resources/test-data/signUp-test-data.yaml";
    private static SignUpPageActions signUpPageActions;
    private static SignUpTestData signUpTestData;

    @BeforeAll
    public static void beforeAll() throws IOException {
        setUp();
        SignUpTestData.SignUpTestDataByEnv signUpTestDataByEnv =
                readTestData(new File(TEST_DATA), SignUpTestData.SignUpTestDataByEnv.class);
        signUpTestData = signUpTestDataByEnv.getEnvs().get(getEnvironment());
        signUpPageActions = new SignUpPageActions(provider, signUpTestData.getBasicUrl());
    }


    @AfterAll
    public static void afterAll() {
        signUpPageActions.tearDown();
    }

    @When("input data and click register button")
    public void inputDataAndClickRegisterButton() {
        signUpPageActions.signUp(
                signUpTestData.getFirstName(),
                signUpTestData.getLastName(),
                signUpTestData.getAddress(),
                signUpTestData.getCity(),
                signUpTestData.getState(),
                signUpTestData.getZipCode(),
                signUpTestData.getPhone(),
                signUpTestData.getSsn(),
                signUpTestData.getUsername(),
                signUpTestData.getPassword(),
                signUpTestData.getConfirm());
    }

    @Then("registration confirmation text is displayed")
    public void registrationConfirmationTextIsDisplayed() {
        assertThat(signUpPageActions.isRegistrationConfirmationTextDisplayed()).isTrue();
    }

    @Then("loan request processed title displayed")
    public void loanRequestProcessedTitleDisplayed() {
        assertThat(signUpPageActions.isLoanRequestProcessedTitleDisplayed()).isTrue();
    }

    @When("click on Request loan link and input data and click apply now button")
    public void requestLoan() {
        signUpPageActions.requestLoan(
                signUpTestData.getLoanAmount(),
                signUpTestData.getDownPayment());
    }

    @When("click on logout button")
    public void logOut() {
        signUpPageActions.logOut();
    }

    @Then("username input field enabled")
    public void usernameInputEnabled() {
        assertThat(signUpPageActions.isUsernameInputEnabled()).isTrue();
    }

    @When("click on Update profile link and input data and click update")
    public void updateProfile() {
        signUpPageActions.updateProfile(
                signUpTestData.getFirstNameUpdated(),
                signUpTestData.getLastNameUpdated(),
                signUpTestData.getStreetUpdated(),
                signUpTestData.getCityUpdated(),
                signUpTestData.getStateUpdated(),
                signUpTestData.getZippCodeUpdated());
    }

    @Then("profile updated title is displayed")
    public void profileUpdatedTitleIsDisplayed() {
        assertThat(signUpPageActions.isProfileUpdatedTitleDisplayed()).isTrue();
    }
}

