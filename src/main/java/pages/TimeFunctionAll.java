package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeFunctionAll extends CommonAPI {
    Logger LOG = LogManager.getLogger(TimeFunctionAll.class.getName());
    public TimeFunctionAll(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //object
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[3]/span[1]")
    WebElement reportDropDown;
    @FindBy(xpath = "//a[contains(text(),'Attendance Summary')]")
    WebElement clickOnSummery;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement clickOnViewBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]")
    WebElement clickOnEditBtn;
    @FindBy(xpath = "//tbody/tr[2]/td[1]/button[1]/i[1]")
    WebElement clickOnAddRowBtn;
    @FindBy(xpath = "//tbody/tr[2]/td[10]/button[1]/i[1]")
    WebElement clickOnDeleteRowBtn;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[3]")
    WebElement clickOnSaveBtn;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[4]/span[1]")
    WebElement projectInfoDropDown;
    @FindBy(xpath = "//a[contains(text(),'Customers')]")
    WebElement clickOnCustomers;
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[2]/span[1]")
    WebElement clickOnAttendance;
    @FindBy(xpath = "//a[contains(text(),'Configuration')]")
    WebElement clickOnConfiguration;
    //reusable method
    public void setClickOnAttendance(){
        clickOn(clickOnAttendance);
    }
    public void setClickOnConfiguration(){
        clickOn(clickOnConfiguration);
    }
    public void setProjectInfoDropDownClick(){
        clickOn(projectInfoDropDown);
    }
    public void setClickOnCustomers(){
        clickOn(clickOnCustomers);
    }
    public void setClickOnViewBtn(){
        clickOn(clickOnViewBtn);
    }
    public void setClickOnEditBtn(){
        clickOn(clickOnEditBtn);
    }
    public void setClickOnAddRowBtn(){
        clickOn(clickOnAddRowBtn);
    }
    public void setClickOnDeleteRowBtn(){
        clickOn(clickOnDeleteRowBtn);
    }
    public void setClickOnSaveBtn(){
        clickOn(clickOnSaveBtn);
    }

    public void setReportBtn(){
        clickOn(reportDropDown);
    }
    public void setClickOnSummery(){
        clickOn(clickOnSummery);
    }

//    public void setProjectInfoDropDownToCustomers(String option){
//        selectOptionFromDropdown(projectInfoDropDown, option);
//    }

//    public void setReportDropDown(String option){
//   selectOptionFromDropdown(reportDropDown,option);
//     LOG.info(option+"option select from menu drop down");
//    }
}
