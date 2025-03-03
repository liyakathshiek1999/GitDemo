package ListenersTestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import BrowserInitialization.Initialization;
import BrowserInitialization.extentReports;

public class Listeners extends Initialization implements ITestListener {
	ExtentTest 	Test;
	extentReports r= new extentReports();

	@Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub   
		 Test= r.reports().createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub   
    	result.isSuccess();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub 
    	Test.fail(result.getThrowable());
    	String file = null;
    	try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			file= screenShotCode(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		}
    	Test.addScreenCaptureFromPath(file, result.getMethod().getMethodName());
    	
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub 
    	r.reports().flush();
    }

}
