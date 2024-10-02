package com.test;

import com.pom1.LoginPage;
import com.utils.DriverUtils;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void Verifylogin(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\PageObjectModel\\src\\test\\java\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginPage lp=new LoginPage();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();
    }
}
