package Test;

import java.io.IOException;

import Utils.excelUtils2;

public class TestExcelUtil {

	
	static String filename = "data.xlsx";
	static String rowname ="Admin";
	static String colname="Password";
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			excelUtils2 exl = new excelUtils2(filename);
			
			exl.getData("sheet1", rowname, colname);
			
	}

}
