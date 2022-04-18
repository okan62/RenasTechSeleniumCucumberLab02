package Renastech.Lab02.pages;

import Renastech.Lab02.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
import java.util.SplittableRandom;

public class VerificationPage extends BrowserUtil {
        public VerificationPage(){
            PageFactory.initElements(driver,this);
        }
        @FindBy(xpath = "//h1[contains(text(),'Add Tariff Plans')]")
        private WebElement verify;

    public void setVerify() {
        if(verify.getText().contains("Add Tariff Plans")){
            System.out.println("Verification of Add Tariff Plans SUCCESSFUL!!!!!");
        }
        else
            System.out.println("Verification is FAILED!!!!!!!!");
    }
}
