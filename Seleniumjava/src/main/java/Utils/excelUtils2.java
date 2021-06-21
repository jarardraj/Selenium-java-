package Utils;


import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils2 {


	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static String excelloc;
	static FilterOutputStream fos;

	//constructor to initialize and setup the necessary framwwork to read and write to spreadsheet

	public excelUtils2(String filename) throws Exception {
		excelloc = System.getProperty("user.dir");	
		// opme tp read data from an excel sheet	
		wb = new XSSFWorkbook(excelloc +"/Excel/"+ filename);
		// open for appending to existing sheet data

	}







	public void getData(String sheetName, String  row, String col) throws IOException {

		int rowcount=0;
		int colcount=0;

		ws = wb.getSheet(sheetName);

		Iterator <Row>  rowIterator1 = ws.rowIterator();

		while(rowIterator1.hasNext()){

			Row sheetRow = rowIterator1.next();
			Cell cell = sheetRow.getCell(0);
			if(cell.getStringCellValue().equalsIgnoreCase(row)){

				rowcount =cell.getRowIndex();
			}
		} 

		Row firstRow = ws.getRow(0);
		Iterator <Cell> cellIterator = firstRow.cellIterator();
		while(cellIterator.hasNext()){

			Cell rowCell = cellIterator.next();

			if (rowCell.getStringCellValue().equalsIgnoreCase(col)) {

				colcount = rowCell.getColumnIndex();


			}

		}


		Row row2 = ws.getRow(rowcount);
		Cell cell =row2.getCell(colcount);
		
		switch (cell.getCellType()) 
        {
            case NUMERIC:
                System.out.print(cell.getNumericCellValue() + "tt");
                break;
            case STRING:
                System.out.print(cell.getStringCellValue() + "tt");
                break;
            case FORMULA:
                //Not again
                break;
		default:
			break;
        }
    
    System.out.println("");

wb.close();
}

public void getSheetData(String sheetName) {

	ws = wb.getSheet(sheetName);

}



public void writeData(String sheetName, String row, String col) {



}



public void writeSheetData(String sheetName) {



}









}
