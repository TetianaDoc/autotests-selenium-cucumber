package com.gmail.doctatyana1.web_auto_tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        System.out.println("initialBalance:" + initialBalance);
    }

    @When("the account is credited with {double}")
    public void whenAccountIsCredited(Double amount) {
        System.out.println("initialBalance:" + amount);
    }


    @Then("account should have a balance of {double}")
    public void accountShouldHaveABalanceOf(Double arg0) {
        System.out.println("accountShouldHaveABalanceOf: " + arg0);
    }
}
