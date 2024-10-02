package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {
            static WebDriver driver;
            public static void  creteDriver(){

                System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\PageObjectModel\\src\\test\\java\\chromedriver.exe" );
                driver=new ChromeDriver();
               driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
            public static WebDriver getDriver(){
                if(driver==null){
                    creteDriver();
                }return driver;
            }
}
