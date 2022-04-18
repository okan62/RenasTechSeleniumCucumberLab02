package Renastech.Lab02.pages;

import Renastech.Lab02.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BrowserUtil {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Demo Site')]")
    private WebElement verification;

    public void setVerification(){
        if(verification.getText().contains("Demo Site")){
            System.out.println("Demo Site browser SUCCESSFULLY launched!!!");
        }
        else
            System.out.println("Browser NOT launched!!!");
    }

}
