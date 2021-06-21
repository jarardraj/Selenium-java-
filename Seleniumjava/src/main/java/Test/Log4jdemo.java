package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {
	
	private static Logger logger = LogManager.getLogger(Log4jdemo.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Hello world \n");
		
		logger.info("After printing program message");
		logger.debug("Printing debug message");
		logger.error("Printing error message");
		logger.fatal("Printing Fatal message");
		logger.warn("Printing Warning message");
		
		System.out.println("\n End of the program \n");
				
	}

}
