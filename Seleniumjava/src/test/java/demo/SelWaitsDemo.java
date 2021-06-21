package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelWaitsDemo {
	
	public static void main(String[] args) {
		selwait();
	}
	
	
	
	public static void selwait() {
		
		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://google.co.uk");
	    
	    driver.findElement(By.name("q")).sendKeys("ABC");
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    
	    WebElement we = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("great"))));
	    
	    
	   // driver.findElement(By.name("great")).click();
	    
	   
		
		
		
	}
	
	
	

}
