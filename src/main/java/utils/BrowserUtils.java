package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import static app.Common.*;

import com.relevantcodes.extentreports.LogStatus;

public class BrowserUtils {

	public static void launchBrowser() {
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "chrome driver launched successfull");
	}

	public static void invokeApp() {
		driver.get("https://www.google.com/");
		test.log(LogStatus.INFO, "app is invoked successfull");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "chrome browser maximized successfull");
	}

	public static void KillBrowser() {
		driver.quit();
		test.log(LogStatus.INFO, "Browser closed");
		
	}

}
