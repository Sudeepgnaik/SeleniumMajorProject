package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.test.BaseTest;

public class ExcelListener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		ExcelReporter.logResult(result.getName(), "PASS", null, result.getEndMillis()-result.getStartMillis(), null);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String screenshotPath = null;
		screenshotPath = BaseTest.captureScreenshot(result.getName());
		ExcelReporter.logResult(result.getName(),"FAIL", result.getThrowable().getMessage(),
				result.getEndMillis() - result.getStartMillis(),
				screenshotPath);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		ExcelReporter.logResult(result.getName(),
				"SKIPPED", result.getThrowable()!=null?result.getThrowable().getMessage():"Skipped",
				result.getEndMillis()-result.getStartMillis(),
				null);
	}
	@Override
	public void onFinish(ITestContext context) {
		ExcelReporter.saveReport();
		System.out.println("Excel Report Generated: TestNg_Results.xlsx");
	}
}

