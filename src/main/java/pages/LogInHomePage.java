package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInHomePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LogInHomePage.class.getName());
    public LogInHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // object(web element)
    @FindBy(xpath = "")
    WebElement element;


    //reusable method
    public void setElement(){
        clickOn(element);
    }
}
