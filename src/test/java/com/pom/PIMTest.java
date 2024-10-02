package com.pom;

import com.pom1.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PIMTest {
    public static void main(String[] args) {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\PageObjectModel\\src\\test\\java\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Implicitly wait for elements to be found
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Initialize LoginPage object
        LoginPage lp = new LoginPage();

        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Enter username and password, and click login
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();

        // Initialize PIMPage object
        PIMPage pp = new PIMPage(driver);

        // Click on the PIM tab
        pp.clickPIMButton();

        // Click on the Add button
        pp.clickAddButton();

        // Enter details in the form
        pp.enterFirstName("Riti");
        pp.enterLastName("Sharma");
        pp.enterEmployeeId("11223");
//        pp.clickCheckbox();

        // Click on the Save button
        pp.clickSaveButton();

        // Close the browser
//        driver.quit();
    }
}
