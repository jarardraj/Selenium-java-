package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	private int retryCount=0;
	private static final int maxretryCount=5;
	
	public boolean retry(ITestResult result) {
	
		if( retryCount < maxretryCount){
		
			retryCount++;
			return true;
		
		}
		return false;
	}

}
