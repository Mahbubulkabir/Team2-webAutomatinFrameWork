package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PostComments;
import utility.ReadFromExel;
import utility.Utility;

public class TestPostComments extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestPostComments.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    String comments= Utility.getProperties().getProperty("comment.post");

    @Test
    public void postCommentsAndLikeIt() throws InterruptedException {
        PostComments postComments = new PostComments(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();
        Thread.sleep(3000);

        postComments.setClickOnBuzzBtn();
        Thread.sleep(3000);
        postComments.setTypeCommentsField(comments);
        Thread.sleep(3000);
        postComments.setClickOnPostBtn();
        Thread.sleep(3000);
        String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz";
        Assert.assertEquals(getURL(),expectedUrl);
        LOG.info("comments and like page validation success");
    }
}
