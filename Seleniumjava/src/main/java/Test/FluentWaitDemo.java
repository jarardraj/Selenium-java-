package Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException,NoSuchElementException {
		fluentWait();
	}

	//@SuppressWarnings("deprecation")
	public static void fluentWait() throws InterruptedException, NoSuchElementException {


		String projectloc = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectloc + "/lib/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://google.co.uk");
		
		WebElement ele = driver.findElement(By.name("q"));
	
		ele.sendKeys("ABCD");
		
		ele.sendKeys(Keys.RETURN);
	
		
		


		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);


		WebElement element = wait.until(
				

				new Function<WebDriver, WebElement>() {

					public WebElement apply(WebDriver driver) {
						

						WebElement linkelement=driver.findElement(By.linkText("ChuChu TV Classics - ABCD Song in Alphabet Water Park ..."));

						/*
						 * if (linkelement.isDisplayed()) {
						 * 
						 * System.out.println("Element displayed");
						 * 
						 * }
						 */ return linkelement;

					}

				});

		element.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
