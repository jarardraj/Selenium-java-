package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.propertiesFile;
import WebPages.GoogleSearchPageObjects;


public class TestNgDemo {


	private static WebDriver driver = null;
	private static GoogleSearchPageObjects  gspo = null;
	public static String browser=null;

	@BeforeTest
	public void setUP() {

		try {
			propertiesFile.getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String projectloc = System.getProperty("user.dir");
		System.out.println(projectloc);

		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("got browser " + browser);
			System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
			driver=new ChromeDriver();

			if(driver.equals(null))	System.out.println("driver is not initialised");
			
		} else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("got fire browser " + browser);
			System.setProperty("webdriver.gecko.driver", projectloc +"/lib/drivers/geckodriver"); 
			driver=new FirefoxDriver();
		}

		gspo= new GoogleSearchPageObjects(driver);		

	}




	@Test
	public void GoogleSearchtest() throws InterruptedException {
		driver.get("http://google.com");
		gspo.setSearchText("abcd"); 
		gspo.searhTheText();


	}

	@Test
	public void GoogleSearchtest1() throws InterruptedException {
		driver.get("http://google.com");
		gspo.setSearchText("source"); 
		gspo.searhTheText();


	}

	/*
	 * @Test public void GoogleSearchtest2() throws InterruptedException {
	 * driver.get("http://google.com"); gspo.setSearchText("code");
	 * gspo.searhTheText();
	 * 
	 * 
	 * }
	 */

	@AfterTest
	public void tearDown() {

		driver.close();
		//driver.quit();
		try {
			propertiesFile.setProperty("result","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test passed successfully!");

	}




}
