package TESTNG_FRAMEWORK.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
  @BeforeTest
  public void BTest() {
	  
	  System.out.println("This is method BeforeTest");
  }
  
  
  @AfterTest
  public void ATest() {
	  System.out.println("This is method AfterTest");
  }
  
  @BeforeSuite
  public void Bsuite() {
	  
	  System.out.println("This is method Beforesuite");
  }
  
  @AfterSuite
  public void ASuite() {
	  
	  System.out.println("This is method Aftersuite");
  }
}
