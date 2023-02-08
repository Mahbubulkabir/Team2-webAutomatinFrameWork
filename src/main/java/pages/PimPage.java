package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends CommonAPI {
    Logger LOG= LogManager.getLogger(PimPage.class.getName());

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //object(web element
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    WebElement clickOnPimBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement employeeIdField;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
    WebElement clickOnSearchBtn;
    @FindBy(xpath = "")
    WebElement clickOnRecordedName;

    // reusable method

    public void setClickOnPimBtn(){
        clickOn(clickOnPimBtn);
    }
    public void typeEmployeeIdField(String text){
        type(employeeIdField,text);
    }
    public void setClickOnSearchBtn(){
        clickOn(clickOnSearchBtn);
    }

    public void setClickOnRecordedName(){
        clickOn(clickOnRecordedName);
    }
}
