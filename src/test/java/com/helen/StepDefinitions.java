package com.helen;

import io.cucumber.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Then("result is {string}")
    public void resultIsP1(String p1) {
        actionwords.resultIsP1(p1);
    }

    @Given("have 9")
    public void have9() {
        actionwords.have9();
    }

    @When("take away 4")
    public void takeAway4() {
        actionwords.takeAway4();
    }

    @Given("have {string}")
    public void haveP(String p) {
        actionwords.haveP(p);
    }

    @When("add {string}")
    public void addP(String p) {
        actionwords.addP(p);
    }
}