package TESTNG_FRAMEWORK.ExtentReportUtility;
/*
 * Here this utility useful for all Cases 
 * We just need to update the reportname and path according to our requriment
 * 
 * 
 * 
 * 
 */
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager
{

public static ExtentReports extent;
	
	
	public static ExtentReports getInstance()
	{
		
		if(extent==null)
		{
			extent=createInstance();
			return extent;
		}
		else 
		{
			return extent;
		}
		
	}
	
   static String rname;
	public static ExtentReports createInstance()
	{
		 String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		   rname="CRMTestReport"+timestamp+".html";
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/TestReport/"+rname);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("CRMTesteport");
		sparkReporter.config().setDocumentTitle("Extent_Report");
	
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		return extent;
	}

}