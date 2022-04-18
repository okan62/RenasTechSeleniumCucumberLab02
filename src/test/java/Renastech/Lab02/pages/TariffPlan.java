package Renastech.Lab02.pages;

import Renastech.Lab02.utils.BrowserUtil;
import Renastech.Lab02.utils.ConfigurationsReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TariffPlan extends BrowserUtil {
    public TariffPlan(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Add Tariff Plan')]")
    private WebElement TariffPlanLink;

    public void setTariffPlanLink(){
        staticWait(2);
        TariffPlanLink.click();
        driver.get(ConfigurationsReader.getProperties("urltariff"));
    }

}
