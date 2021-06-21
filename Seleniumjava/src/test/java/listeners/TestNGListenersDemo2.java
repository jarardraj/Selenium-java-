package listeners;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListenersDemo2 {
	
	@Test
	public void test4() {
		
		System.out.println("The test number is :  4");
	}
	
	
	@Test
	public void test5() {
		
		System.out.println("The test number is :  5");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test6() {
		
		System.out.println("The test number is :  6");
		throw new SkipException("this test is skipped");
	}

}
