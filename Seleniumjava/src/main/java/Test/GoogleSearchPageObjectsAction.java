package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebPages.GoogleSearchPageObjects;

public class GoogleSearchPageObjectsAction {

	private static WebDriver driver =null;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			googleSearchTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void googleSearchTest() throws Exception {
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		GoogleSearchPageObjects  searchPageObjects = new GoogleSearchPageObjects(driver);
		searchPageObjects.setSearchText("ADCD");
       	searchPageObjects.searhTheText();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	
	
	
	
	
	
}

