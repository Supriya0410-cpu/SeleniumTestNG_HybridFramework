package TESTNG_FRAMEWORK.Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(MyListener.class)
public class TestListeners {
  @Test
public void Test1() {
	  
	  
	  AssertJUnit.assertEquals(true, true);
	  System.out.println("test 1 pass ");
  }
  
  
  
  
  @Test
public void Test2() {
	  
	  
	  AssertJUnit.assertEquals(true, true);
	  System.out.println("test 2 pass ");
  }

  
  @Test
public void Test3() {
	  
	  
	  
	  AssertJUnit.assertEquals(true, true);
	  System.out.println("test 3 pass ");
  }
  
  
  
  
}
