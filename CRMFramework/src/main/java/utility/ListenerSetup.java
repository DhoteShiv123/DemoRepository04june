package utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import testBaseClass.CommonTestbaseClass;

public class ListenerSetup extends CommonTestbaseClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		logger.info("Test case execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test case execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		logger.info("Test case execution failed");
		
		UtilClass1.takeScreenShot(result.getName()); //get the name of screenshot
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Test case execution skipped");
	}


	

}
