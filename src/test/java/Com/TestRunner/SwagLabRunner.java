package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\FeatureFile\\SwagLab.feature" ,
         glue={"Com.StepDef" ,"Com.apphooks"},
         publish=true)
public class SwagLabRunner {

}
