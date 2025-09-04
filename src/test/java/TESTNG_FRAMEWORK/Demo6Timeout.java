package TESTNG_FRAMEWORK;

import org.testng.annotations.Test;

public class Demo6Timeout {
	
  @Test(timeOut=5000)
  public void testTimeout1() throws InterruptedException {
	  
	  
	  System.out.println("this is test timeout 1");
	 // Thread.sleep(8000);
  
  }
  
  
  
  @Test(timeOut=5000)
  public void testTimeout2() throws InterruptedException {
	  
	  
	  System.out.println("this is test timeout 2");
	 // Thread.sleep(8000);
	  
  }
  
  @Test
  public void testTimeout3() {
	  
	  
	  System.out.println("this is test timeout 3");
	  
  }
}



