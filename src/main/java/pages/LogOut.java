package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(LogOut.class.getName());
    public LogOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //object
    @FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]")
    WebElement clickOnProfileBtn;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement clickOnLogOut;
    //reusable method
    public void setClickOnProfileBtn(){
        clickOn(clickOnProfileBtn);
    }
    public void setClickOnLogOut(){
        clickOn(clickOnLogOut);
        LOG.info("log out validation success");
    }
}
