package Test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGParametersDemo {
	
	
	
	@Test
	@Parameters({"pname"})
	public void test1(@Optional("Prince") String name) {
		
		System.out.println("Name is :" + name);
		
	}

}
