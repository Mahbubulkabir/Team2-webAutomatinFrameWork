package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PimPage;
import utility.ReadFromExel;

public class TestPIM extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestPIM.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    @Test
    public void findOutEmployeeById() throws InterruptedException {
        PimPage pimPage = new PimPage(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        pimPage.setClickOnPimBtn();
        Thread.sleep(3000);
        pimPage.typeEmployeeIdField("0221");
        Thread.sleep(3000);
        pimPage.setClickOnSearchBtn();
        Thread.sleep(3000);
        // pimPage.setClickOnRecordedName();
        //  Thread.sleep(3000);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        Assert.assertEquals(getURL(), expectedUrl);
        LOG.info("employee details page validation success");

    }
}
