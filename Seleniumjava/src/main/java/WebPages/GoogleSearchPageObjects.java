package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	
   private static WebDriver  driver= null;
	static By searchTextBox = By.xpath("//input[@class='gLFyf gsfi']");
	static By searchlist = By.xpath("//ul[@class=\"erkvQe\"]//li");
	static By searchButton = By.xpath("//input[@class='gNO89b']");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}

	
	
	public static void setSearchText(String text) throws InterruptedException {
		
		driver.findElement(searchTextBox).sendKeys(text);
		Thread.sleep(5000);
				
	}
	
	public static void searhTheText() {
		
		driver.findElement(searchTextBox).sendKeys(Keys.RETURN);
		
	}
	
	
}
