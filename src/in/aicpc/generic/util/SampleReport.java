package in.aicpc.generic.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport implements ITestListener,ISuiteListener {

	ExtentReports report;
	ExtentTest logger;
	
	@Override
	public void onStart(ISuite suite) {
		report = new ExtentReports("C:\\Users\\Vidya Shree\\Desktop\\report\\report.html");
		report.loadConfig(new File("./config.xml"));
		
	}

	@Override
	public void onFinish(ISuite suite) {
		report.endTest(logger);
		report.flush();
		report.close();
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
		report.startTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
		TakesScreenshot screenshot = (TakesScreenshot)BrowserUtil.driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Vidya Shree\\Desktop\\report\\sample.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String imagePath = logger.addScreenCapture("C:\\Users\\Vidya Shree\\Desktop\\report\\sample.png");
		logger.log(LogStatus.FAIL, "failed", imagePath);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
		 logger.log(LogStatus.SKIP, result.getName()+" getting skipped");
	        report.endTest(logger);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
