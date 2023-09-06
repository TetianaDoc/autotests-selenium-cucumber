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
            signUpPageActions.signUp(signUpTestData.getFirstName(),
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
        @Then("page is ready")
        public void pageIsReady(){
            assertThat(signUpPageActions.isPageReady()).isTrue();
        }
    }

