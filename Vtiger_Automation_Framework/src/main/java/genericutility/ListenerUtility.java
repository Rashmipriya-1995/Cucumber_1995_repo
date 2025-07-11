package genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {// this method will trigger or execute first later @test will execute
		test=eReport.createTest(result.getName());// will take method name 
		test.log(Status.INFO, "test Execution started");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "Test Script is failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		try {
			wUtil.getPhoto(driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
