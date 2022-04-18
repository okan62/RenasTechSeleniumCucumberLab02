package Renastech.Lab02.stepDefinitions;

import Renastech.Lab02.utils.BrowserUtil;
import Renastech.Lab02.utils.ConfigurationsReader;
import Renastech.Lab02.utils.Driver;
import io.cucumber.java.Before;

public class Hooks extends BrowserUtil {
    @Before
    public void setup(){
        Driver.getDriver();
        BrowserUtil.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("url"));
    }
}
