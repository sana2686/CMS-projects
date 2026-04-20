package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListernerImplementation extends BaseClass implements ITestListener {
 ExtentReports report;
	@Override
	public void onTestStart(ITestResult result) {

			}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		report.createTest(name);
		}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		Javautility j=new Javautility();
		String dateandtime = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		TakesScreenshot t=(TakesScreenshot)d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+name+dateandtime+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Extentreport/Report.html");
		reporter.config().setDocumentTitle("CMS execution report");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.STANDARD);
		//reporter.config().setTheme(Theme.DARK);
		 report=new ExtentReports();
		 report.attachReporter(reporter);
		 report.setSystemInfo("url", "http://localhost8888");
		 report.setSystemInfo("os","windows");
		 report.setSystemInfo("browser", "chrome");
		 report.setSystemInfo("test engineer", "sana");
		 
		
		
		}

	@Override
	public void onFinish(ITestContext context) {
		
		
		report.flush();
			}
	

}
