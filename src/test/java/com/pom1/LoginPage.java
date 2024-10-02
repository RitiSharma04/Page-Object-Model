package com.pom;

import com.pom1.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    // Declaration
    @FindBy(name = "username")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']") // Corrected XPath expression
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonLogin;

    // Utilization
    public void enterUsername(String str) {
        txtUsername.sendKeys(str);
    }

    public void enterPassword(String str) {
        txtPassword.sendKeys(str);
    }

    public void clickLogin() {
        buttonLogin.click();
    }
}
