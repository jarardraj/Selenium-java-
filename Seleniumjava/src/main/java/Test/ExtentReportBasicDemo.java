package Test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WebPages.GoogleSearchPage;

public class ExtentReportBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("extent.html");
		ExtentReports  extrep = new ExtentReports();
		extrep.attachReporter(reporter);
		
		ExtentTest test1= extrep.createTest("Google Search", "Search ABCS on google");
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://google.com");
		test1.info("Navigated to google.com");
		WebElement search1= GoogleSearchPage.Search_textbox(driver);
		search1.sendKeys("ABCS");
		
		test1.pass("Entered text ABCS");
		search1.sendKeys(Keys.RETURN);
		test1.pass("Enter key pressed");
		driver.close();
		driver.quit();
		test1.pass("Browser closed successfully after test");
		test1.info("test completed");
		
		extrep.flush();
		

	}

}
