package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageInfoEverything extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePageInfoEverything.class.getName());

    public HomePageInfoEverything(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // object(web element)
    @FindBy(xpath = "//a[contains(text(),'Emergency Contacts')]")
    WebElement clickOnEmergencyConBtm;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
    WebElement clickOnMyInfoBtm;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement clickOnAddBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement nameField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement relationshipField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement homePhoneField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement mobileField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
    WebElement workTelephoneField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[2]")
    WebElement clickOnSaveBtn;
    //second
    @FindBy(xpath = "//a[contains(text(),'Contact Details')]")
    WebElement clickOnContactDetailsBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement typeAddressField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")
    WebElement typeCityField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement typeStateField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/input[1]")
    WebElement typePostalCodeField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    WebElement clickOnSaveButton;
    //third
    @FindBy(xpath = "//a[contains(text(),'Dependents')]")
    WebElement clickOnDependentsBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement clickOnAssignAddBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")
    WebElement clickOnCancel;
    // fourth
    @FindBy(xpath = "//a[contains(text(),'Immigration')]")
    WebElement clickOnImmigrationBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement clickOnImmigrationRecordAddBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement typePassportNumberField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement typeIssuedDateField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement typeExpiryField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement typeEligibleStatusField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement typeReviewDateField;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[2]")
    WebElement clickOnSaveBtnOnImmigration;
    //fifth
    @FindBy(xpath = "//a[contains(text(),'Job')]")
    WebElement clickOnJobBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/label[1]/span[1]")
    WebElement clickOnIncludeContractDetailsBtn;

    // reusable method

    public void typeName(String text){
        type(nameField, text);
    }
    public void typeRelationship(String text){
        type(relationshipField, text);
    }
    public void typeHomePhone(String text){
        type(homePhoneField, text);
    }
    public void typeMobile(String text){
        type(mobileField, text);
    }
    public void typeWorkPhone(String text){
        type(workTelephoneField, text);
    }
    public void  setClickOnAddBtn(){
        clickOn(clickOnAddBtn);
    }

    public void setClickOnMyInfoBtm() {
        clickOn(clickOnMyInfoBtm);
        LOG.info("click on my info success");
    }
    public void setClickOnEmergencyConBtm(){
        clickOn(clickOnEmergencyConBtm);
    }
    public void setClickOnSaveBtn(){
        clickOn(clickOnSaveBtn);
        LOG.info("contact info add validation success");
    }
    //second
    public void setClickOnContactDetailsBtn(){
        clickOn(clickOnContactDetailsBtn);
    }
    public void setTypeAddressField(String text){
        type(typeAddressField,text);
    }
    public void setTypeCityField(String text){
        type(typeCityField,text);
    }
    public void setTypeStateField(String text){
        type(typeStateField,text);
    }
    public void setTypePostalCodeField(String text){
        type(typePostalCodeField,text);
    }
    public void setClickOnSaveButton(){
        clickOn(clickOnSaveButton);
    }
    //third
    public void setClickOnDependentsBtn(){
        clickOn(clickOnDependentsBtn);
    }
    public void setClickOnAssignAddBtn(){
        clickOn(clickOnAssignAddBtn);
    }

    public void setClickOnCancelBtn(){
        clickOn(clickOnCancel);
    }
    //fourth
    public void setClickOnImmigrationBtn(){
        clickOn(clickOnImmigrationBtn);
    }
    public void setClickOnImmigrationRecordAddBtn(){
        clickOn(clickOnImmigrationRecordAddBtn);
    }
    public void setTypePassportNumberField(){
        type(typePassportNumberField,"3827498");
    }
    public void setTypeIssuedDateField(){
        type(typeIssuedDateField,"2020-05-12");
    }
    public void setTypeExpiryField(){
        type(typeExpiryField,"2025-06-08");
    }
    public void setTypeEligibleStatusField(){
        type(typeEligibleStatusField,"Immigrant");
    }
    public void setTypeReviewDateField(){
        type(typeReviewDateField,"2020-05-10");
    }
    public void setClickOnSaveBtnOnImmigration(){
        clickOn(clickOnSaveBtnOnImmigration);
    }
    // fifth
    public void setClickOnJobBtn(){
        clickOn(clickOnJobBtn);
    }
    public void setClickOnIncludeContractDetailsBtn(){
        clickOn(clickOnIncludeContractDetailsBtn);
    }
}