package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PostComments;
import pages.MostLikePost;
import utility.ReadFromExel;

public class TestMostLikePost extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestMostLikePost.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    @Test
    public void mostLikePostButtonClick() throws InterruptedException {
        MostLikePost mostLikePost = new MostLikePost(getDriver());
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
        mostLikePost.setClickOnShareLikeBtn();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz";
        Assert.assertEquals(getURL(), expectedUrl);
        LOG.info("share post page validation successful");

    }
}
