package Test;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	
	
	
	@Test(groups= {"Sanity", "Smoke"})
	public void test1() {
		
		System.out.println("This is the test number : 1 which is sanity and smoke");
		
	}
	
	

	@Test(groups= {"Acceptance", "Smoke"})
	public void test2() {
		
		System.out.println("This is the test number : 2 which is acceptance and smoke");
		
	}
	
	
	@Test(groups ={"Smoke", "Regression"})
	public void test3() {
		
		System.out.println("This is the test number : 3 which is smoke and regression");
		
	}
	

	
	@Test
	public void test4() {
		
		System.out.println("This is the test number : 4 not classification");
		
	}
	
	
}
