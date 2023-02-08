package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.TimeSheets;
import utility.ReadFromExel;


public class TestTimeSheets extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestTimeSheets.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    @Test
    public void timeSheetsForEmployees() throws InterruptedException {
        TimeSheets timeSheets = new TimeSheets(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName("Admin");
        logInPage.typePassword("admin123");
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        timeSheets.setClickOnTimeBtn();
        Thread.sleep(3000);
        timeSheets.setClickOnTimeSheetBtn();
        Thread.sleep(3000);
        timeSheets.setClickOnEmployeeTimeSheetBtn();
        Thread.sleep(3000);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("employee time sheets page validation successful");
    }
}
