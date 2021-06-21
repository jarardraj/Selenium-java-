package Utils;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WebPages.GoogleSearchPageObjects;

public class excelDataProvider {
	
	WebDriver driver1 = null;
	GoogleSearchPageObjects  gspo1= null;
	String projectloc = System.getProperty("user.dir");
	
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver", projectloc +"/lib/drivers/chromedriver"); 
		driver1=new ChromeDriver();
		
		
		
	}
	
	@Test(dataProvider = "test1Data")
	public void test(String username, String password) throws InterruptedException {
		
		System.out.println(username+ "||" + password);
		driver1.get("https://www.stealmylogin.com/demo.html");
		driver1.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(username);
		driver1.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(password);
		Thread.sleep(3000);
		
		
	}
	
	@DataProvider(name="test1Data")
	public Object[][] getData() {
		
		Object data[][]=testData("data.xlsx","sheet1");
		return data;
		
	}

	
	public  Object[][] testData(String fileName, String sheetName) {
		
		excelUtils3 eu3= new excelUtils3(fileName, sheetName);
		
		int rowCount = eu3.getRowCount();
		int colCount = eu3.getColCount();
		Object[][] obj = new Object[rowCount-1][colCount];
		
		for (int i=1 ; i < rowCount; i++) {
			for(int j = 0; j < colCount; j++) {
				
				
			  //String cellDataString = eu3.getCellDataString(i, j)
				
				obj[i-1][j]= eu3.getCellDataString(i, j);
				
			}
			
		}
		
		return obj;
		
	}
	
	
	
	  @AfterTest public void teardownTest() {
	  
	  driver1.close(); driver1.quit(); }
	 
	

}
