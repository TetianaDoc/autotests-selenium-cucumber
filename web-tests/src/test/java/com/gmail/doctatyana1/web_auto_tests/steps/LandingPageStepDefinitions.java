package com.gmail.doctatyana1.web_auto_tests.steps;

import com.gmail.doctatyana1.web_auto_tests.actions.LandingPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.SignInTestData;
import com.gmail.doctatyana1.web_auto_tests.tests.BaseTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class LandingPageStepDefinitions extends BaseTest {

    private static final String TEST_DATA = "src/test/resources/test-data/signIn-test-data.yaml";

    private static SignInTestData signInTestData;
    private static LandingPageActions landingPageActions;

    @BeforeAll
    public static void beforeAll() throws IOException {
        setUp();
        SignInTestData.SignInTestDataByEnv signInTestDataByEnv =
                readTestData(new File(TEST_DATA), SignInTestData.SignInTestDataByEnv.class);
        signInTestData = signInTestDataByEnv.getEnvs().get(getEnvironment());
        landingPageActions = new LandingPageActions(provider, signInTestData.getBasicUrl());
    }

    @AfterAll
    public static void afterAll() {
        landingPageActions.tearDown();
    }
    @When("the landing page is open")
    public void theLandingPageIsOpen() {
        assertThat(landingPageActions.isPageReady()).isTrue();
    }

    @Then("{string} is visible")
    public void isVisible(String elementByName) {
        assertThat(landingPageActions.elementByNameIsDisplayed(elementByName)).isTrue();
    }

    @And("{string} is enabled")
    public void isEnabled(String elementByInputType) {
        assertThat(landingPageActions.elementByInputTypeIsEnabled(elementByInputType)).isTrue();
    }
}
