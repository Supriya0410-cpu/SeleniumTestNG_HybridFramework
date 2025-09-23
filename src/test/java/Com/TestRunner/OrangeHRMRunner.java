package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\FeatureFile\\OrangeHRM.feature" ,
         glue="Com.StepDef" ,
         publish=true)
public class OrangeHRMRunner {

}
