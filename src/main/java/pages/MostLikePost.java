package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MostLikePost extends CommonAPI {
    Logger LOG = LogManager.getLogger(MostLikePost.class.getName());
    public MostLikePost(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]")
    WebElement clickOnShareBtn;
//    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/textarea[1]")
//    WebElement typeOnCommentsField;
//    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
//    WebElement clickOnShareButton;

    //reusable method
    public void setClickOnShareLikeBtn(){
        clickOn(clickOnShareBtn);
    }
//    public void setTypeOnCommentsField(String text){
//        type(typeOnCommentsField,text);
//    }
//    public void setClickOnShareButton(){
//        clickOn(clickOnShareButton);
//    }
}
