package com.pom;

import com.pom1.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\PageObjectModel\\src\\test\\java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginPage lp=new LoginPage();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
    }
}
