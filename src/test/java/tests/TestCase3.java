package tests;

import static app.Common.report;
import static app.Common.test;

import org.junit.Test;

import pages.ResultsPage;
import pages.SearchPage;
import utils.BrowserUtils;
import utils.FrameWorkUtils;
import utils.ReportUtils;

public class TestCase3 {
	

	@Test
	public void test() throws Exception {
		
		SearchPage searchPage = new SearchPage();
		ResultsPage resultsPage = new ResultsPage();
		ReportUtils.setupReport();
		test = report.startTest("test case 01");
		FrameWorkUtils.setupDriver();
		BrowserUtils.launchBrowser();
		BrowserUtils.invokeApp();
		searchPage.perfromSearch();
		resultsPage.VerifySearch();
		BrowserUtils.KillBrowser();
		report.endTest(test);
		ReportUtils.UpdateAndCloseReport();
		ReportUtils.launchReport();
		ReportUtils.launchReport();	
		
	}
}
