package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogInPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(LogInPage.class.getName());
    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // object(web element)
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement userNameField;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement passwordField;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
    WebElement clickOnLogInBtm;


    // reusable method

    public void typeUserName(String text){
        type(userNameField, text);
    }

    public void typePassword(String text){
        type(passwordField, text);
    }
    public void setClickOnLogInBtm(){
        clickOn(clickOnLogInBtm);
        LOG.info("logIn page validation success");
    }

}

