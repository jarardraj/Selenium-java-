package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import WebPages.GoogleSearchPageObjects;

public class TestNgDemo2 {
	
	
	WebDriver driver1 = null;
	GoogleSearchPageObjects  gspo1= null;
	
	@BeforeTest
	public void setUP() {
		
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver1", projectloc +"/lib/drivers/chromedriver"); 
		driver1=new ChromeDriver();
		gspo1= new GoogleSearchPageObjects(driver1);		
		
	}
	
	
	
	
	@Test
	public void GoogleSearchtest3() throws InterruptedException {
		driver1.get("http://google.com");
		gspo1.setSearchText("abcd"); 
		gspo1.searhTheText();
			
		
	}
	
	@Test
	public void GoogleSearchtest4() throws InterruptedException {
		driver1.get("http://google.com");
		gspo1.setSearchText("abcd"); 
		gspo1.searhTheText();
			
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver1.close();
		driver1.quit();
		System.out.println("Test passed successfully!");
		
	}
	
	
	

}
