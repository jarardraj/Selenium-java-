package listeners;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListenersDemo {
	
	@Test
	public void test1() {
		
		System.out.println("The test number is :  1");
	}
	
	
	@Test
	public void test2() {
		
		System.out.println("The test number is :  2");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test3() {
		
		System.out.println("The test number is :  3");
		throw new SkipException("this test is skipped");
	}

}
