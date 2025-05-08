package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public WebDriver driver;

	@Test
	public void test() throws Exception {
		String path = "C:\\Users\\lenovo\\eclipse-workspace\\Zproject9\\target\\execution_report.html";
		ExtentReports report = new ExtentReports(path);
		ExtentTest test = report.startTest("test case 01");
		WebDriverManager.chromedriver().setup();
		test.log(LogStatus.INFO, "chrome driver setup is successfull");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "chrome driver launched successfull");
		driver.get("https://www.google.com/");
		test.log(LogStatus.INFO, "app is invoked successfull");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "chrome browser maximized successfull");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		test.log(LogStatus.INFO, "Selenium test entred into edit box");
		driver.findElement(By.id("APjFqb")).submit();
		test.log(LogStatus.INFO, "performed enter action");
		if (driver.getTitle().contains("selenium")) {
			test.log(LogStatus.PASS, "search is successful" + test.addScreenCapture(captureScreenShot("pass_search")));
			System.out.println("search is successful");
		} else {
			test.log(LogStatus.FAIL, "search is not successful");
			System.out.println("search is not successful");
		}
		driver.quit();
		test.log(LogStatus.INFO, "Browser closed");
		report.endTest(test);
		report.flush();
		report.close();
		new ChromeDriver().get(path);
	}

	public String captureScreenShot(String name) throws IOException {
		String screenShotPath = "C:\\Users\\lenovo\\eclipse-workspace\\Zproject9\\target\\" + name + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screenShotPath));
		return screenShotPath;
	}
}
