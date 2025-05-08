package pages;

import com.relevantcodes.extentreports.LogStatus;

import static app.Common.*;
import static utils.FrameWorkUtils.*;

public class ResultsPage {

	public void VerifySearch()throws Exception {
		if (driver.getTitle().contains("selenium")) {
			test.log(LogStatus.PASS, "search is successful" + test.addScreenCapture(captureScreenShot("pass_search")));
			System.out.println("search is successful");
		} else {
			test.log(LogStatus.FAIL, "search is not successful");
			System.out.println("search is not successful");
		}
	}

}
