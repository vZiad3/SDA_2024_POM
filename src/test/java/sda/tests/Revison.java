package sda.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import sda.pages.GlobalsqaRevision;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

import java.time.Duration;
import java.util.List;

public class Revison {
    @BeforeSuite
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("globalsUrl"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    }
    @AfterSuite(enabled = false)
    public void tearDown(){
        Driver.getDriver().quit();
    }
//
    @Test
    public void entery(){
        GlobalsqaRevision revision = new GlobalsqaRevision();

        revision.BankMangerLogin.click();
        revision.addCustomer.click();
        revision.addCustomerPage(5);    // method to select numbers of customer u want to add
        revision.openAccount.click(); // enter open account section
        revision.selectCustomerFromOpenAcc(2);
        revision.selectCurrencyFromOpenAcc(1);
        revision.openAcc();
        revision.customerButton.click();

        List<WebElement> name33 = revision.fullTable.findElements(By.xpath("./tr/td[3]"));
        List<WebElement> columnValues = revision.fullTable.findElements(By.xpath("./tr/td[3]"));
        for (WebElement value : columnValues) {
            System.out.println(value.getText()); // Get and print the text of each cell in the 3rd column
        }

//        Assert.assertTrue(revision.currency.);
//        Driver.getDriver().quit();
    }
}
