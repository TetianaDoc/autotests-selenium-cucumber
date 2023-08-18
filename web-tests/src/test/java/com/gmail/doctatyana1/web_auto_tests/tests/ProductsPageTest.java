package com.gmail.doctatyana1.web_auto_tests.tests;

import com.gmail.doctatyana1.web_auto_tests.actions.ProductsPageActions;
import com.gmail.doctatyana1.web_auto_tests.model.ProductsTestData;
import com.gmail.doctatyana1.web_auto_tests.pages.ProductsPage;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ProductsPage}
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ProductsPageTest extends BaseTest {

    private static String TEST_DATA = "src/test/resources/test-data/products-test-data.yaml";
    private static ProductsPageActions productsPageActions;
    private static ProductsTestData productsTestData;

    @BeforeAll
    static void beforeAll() throws IOException {
        setUp();
        ProductsTestData.ProductsTestDataByEnv productsTestDataByEnv =
                readTestData(new File(TEST_DATA), ProductsTestData.ProductsTestDataByEnv.class);
        productsTestData = productsTestDataByEnv.getEnvs().get(getEnvironment());
        productsPageActions = new ProductsPageActions(provider, productsTestData.getBasicUrl());
    }

    @AfterAll
    static void afterAll() {
        tierDown();
    }

    @Test

    @Order(1)
    void shouldDisplayProperlyAllElementsOnProductsPage() {
        //Assert
        assertThat(productsPageActions.isProductsPageTitleDisplayed()).isTrue();
        assertThat(productsPageActions.isCookieConsentDisplayed()).isTrue();
        assertThat(productsPageActions.isQuickLinksTitleDisplayed()).isTrue();
        assertThat(productsPageActions.isHeadquartersTitleDisplayed()).isTrue();
    }

    @Test
    @Order(2)
    void shouldAcceptCookieOnProductsPage() {
        //Act
        productsPageActions.waitForCookieConsentDisplayed();
        productsPageActions.acceptCookie();

        // Assert
        assertThat(productsPageActions.isCookieConsentDisplayed()).isFalse();
    }

}

