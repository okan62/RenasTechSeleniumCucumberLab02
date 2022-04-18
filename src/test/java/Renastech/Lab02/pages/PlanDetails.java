package Renastech.Lab02.pages;

import Renastech.Lab02.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

import javax.sql.rowset.BaseRowSet;

public class PlanDetails extends BrowserUtil {
    public PlanDetails(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="rental1")
    private WebElement Mrental;
    @FindBy(xpath = "//input[@name='local_minutes']")
    private WebElement LocalMinutes;
    @FindBy(xpath = "//input[@name='inter_minutes']")
    private WebElement InterMinutes;
    @FindBy(xpath = "//input[@name='sms_pack']")
    private WebElement SmsPack;
    @FindBy(xpath = "//input[@name='minutes_charges']")
    private WebElement LocalMinutesCharge;
    @FindBy(xpath = "//input[@name='inter_charges']")
    private WebElement InterMinutesCharge;
    @FindBy(xpath = "//input[@name='sms_charges']")
    private WebElement SmsCharge;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement SubmitBtn;

    public void setMrental(String MonthRental){
        staticWait(1);
        Mrental.sendKeys(MonthRental);
    }
    public void setLocalMinutes(String Lminutes){
        staticWait(1);
        LocalMinutes.sendKeys(Lminutes);
    }
    public void setInterMinutes(String Iminutes){
        staticWait(1);
        InterMinutes.sendKeys(Iminutes);
    }
    public void setSmsPack(String SMSPack){
        staticWait(1);
        SmsPack.sendKeys(SMSPack);
    }
    public void setLocalMinutesCharge(String LMcharge){
        staticWait(1);
        LocalMinutesCharge.sendKeys(LMcharge);
    }
    public void setInterMinutesCharge(String IMCharge){
        staticWait(1);
        InterMinutesCharge.sendKeys(IMCharge);
    }
    public void setSmsCharge(String SMSCharge){
        staticWait(1);
        SmsCharge.sendKeys(SMSCharge);
    }
    public void setSubmitBtn(){
        SubmitBtn.click();
    }
}
