package BrowserInitialization;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {

	public com.aventstack.extentreports.ExtentReports reports() {

		ExtentSparkReporter extent = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
		extent.config().setReportName("TestReport");
		extent.config().setDocumentTitle("Reports");

		ExtentReports report= new ExtentReports();
		report.attachReporter(extent);
		report.setSystemInfo("Testter", "Liyakath");
		return report;
	}

}
