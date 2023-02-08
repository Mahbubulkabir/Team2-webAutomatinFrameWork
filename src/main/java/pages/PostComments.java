package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostComments extends CommonAPI {

    Logger LOG = LogManager.getLogger(PostComments.class.getName());
    public PostComments(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //object
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[11]/a[1]")
    WebElement clickOnBuzzBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/textarea[1]")
    WebElement typeCommentsField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
    WebElement clickOnPostBtn;


    //reusable method
    public void setClickOnBuzzBtn(){
        clickOn(clickOnBuzzBtn);
    }
    public void setTypeCommentsField(String text){
        type(typeCommentsField,text);
    }
    public void setClickOnPostBtn(){
        clickOn(clickOnPostBtn);
    }
}
