package TESTNG_FRAMEWORK;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo8Groups {
  @Test(priority=4 , groups="smoke")
  public void test1() {
	  
	  System.out.println("This is test 1 :-smoke ");
  }
  
  @Test(priority=1, groups="regression")
  public void test2() {
	  
	  System.out.println("This is test 2 :-Regression");
  }
  
  
  @Test(priority=3, groups="Regression")
  public void test3() {
	  
	  System.out.println("This is test 3:-Regression ");
  }
  
  
  @Test(priority=5, groups="Functional")
  public void test4() {
 
  
  System.out.println("This is test 4:-Functional");
  
  }
  @Test(priority=2 ,groups="smoke")
  public void test5() {
	  
	  System.out.println("This is test 5 :-smoke");
  }
}
