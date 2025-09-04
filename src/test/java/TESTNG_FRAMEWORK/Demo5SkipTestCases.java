package TESTNG_FRAMEWORK;

import org.testng.annotations.Test;

public class Demo5SkipTestCases {
  @Test
  public void test1() {
	  System.out.println("This is test1");
  }
  @Test
public void test2() {
	  
	  System.out.println("This is test2");
	  
}
@Test(enabled=false)
public void test3() {
	  
	  System.out.println("This is test3");
}
//skip using xml test 4

@Test
public void test4() {
	  
	  System.out.println("This is test4");
}

@Test
public void test5() {
	  
	  System.out.println("This is test5");
}

}