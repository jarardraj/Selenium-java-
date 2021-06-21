package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils3 {
	
	
	
	static String excelloc = System.getProperty("user.dir");
	
	static XSSFWorkbook wb;
	static XSSFSheet ws ;
	
	
	public static void main(String[] args) {
		getRowCount();
		getColCount();;
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	
	
	public excelUtils3(String filename, String sheetName) {
		
		try {
			 wb = new XSSFWorkbook(excelloc + "/Excel/" + filename);
			 ws = wb.getSheet(sheetName);
			}catch (IOException e) {
				
				e.getMessage();
				e.getStackTrace();
				e.getCause();
							
			}
			
		
		
	}
	
	
	
	
	public static int getRowCount() {
		
		int rowCount=0;
		
		
		rowCount = ws.getPhysicalNumberOfRows();
		//System.out.println("number of rows:" + rowCount);
		return rowCount;
	}
	
	
	
	
	public static int getColCount() {
		int colCount=0;
		
		colCount=ws.getRow(1).getPhysicalNumberOfCells();
		//System.out.println("The number of columns :" + colCount);
		
		return colCount;
	}
	
	
	
	public static  String getCellDataString(int rowNum, int colNum) {
		String cellDataStr;
		
		cellDataStr=ws.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("The String cell value is  :" + cellDataStr);
		
		return cellDataStr;
	}
	
	public static  double getCellDataNumber(int rowNum, int colNum) {
		double cellDataNum;
		
		cellDataNum=ws.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("The String cell value is  :" + cellDataNum);
		return cellDataNum;
		
	}
	
	

	
	
	

}
