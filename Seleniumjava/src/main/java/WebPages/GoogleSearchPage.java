package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebDriver driver = null;
    	
	public static WebElement Search_textbox(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		
	}
	
	public static WebElement Search_button(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@class=\"erkvQe\"]//li"));
			
	}
	

}
