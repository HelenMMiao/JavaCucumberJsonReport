package com.helen;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue = "com.helen",
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}
        )

public class TestRunner {
}