package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelDemo {

	WebDriver driver = null;
	String projectloc = System.getProperty("user.dir");
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		
		System.out.println("The browser name is " + browser);
		System.out.println(Thread.currentThread().getId());
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver");
			driver = new ChromeDriver();
			
			
					
		}
		
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectloc +"/lib/drivers/geckodriver");
			driver = new FirefoxDriver();
			
			
		}
		
	}
	
	
	@Test
	public void test() {
		
	driver.get("https://google.co.uk");	
		
	}
	

	@AfterTest
	public void tearDown() {
		System.out.println("Test completed successfully");
		
		driver.close();
		//driver.quit();
		
	}
	
	
	
}
