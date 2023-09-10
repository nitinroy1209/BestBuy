package com.bestbuy.utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	/*
	 * ExtentSparkReporter --> This class is used to generate the html report file
	 * ExtentReports--> This class is used to create the tests in Extent reports,capture all the @tests which is test case
	 * ExtentTest  --> This class is used to generate the logs for each test case
	 */
	
	
	public static ExtentSparkReporter sparkReporter; // created object sparkreporter
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	
	@BeforeSuite
	public void startReport()
	{
		try
		{
			sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/WebAutomationReport.html");// system get property is giving location of route folder which is pm file or testng file,report name is WebAutomation
			sparkReporter.config().setDocumentTitle("BestBuy Web Automation Report");
			sparkReporter.config().setReportName("BestBuy Web Automation");
			sparkReporter.config().setTheme(Theme.DARK);
			
			extentReports= new ExtentReports();
			extentReports.attachReporter(sparkReporter);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void setTCDesc(String testcaseName)
	{
		try
		{
			extentTest=extentReports.createTest(testcaseName);//createtest return extent test object
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void reportStep(String status,String desc)// reportsteop method is used to generate logs
	{
		try
		{
			
			if(status.equalsIgnoreCase("PASS"))
			{
				extentTest.log(Status.PASS, desc);
			}
			else if(status.equalsIgnoreCase("FAIL"))
			{
				extentTest.log(Status.FAIL, desc);
			}
			else if (status.equalsIgnoreCase("SKIP"))
			{
				extentTest.log(Status.SKIP, desc);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@AfterSuite
	public void endReport()
	{
		try
		{
			extentReports.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

	
	
	
	



