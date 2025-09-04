package TESTNG_FRAMEWORK;

import org.testng.annotations.Test;

public class Demo4invocationCount {
  @Test(priority=1,invocationCount=2)
  public void test1() {
  }
  
  @Test(priority=2)
public void test2() {
	  
	  System.out.println("This is test2");
	  
}

  @Test(priority=3,invocationCount=2)
public void test3() {
	  
	  System.out.println("This is test2");
}
  @Test(description="this is functional test")
public void test4() {
	  
	  System.out.println("This is test2");
}

}

