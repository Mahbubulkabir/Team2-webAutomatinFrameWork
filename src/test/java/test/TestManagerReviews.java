package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ManageReviews;
import utility.ReadFromExel;

public class TestManagerReviews extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestManagerReviews.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");

    @Test
    public void managerReviewsFromDropDown() throws InterruptedException {
        ManageReviews manageReviews = new ManageReviews(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        manageReviews.setClickOnPerformanceBtn();
        Thread.sleep(3000);
        manageReviews.setClickOnDropDownField();
        Thread.sleep(3000);
        manageReviews.setClickOnMyReviews();
        Thread.sleep(3000);
        String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/performance/myPerformanceReview";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("my reviews page success");

    }
}
