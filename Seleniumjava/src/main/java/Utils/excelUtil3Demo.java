package Utils;

public class excelUtil3Demo {

	public static void main(String[] args) {
		
		
	excelUtils3 eu3 = new excelUtils3("data.xlsx", "sheet1");
	
	eu3.getRowCount();
	eu3.getCellDataString(0, 0);
	eu3.getCellDataNumber(1,1);
	
	
	}

}
