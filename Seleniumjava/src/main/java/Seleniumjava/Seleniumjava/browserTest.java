package Seleniumjava.Seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class browserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver");           
			//WebDriver driver = new FirefoxDriver(); 
		 // driver.get("http://www.google.com/");  
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://google.com"); 
		  driver.manage().window().maximize();
			Thread.sleep(3000);		
		WebElement searchtext= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchtext.click();
		List<WebElement> searchoption= driver.findElements(By.xpath("//ul[@class='erkvQe']//following::span"));
		
		for(WebElement p: searchoption) {
			
			if(p.getText() != null) {
			System.out.println(p.getText());
			}
		}
		
		Thread.sleep(5000);	
	
		driver.close();
		driver.quit();
	
		
		
	}
}


