package sda.pages.sauceDemo;

import org.checkerframework.checker.interning.qual.FindDistinct;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class LoginPage {
    //Navigate to https://www.saucedemo.com/
    //Enter the user name as standard_user
    //Enter the password as secret_sauce
    //Click on login button.
    //- Choose price low to high with soft Assert.
    //- Verify item prices are sorted from low to high with hard Assert.
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="user-name")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(String name, String password){
        userNameField.sendKeys(name);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}