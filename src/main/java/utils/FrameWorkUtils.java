package utils;

import com.relevantcodes.extentreports.LogStatus;
import static app.Common.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorkUtils {

	public static void setupDriver() {
		WebDriverManager.chromedriver().setup();
		test.log(LogStatus.INFO, "chrome driver setup is successfull");
	}
	public static String captureScreenShot(String name) throws IOException {
		String screenShotPath = "C:\\Users\\lenovo\\eclipse-workspace\\Zproject9\\target\\" + name + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screenShotPath));
		return screenShotPath;
	}

}
