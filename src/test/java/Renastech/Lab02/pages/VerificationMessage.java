package Renastech.Lab02.pages;

import Renastech.Lab02.utils.BrowserUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VerificationMessage extends BrowserUtil {
    public VerificationMessage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[contains(text(),'Congratulation you add Tariff Plan')]")
    private WebElement verificationMessage;
    public void setVerificationMessage(String expected){
        Assert.assertEquals(verificationMessage.getText(),expected);
    }
}
