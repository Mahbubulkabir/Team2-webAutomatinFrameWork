package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageReviews extends CommonAPI {
    Logger LOG = LogManager.getLogger(ManageReviews.class.getName());
    public ManageReviews(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]/span[1]")
    WebElement clickOnPerformanceBtn;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[2]/span[1]")
    WebElement clickOnDropDownField;

    @FindBy(xpath = "//a[contains(text(),'My Reviews')]")
    WebElement clickOnMyReviews;

    //reusable method
    public void setClickOnPerformanceBtn(){
        clickOn(clickOnPerformanceBtn);
    }
    public void setClickOnDropDownField(){
        clickOn(clickOnDropDownField);
    }
    public void setClickOnMyReviews(){
        clickOn(clickOnMyReviews);
    }
}
