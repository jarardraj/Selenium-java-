package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencytest {

	
	
	@Test(groups = {"Sanity"})
		public void test1() {
		
		System.out.println("This is test number : 1");
		//Assert.assertFalse(true);
			
	}
	
	@Test(groups = {"Sanity"})
	public void test2() {
	
	System.out.println("This is test number : 2");
	
	}

	@Test(dependsOnGroups= {"Sanity"})
	public void test3() {
	
	System.out.println("This is test number : 3");
	
	}
	
	
	
	
	
	
}
