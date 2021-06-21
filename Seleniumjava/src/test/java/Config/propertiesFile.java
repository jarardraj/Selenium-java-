package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNgDemo;

public class propertiesFile {
	
	private static String key1;
	private  static Properties prop =new Properties();;
	private static String projloc = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			  getProperty("browser"); System.out.println("The property is "+ key1 + "\n");
			 
			setProperty("version", "5");
			getProperty("version");
			System.out.println("The property is "+ key1 + "\n"); 
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
	
	
	public  static void getProperty(String k) throws IOException {
		
		InputStream input = new FileInputStream(projloc + "/src/test/java/Config/config.properties");
		prop.load(input);
		key1= prop.getProperty(k);
		System.out.println(key1);
		TestNgDemo.browser=key1;
		input.close();
		
		
	}
	
	
	
	public  static void setProperty(String version, String n) throws Exception {
	
		OutputStream output = new FileOutputStream(projloc + "/src/test/java/Config/config.properties");
		prop.setProperty(version,n);
		prop.store(output,null);
		output.flush();
		output.close();

		
		
	}
	
	
}
