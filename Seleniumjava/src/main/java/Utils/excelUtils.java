package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

public class excelUtils {


	private	static String excelloc ;
	private static HSSFWorkbook workbook;
	private static HSSFSheet ws;
	private static FileInputStream fis;



	public static void main(String[] args) {

		getRowCount();
		getCellData();


	}









	public static void getRowCount() {
		excelloc= System.getProperty("user.dir");
		excelloc = excelloc + "/Excel/data.xls";

		try {
			fis = new FileInputStream(excelloc);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			workbook = new HSSFWorkbook(fis);
		} catch (IOException e) {
			e.getCause();
			e.printStackTrace();
			e.getStackTrace();
		}
		ws = workbook.getSheet("sheet1");

		int rowcount = ws.getPhysicalNumberOfRows();

		System.out.println("The number of rows in the sheet" + rowcount);

	}



	public static void getCellData() {


		Iterator<Row>  itr= ws.iterator();

		while (itr.hasNext()) {
			Row row = itr.next();
			// Get iterator to all cells of current row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				CellType cellType = cell.getCellType();
				 
                switch (cellType) {
                case _NONE:
                    System.out.print("");
                    System.out.print("\t");
                    break;
                case BOOLEAN:
                    System.out.print(cell.getBooleanCellValue());
                    System.out.print("\t");
                    break;
                case BLANK:
                    System.out.print("");
                    System.out.print("\t");
                    break;
                case FORMULA:
                    // Formula
                    System.out.print(cell.getCellFormula());
                    System.out.print("\t");
                     
                    FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                    // Print out value evaluated by formula
                    System.out.print(evaluator.evaluate(cell).getNumberValue());
                    break;
                case NUMERIC:
                    System.out.print(cell.getNumericCellValue());
                    System.out.print("\t");
                    break;
                case STRING:
                    System.out.print(cell.getStringCellValue());
                    System.out.print("\t");
                    break;
                case ERROR:
                    System.out.print("!");
                    System.out.print("\t");
                    break;
                }
 
            }
            System.out.println("");

			}


		}
	}





