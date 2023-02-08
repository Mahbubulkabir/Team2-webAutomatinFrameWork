package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsOfQAEngineers extends CommonAPI {
    Logger LOG = LogManager.getLogger(ReportsOfQAEngineers.class.getName());
    public ReportsOfQAEngineers(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // object
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement clickOnLeaveBtn;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[4]/span[1]")
    WebElement clickOnReportBtn;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
    WebElement clickOnUsageReport;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement typeAndEnterField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
    WebElement clickOnGenerateBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/i[1]")
    WebElement clickOnXBtn;

    //reusable method
    public void setClickOnLeaveBtn(){
        clickOn(clickOnLeaveBtn);
    }
    public void setClickOnReportBtn(){
        clickOn(clickOnReportBtn);
    }
    public  void setClickOnUsageReport(){
        clickOn(clickOnUsageReport);
    }
    public void setTypeAndEnterField(String text){
        typeAndEnter(typeAndEnterField,text);
    }
    public void setClickOnGenerateBtn(){
        clickOn(clickOnGenerateBtn);
    }
    public void setClickOnXBtn(){
        clickOn(clickOnXBtn);
    }
}
