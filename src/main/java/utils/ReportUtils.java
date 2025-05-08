package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import static app.Common.*;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportUtils {

	public static void setupReport() {
		
		report = new ExtentReports(path);	
	}

	public static void UpdateAndCloseReport() {
		report.flush();
		report.close();
	}

	public static void launchReport() {
		new ChromeDriver().get(path);
	}

}
