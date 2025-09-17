package TESTNG_FRAMEWORK.Listeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo1 {
	@Test
	public void testreport() {



		//create instance of ExtentReports class
		ExtentReports report = new ExtentReports();

		//create instance of ExtentSparkReporter class to provide path of report

		ExtentSparkReporter spark = new  ExtentSparkReporter(System.getProperty("user.dir")+"//TestReport//AutomationReport.html");

		//Add configuration For your Project 

		spark.config().setDocumentTitle("Extent Report");
		spark.config().setReportName("CRMTest Report");
		spark.config().setTheme(Theme.DARK);

		//attach the report

		report.attachReporter(spark);

		//create test

		ExtentTest test=report.createTest("CRMTest");

		//Add log 

		test.log(Status.INFO, "This is information ");
		test.log(Status.PASS,"This is for Pass status...");
		test.log(Status.FAIL,"This is for Fail status...");
		test.log(Status.SKIP,"This is for Skip status...");
		test.log(Status.WARNING,"This is warning status...");



		//flush():close the report

		report.flush();

	}
}
