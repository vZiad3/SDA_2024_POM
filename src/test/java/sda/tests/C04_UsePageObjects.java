package sda.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.pages.sauceDemo.InventoryPage;
import sda.pages.sauceDemo.LoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C04_UsePageObjects {

    @Test
    public void pageObjects(){
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();

        //Navigate to https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));

        //Enter the user name as standard_user
        loginPage.userNameField.sendKeys(ConfigReader.getProperty("sauceDemoUsername"));
        //Enter the password as secret_sauce
        loginPage.userNameField.sendKeys(ConfigReader.getProperty("sauceDemoPassword"));

        //Click on login button.
        loginPage.loginButton.click();
        //- Choose price low to high with soft Assert.
        inventoryPage.selectByIndex(2);
        //String optionText = inventoryPage..
        SoftAssert softAssert9 = new SoftAssert();
        //- Verify item prices are sorted from low to high with hard Assert.

    }
}
