package Test;

import org.openqa.selenium.By;
import WebPages.GoogleSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googleSearchTest2 {
	
	public static void main(String[] args) throws Exception {
		
		googleSearch();
		
	}
	
	
	
	public static void googleSearch() throws InterruptedException {
		
		
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		Thread.sleep(4000);
		WebElement search1= GoogleSearchPage.Search_textbox(driver);
		search1.sendKeys("gladiators");
		Thread.sleep(4000);
		WebElement opt1= GoogleSearchPage.Search_button(driver);
		//opt1.sendKeys(Keys.ARROW_DOWN);
		opt1.click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
		System.out.println("Test Completed successfully");
	}
	

}

