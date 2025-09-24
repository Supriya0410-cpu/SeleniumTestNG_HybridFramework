package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFile/AmazonTittle.feature",
                 glue="Com.StepDef",
                 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
               publish=true
               //  tags="@homepage" --------for single scenario run 
               //  tags="@all" -------------for all test cases run
             //  tags="@homepage or @sellpage or @mxpage"---- specific test cases to run 
               //  tags="not @homepage" ----------------------Expect homepage rel all run 
             //   tags= "not @ignore"  -------------------------Skip multiple secnario use same tag name for all test cses use this sysntax
                 
		)
public class AmzonRunner {

}
