package TESTNG_FRAMEWORK.Listeners;
/*
 * Listerner implementation ways 2 
 * 1 using @listerners 
 * 2. uing xml file 
 * below the suite tag 
 * <listerners >
 * <listername = pkgname . class name  />
 * </listerns>
 * 
 * 
 */
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
 
	  
	  public void onTestStart(ITestResult res)
		{
			System.out.println("Test started..."+res.getName());
		}

		public void onTestSuccess(ITestResult res)
		{
			System.out.println("Test Pass status: "+res.getName());
		}
		
		public void onTestFailure(ITestResult res)
		{
			System.out.println("Test Fail status: "+res.getName());
		}
  }



