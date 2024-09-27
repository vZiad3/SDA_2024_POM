package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

import java.time.Duration;
import java.util.List;

public class GlobalsqaRevision {

    public GlobalsqaRevision() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    Faker faker = new Faker();
    Select select;
//    Select select = new Select();         // We are not going to use this because it might got confused which select to use if we have multiple selects





    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-lg\"][text()=\"Bank Manager Login\"]")
    public WebElement BankMangerLogin;
    @FindBy(xpath = "//*[@ng-class=\"btnClass1\"][@ng-click=\"addCust()\"]")
    public WebElement addCustomer;

    @FindBy(xpath = "//*[@ng-model=\"fName\"]")
    public WebElement fName;
    @FindBy(xpath = "//*[@ng-model=\"lName\"]")
    public WebElement lName;
    @FindBy(xpath = "//*[@ng-model=\"postCd\"]")
    public WebElement postCode;
    @FindBy(xpath = "//*[@class=\"btn btn-default\"][text()=\"Add Customer\"]")
    public WebElement addCustomerButtonInside;
    @FindBy(xpath = "//*[@ng-class=\"btnClass2\"][@ng-click=\"openAccount()\"]")
    public WebElement openAccount;
    @FindBy(id = "userSelect")
    public  WebElement dropDownForCustomer;
    @FindBy(id = "currency")
    public  WebElement currency;
    @FindBy(xpath = "//*[@type='submit'][text()='Process']")
        public  WebElement process;
    @FindBy(xpath = "//button[@ng-click='showCust()']")
    public WebElement customerButton;
    @FindBy(xpath = "//table[@class='table table-bordered table-striped']/tbody")       // here is the full table, and later we can choose from it which cell we want
    public WebElement fullTable;



    public void addCustomerPage(int numberOfUser){
        for (int i = 0; i < numberOfUser; i++ ){
//            fName = Faker.instance().name().firstName();        // Webelements = we need to send keys
                fName.sendKeys(Faker.instance().name().firstName());
                lName.sendKeys(Faker.instance().name().lastName());
                postCode.sendKeys(Faker.instance().address().zipCode());
                addCustomerButtonInside.click();
                Driver.getDriver().switchTo().alert().accept();
        }
    }

   public void selectCustomerFromOpenAcc(int customerNumber){
       select = new Select(dropDownForCustomer);
       select.selectByIndex(customerNumber);
   }
   public void selectCurrencyFromOpenAcc(int currencyNumber){
       select = new Select(currency);
       select.selectByIndex(currencyNumber);
   }

    public void openAcc(){
        selectCustomerFromOpenAcc(Faker.instance().number().numberBetween(1,5));
        selectCurrencyFromOpenAcc(Faker.instance().number().numberBetween(1,3));
        process.click();
        Driver.getDriver().switchTo().alert().accept();
    }

//    public void printCelles(int numberOfCelles){
//        List<WebElement> rows = Driver.getDriver().findElements((By) fullTable);
//        for (WebElement numberOfCelles: rows)
//    }


}
