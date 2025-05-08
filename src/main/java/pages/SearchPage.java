package pages;

import org.openqa.selenium.By;
import static app.Common.*;

import com.relevantcodes.extentreports.LogStatus;

public class SearchPage {
	
	public By edit_search=By.id("APjFqb");

	public void perfromSearch() {
		driver.findElement(edit_search).sendKeys("selenium");
		test.log(LogStatus.INFO, "Selenium test entred into edit box");
		driver.findElement(By.id("APjFqb")).submit();
		test.log(LogStatus.INFO, "performed enter action");
	}
}
