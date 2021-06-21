package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is started " + result.getName());
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is completed success " + result.getName());
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is failed" + result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is skipped" + result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is  failedbut with success percentage " + result.getName());
	}


	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is failed with timeout " + result.getName());
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test step on start " + context.getName());
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test is finished" + context.getName());
	}
	
	
	
	

}
