package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeSheets extends CommonAPI {
    Logger LOG = LogManager.getLogger(TimeSheets.class.getName());
    public TimeSheets(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //object
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
    WebElement clickOnTimeBtn;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[1]/span[1]")
    WebElement clickOnTimeSheetBtn;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[1]/ul[1]/li[2]")
    WebElement clickOnEmployeeTimeSheetBtn;


    //reusable method
    public void setClickOnTimeBtn(){
        clickOn(clickOnTimeBtn);
    }
    public void setClickOnTimeSheetBtn(){
        clickOn(clickOnTimeSheetBtn);
    }
    public void setClickOnEmployeeTimeSheetBtn(){
        clickOn(clickOnEmployeeTimeSheetBtn);
    }

}
