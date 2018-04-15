package week5day2_TestNG_ExtentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report_TestNG_ExtentReports {

	public static void main(String[] args) throws IOException {
		//Before Suite
		ExtentHtmlReporter html =new ExtentHtmlReporter("./reports/results.html");  //Call html reports for Selenium (Extend report suitable for selenium) 
		html.setAppendExisting(true); //History of the report (True-add history; False- New html report)
		
		//Before Test		
		ExtentReports report =new ExtentReports(); //Standard format of the report
		report.attachReporter(html);  //Attach the html file as report
		
		//Before Method
		ExtentTest test=report.createTest("TC001 TestName","create test name");  //Test case name with description
		test.assignCategory("Smoke Test");  //Category identification in the report
		test.assignAuthor("Dinesh"); //Author Name
		
		//Each Step
		test.pass("Step 1: Data Entered", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/Img-1-20180407011230.png").build()); //Test Steps description and snapshots addition in the report from specified files. 
		test.pass("Step 2: Data Entered", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/Img-1-20180407012502.png").build());
		test.pass("Step 3: Data Entered", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/Img-1-20180331112140.png").build());
		test.pass("Step 4: Data Entered", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/Img-1-20180331112246.png").build());
		
		//After Suite
		report.flush();  //Destroy the memory and its Mandatory

	}
}