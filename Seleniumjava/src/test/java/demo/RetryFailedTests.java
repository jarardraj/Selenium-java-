package demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RetryFailedTests {
	
	
	@Test
	public void test1() {
		
		System.out.println("the test executes is test : 1");
		
	}
	
	
	@Test
	public void test2() {
		
		System.out.println("the test executes is test : 2");
		//int i = 1/0;
		
	}
	
	@Test(retryAnalyzer= listeners.RetryAnalyser.class)
	public void test3() {
		
		System.out.println("the test executes is test : 3");
		
		Assert.assertFalse(true);
		
	}

}
