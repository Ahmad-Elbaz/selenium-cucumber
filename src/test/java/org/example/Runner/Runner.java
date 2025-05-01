package org.example.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // copy path of features files to run
        features = "src/main/resources/features",
        // copy file name that have files run step def
        glue = "org.example.StepDef",
        // add tag to feature file to be run in runner
        // tag can add to feature file or secanrio
        tags = "@reg",
        // genaration of report
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"

        }

)

public class Runner extends AbstractTestNGCucumberTests {


}
