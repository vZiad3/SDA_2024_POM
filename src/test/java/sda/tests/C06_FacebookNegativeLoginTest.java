package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.FacebookLoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C06_FacebookNegativeLoginTest {
    //Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message

    @Test
    public void login(){

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage();

        //Go to https://www.facebook.com/
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        //Log in (faker class)
        facebookLoginPage.fakeLogin();
       // facebookLoginPage.emailField.sendKeys();
       // facebookLoginPage.passField.sendKeys();
       // facebookLoginPage.clickButtonField.click();

        //Test the "Failed to login" message
        Assert.assertTrue(facebookLoginPage.errorMess.isDisplayed());
    }
}
