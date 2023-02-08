package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageInfoEverything;
import pages.LogInPage;
import utility.ReadFromExel;

public class TestAddInfoEverything extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestAddInfoEverything.class.getName());
    ReadFromExel read = new ReadFromExel("C:\\Users\\munna\\InteliiJ\\web-automationFinalbootcamp-Mahbubul\\data\\data.xlsx", "test data");
    String username= read.getCellValueForGivenHeaderAndKey("key","userName");
    String password= read.getCellValueForGivenHeaderAndKey("key","passWord");

    @Test(dependsOnMethods = {"addressAndContactDetailsSubmit"}, alwaysRun = false)
    public void addEmergencyContact() {
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

        homePageInfoEverything.setClickOnEmergencyConBtm();
        homePageInfoEverything.setClickOnAddBtn();
        homePageInfoEverything.typeName("robi");
        homePageInfoEverything.typeRelationship("brother");
        homePageInfoEverything.typeHomePhone("364556746");
        homePageInfoEverything.typeMobile("212344556");
        homePageInfoEverything.typeWorkPhone("718777777");
        homePageInfoEverything.setClickOnSaveBtn();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/7";
        Assert.assertEquals(getURL(), expectedUrl);
        LOG.info("emergency contact add page validation success");
    }

    @Test(dependsOnMethods = {"assignAndClickOnAddDependentsAndCancel"})
    public void addressAndContactDetailsSubmit() {
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

        homePageInfoEverything.setClickOnContactDetailsBtn();
        homePageInfoEverything.setTypeAddressField("3549 77TH STREET");
        homePageInfoEverything.setTypeCityField("jackson heights");
        homePageInfoEverything.setTypeStateField("NY");
        homePageInfoEverything.setTypePostalCodeField("11372");
        homePageInfoEverything.setClickOnSaveButton();
        String expectedUrl2= "https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7";
        Assert.assertEquals(getURL(),expectedUrl2);
        LOG.info("address add validation success");
    }

    @Test(priority = 0,enabled = true)
    public void assignAndClickOnAddDependentsAndCancel() {
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

        homePageInfoEverything.setClickOnDependentsBtn();
        homePageInfoEverything.setClickOnAssignAddBtn();
        homePageInfoEverything.setClickOnCancelBtn();
        String expectedUrl3= "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewDependents/empNumber/7";
        Assert.assertEquals(getURL(),expectedUrl3);
        LOG.info("dependents add validation success");
    }

    @Test(groups = "sanity")
    public void immigrationRecordAddStatus(){
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

        homePageInfoEverything.setClickOnImmigrationBtn();
        homePageInfoEverything.setClickOnImmigrationRecordAddBtn();
        homePageInfoEverything.setTypePassportNumberField();
        homePageInfoEverything.setTypeIssuedDateField();
        homePageInfoEverything.setTypeExpiryField();
        homePageInfoEverything.setTypeEligibleStatusField();
        homePageInfoEverything.setTypeReviewDateField();
        homePageInfoEverything.setClickOnSaveBtnOnImmigration();
        String expectedUrl4= "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewImmigration/empNumber/7";
        Assert.assertEquals(getURL(),expectedUrl4);
        LOG.info("immigration record added validation success");
    }

    @Test(groups = "regression")
    public void jobDetailsIncludingContactDetails(){
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
        homePageInfoEverything.setClickOnJobBtn();
        homePageInfoEverything.setClickOnIncludeContractDetailsBtn();
        String expectedUrl5 = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7";
        String actualUrl = getURL();
        Assert.assertEquals(actualUrl, expectedUrl5);
        LOG.info("job details page validation success");
    }
}
