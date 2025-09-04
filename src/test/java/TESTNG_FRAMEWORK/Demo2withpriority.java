package TESTNG_FRAMEWORK;
/*
 * Two has priority st other not check which is run first
 * 
 * 
 */
import org.testng.annotations.Test;

public class Demo2withpriority {
	@Test
	public void test1() {

		System.out.println("This is test1");
	}

@Test
	public void test2() {
		System.out.println("This is test2");
	}
     @Test(priority=1)
	public void test3() {
		System.out.println("This is test3");
	}

     @Test
	public void test4() {
		System.out.println("This is test4");
	}
    @Test(priority=2)
	public void test5() {

		System.out.println("This is test5");
	}
}
