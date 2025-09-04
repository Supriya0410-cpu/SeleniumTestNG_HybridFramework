package TESTNG_FRAMEWORK;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo7_depensOnMethod {
  @Test
  public void test1() {
	  
	  System.out.println("This is test  1 ");
	  
	 // assert.assertFalse(false," Manually failed this testcse bcz check depend method beheviour");
	  Assert.assertEquals(false,true,"Fail as values not equal");
  }
  
  @Test(dependsOnMethods="test1")
  public void test2() {
	  
	  System.out.println("This is test  3 ");
  }
  
  
  
  @Test(dependsOnMethods="test2")
  public void test3() {
	  
	  System.out.println("This is test  3 ");
  }
  
  
}
