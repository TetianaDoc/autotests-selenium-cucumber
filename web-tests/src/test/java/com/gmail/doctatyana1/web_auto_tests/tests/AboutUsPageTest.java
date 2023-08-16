package com.gmail.doctatyana1.web_auto_tests.tests;

import com.gmail.doctatyana1.web_auto_tests.actions.AboutUsPageActions;
import com.gmail.doctatyana1.web_auto_tests.actions.LandingPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.AboutUsTestData;
import com.gmail.doctatyana1.web_auto_tests.pages.AboutUsPage;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AboutUsPage}.
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AboutUsPageTest extends BaseTest {

    private static final String TEST_DATA = "src/test/resources/test-data/aboutus-test-data.yaml";
    private static AboutUsTestData aboutUsTestData;
    private static AboutUsPageActions aboutUsPageActions;

    @BeforeAll
    static void beforeAll() throws IOException {
        setUp();
        AboutUsTestData.AboutUsTestDataByEnv aboutUsTestDataByEnv =
                readTestData(new File(TEST_DATA), AboutUsTestData.AboutUsTestDataByEnv.class);
        aboutUsTestData = aboutUsTestDataByEnv.getEnvs().get(getEnvironment());
        aboutUsPageActions = new AboutUsPageActions(provider, aboutUsTestData.getBasicUrl());
    }

    @AfterAll
    static void afterAll() {
        tierDown();
    }

    @Test
    @Order(1)
    void shouldProperlyDisplayedAllElementsOnAboutUsPage() {
        //Act
        //Assert
        assertThat(aboutUsPageActions.isPageReady()).isTrue();
        assertThat(aboutUsPageActions.isInfoTitleDisplayed()).isTrue();
    }
}
