package TESTNG_FRAMEWORK.Annotations;

import org.testng.annotations.Test;

public class ClassB extends BaseTest {
  @Test
  public void test1() {
	  
	  System.out.println("This is first method from Class B ");
  }
  
  
  @Test
  public void test2() {
	  System.out.println("This is SECOND method from Class B ");
  }
  
  
  @Test
  public void test3() {
	  
	  System.out.println("This is THIRD method from Class B ");
  }
}
