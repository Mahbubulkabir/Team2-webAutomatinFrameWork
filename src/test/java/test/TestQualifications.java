package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageInfoEverything;
import pages.LogInPage;
import pages.Qualifications;
import utility.ReadFromExel;

public class TestQualifications extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestQualifications.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");
    @Test
    public void qualificationsAddWorkExperience() throws InterruptedException {
        Qualifications qualifications = new Qualifications(getDriver());
        HomePageInfoEverything homePageInfoEverything = new HomePageInfoEverything(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());
        String expectedHomePageTitle = "OrangeHRM";
        String actualHomePageTitle = getCurrentTitle();
        Assert.assertEquals(actualHomePageTitle,expectedHomePageTitle);
        LOG.info("land to orangehrm home page successfully");

        logInPage.typeUserName(username);
        logInPage.typePassword(password);
        logInPage.setClickOnLogInBtm();

        homePageInfoEverything.setClickOnMyInfoBtm();
        qualifications.setClickOnQualificationBtn();
        qualifications.setClickOnAddExperienceBtn();
        qualifications.setTypeOnCompanyField("Citi bank");
        qualifications.setTypeOnJobTitleField("QA Engineer");
        qualifications.setTypeDateFromField("2018-02-03");
        qualifications.setTypeOnDateToField("2022-10-10");
        qualifications.setTypeOnCommentField("Interested to Learn more");
        qualifications.setClickOnSaveBtn();
        Thread.sleep(3000);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewQualifications/empNumber/7";
        Assert.assertEquals(getURL(), expectedUrl);
        LOG.info("add work experience success");

    }
}
