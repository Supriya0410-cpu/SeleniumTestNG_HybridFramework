package Com.TestRunner;
/*
 * Feature contains feature file path 
 * glue contains step def pkg name [only pkg name ]
 * 
 * 
 */
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFile/googleTest.feature",
                 glue="Com.StepDef")
public class GoogleRunner {

}
