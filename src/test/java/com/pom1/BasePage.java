package com.pom1;

import com.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage(){
        driver= DriverUtils.getDriver();
        PageFactory.initElements(driver,this);
    }
}
