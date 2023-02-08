package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qualifications extends CommonAPI {
    Logger LOG = LogManager.getLogger(Qualifications.class.getName());

    public Qualifications(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object(web element)

    @FindBy(xpath = "//a[contains(text(),'Qualifications')]")
    WebElement clickOnQualificationBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
    WebElement clickOnAddExperienceBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement typeOnCompanyField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement typeOnJobTitleField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement typeDateFromField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement typeOnDateToField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/textarea[1]")
    WebElement typeOnCommentField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/button[2]")
    WebElement clickOnSaveBtn;

    //reusable method

    public void setClickOnQualificationBtn(){
        clickOn(clickOnQualificationBtn);
    }
    public void setClickOnAddExperienceBtn(){
        clickOn(clickOnAddExperienceBtn);
    }
    public void setTypeOnCompanyField(String text){
        type(typeOnCompanyField,text);
    }
    public void setTypeOnJobTitleField(String text){
        type(typeOnJobTitleField, text);
    }
    public void setTypeDateFromField(String text){
        type(typeDateFromField, text);
    }
    public void setTypeOnDateToField(String text){
        type(typeOnDateToField,text);
    }
    public void setTypeOnCommentField(String text){
        type(typeOnCommentField,text);
    }
    public void  setClickOnSaveBtn(){
        clickOn(clickOnSaveBtn);
    }

}
