package datadrivenTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportDemo
{
  @Test
  public void reportTest() {
	  //create ExtentReport instance
	  ExtentReports extent =new ExtentReports();
	  
	  
	  //using reporter we can add path
	  //this Reports folder automatic created and in that folder .html file will crete
	  
	  ExtentSparkReporter spark = new ExtentSparkReporter("Reports/Automation.html");
	  
	  //setup any configuration
	  spark.config().setDocumentTitle("Sprint1 report");
	  spark.config().setReportName("AutomationTesting Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //we can attached the report
       extent.attachReporter(spark);
       
       //Create a test-ExtentTest
       ExtentTest test=extent.createTest("Test1");
       
       
       //logs
       test.pass("Test case is pass!");
       test.fail("Test case is fail!");
       test.info("Test is in progress");
       test.skip("Test case is skiped");
       test.log(Status.PASS, "Test is pass");
       //exit from report
       
       extent.flush();
  }
}
