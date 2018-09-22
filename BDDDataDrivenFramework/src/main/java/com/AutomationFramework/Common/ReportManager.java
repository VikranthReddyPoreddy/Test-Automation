package com.AutomationFramework.Common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportManager {
	ExtentReports report;
	ExtentTest logger;
	public static ReportManager instance = null;
	
	
	public void initializeReport()
	{
		report=new ExtentReports("Reports\\report.html");
		 
		logger=report.startTest("VerifyBlogTitle");
	}
	public static ReportManager getInstace() {
		if (instance == null) {
			instance = new ReportManager();
		}
		return instance;
	}
	public void reportLog(String resultStatus, String textInReport, Boolean screenShotstatus)
	{
		if(resultStatus.equals("INFO"))
		{
			logger.log(LogStatus.INFO, textInReport);
		}
		else if(resultStatus.equals("PASS"))
		{
			logger.log(LogStatus.PASS, textInReport);
		}
		else if (resultStatus.equals("FAIL")) {
			logger.log(LogStatus.FAIL, textInReport);
			
		}
		
	}
	public void closeReport()
	{
		report.endTest(logger);
		report.flush();
	}

}
