package TESTNG_FRAMEWORK.Annotations;

import org.testng.annotations.Test;

public class ClassA extends BaseTest {
  @Test
  public void test1() {
	  
	  System.out.println("This is first method from Class A ");
  }
  
  @Test
  public void test2() {
	  
	  System.out.println("This is second method from Class A ");
  }
}
