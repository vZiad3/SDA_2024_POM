package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class FacebookLoginPage {

//Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message

    public FacebookLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Faker faker = new Faker();

    @FindBy(id = "email" )
    public WebElement emailField;

    @FindBy(id = "pass")
    public WebElement passField;

    @FindBy(xpath = "//button[starts-with(@id, 'u_0_5')]")
    public WebElement clickButtonField;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMess;

    public void fakeLogin(){
        emailField.sendKeys(faker.internet().emailAddress());
        passField.sendKeys(faker.internet().password());
        clickButtonField.click();

    }

}
