package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
    // Declaration
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement buttonPIM;

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement buttonAdd;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]")
    WebElement txtLastName;

    @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]") // Adjusted XPath expression
    WebElement txtEmployeeId;
//
//    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']") // Adjusted XPath expression
//    WebElement checkbox;

//    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @autocomplete='off']")
//    WebElement txtAutoCompleteOff;

    @FindBy(xpath = "//button[text()=' Save ']") // Adjusted XPath expression
    WebElement buttonSave;

//    @FindBy(xpath ="(//input[@class='oxd-input oxd-input--active oxd-input--error'])[1]")
//    WebElement txtUserName;
//
//    @FindBy(name = "(//input[@class=\"oxd-input oxd-input--active\"])[3]")
//    WebElement txtPassword;
//
//    @FindBy(name = "(//input[@class=\"oxd-input oxd-input--active\"])[4]")
//    WebElement txtConfirmPassword;

    // Initialization
    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Utilization
    public void clickPIMButton() {
        buttonPIM.click();
    }

    public void clickAddButton() {
        buttonAdd.click();
    }

    public void enterFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    public void enterEmployeeId(String employeeId) {
        txtEmployeeId.sendKeys(employeeId);
    }
//
//    public void clickCheckbox() {
//        checkbox.click();
//    }
//
    public void clickSaveButton() {
        buttonSave.click();
    }
//
//
//    public void enterUsername(String username) {
//        txtUserName.sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        txtPassword.sendKeys(password);
//    }
//
//    public void enterConfirmPassword(String confirmPassword) {
//        txtConfirmPassword.sendKeys(confirmPassword);
//    }

}
