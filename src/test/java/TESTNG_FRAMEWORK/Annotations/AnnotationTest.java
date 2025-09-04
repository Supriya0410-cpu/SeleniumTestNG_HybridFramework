package TESTNG_FRAMEWORK.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
  @Test
  public void test1() {
	  System.out.println("this is test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("this is test 2");
  }
  
  
  @Test
  public void test3() {
	  System.out.println("this is test 3");
  }
  
  @Test
  public void test4() {
	  System.out.println("this is test 4");
  }
  
  //Before Method- it will run every before the method
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("this is test Before method ");
  }
  
  //After method it willl run the evry method after 
  
  @AfterMethod
  public void Amethod()
  {
	  System.out.println("this is test After method   ");
  }
  
  //before class - it will run every before the class
  
  @BeforeClass
  public void BClass()
  {
	  System.out.println("this is test Before class  ");
  }
  
  //After class- it will run every after the class
  @AfterClass
  public void AClass()
  {
	  System.out.println("this is test After class  ");
  }
  
}
