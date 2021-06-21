package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportwithTestng {

	ExtentSparkReporter html;
	ExtentReports extent ;
	ExtentTest test1;
	WebDriver driver;


	@BeforeSuite
	public void setUp() {

		html = new ExtentSparkReporter("Extent2.html");
		extent =  new ExtentReports();
		extent.attachReporter(html);
		//test1= extent.createTest("Google Search", "Search ABCS on google");

	}
	
	@BeforeTest
	public void setUpTest() {
		
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		driver = new ChromeDriver();
		
	}


	@Test
	public void test1() {
		test1= extent.createTest("Google Search", "Search ABCS on google");
	  test1.info("Starting the test");
	  driver.get("https://google.com");
	  test1.log(Status.INFO, "getting the url");
	  test1.pass("got the url");
		

	}

	@Test
	public void test2() {
		test1= extent.createTest("Google Search", "Search ABCS on google");
		  test1.info("Starting the test");
		  driver.get("https://google.com");
		  test1.log(Status.INFO, "getting the url");
		  test1.fail("did not get the url");
			

		}
	
	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test completed Successfully");
		
		}
	
	
	
	@AfterSuite
	public void teardown() {
		extent.flush();

	}

}

