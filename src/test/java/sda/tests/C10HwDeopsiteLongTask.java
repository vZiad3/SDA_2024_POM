package sda.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.Globalsqa;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C10HwDeopsiteLongTask {
    @Test
    public void deopsite() throws InterruptedException {


        Globalsqa globalsqa = new Globalsqa();
        //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts you created.
//
//Given
//    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(ConfigReader.getProperty("globalsUrl"));
//
//When
//    Click on "Bank Manager Login" button
        globalsqa.bankMangLogin.click();
//And
//    Click on "Add Customer" button
        globalsqa.addCustomer.click();
//And
//    Fill inputs and click on "Add Customer" submit button
        globalsqa.addCustomerPage();
//And
//    Accept alert
        //Handled with setAdd method
//And
//    Add 4 more customers
        // done usnig for loop with set method
//And
// clicking on home page so we can locate the other element and ocntinue our tasks
        globalsqa.homeButton.click();
        globalsqa.bankMangLogin.click();
//    Click on "Open Account"  button
//And
        globalsqa.openAccountButton.click();


//    Click on "Customer" dropdown
//And
       globalsqa.dropDown.click();


//    Select customer name
        globalsqa.selectDropDown1(2);

//And
//    Click on "Currency" dropdown
        globalsqa.currency.click();

//And
//    Select "Dollar"
       globalsqa.setCurrency(1); // which's equal to "Dolar"
        globalsqa.currency.click();

//And
//    Click on "Process" button
       globalsqa.processButton.click();

//And
//    Accept alert
        //globalsqa.alert.accept();
//And
//    Open 4 more accounts
        //globalsqa.addingNumOfAccounts(4);
//And
//    Click on "Customers" button
        Thread.sleep(1000);
        Driver.getDriver().switchTo().alert().accept();
        globalsqa.customerButton.click();
//And
//    Count table row numbers
        System.out.println("globalsqa.rowCount = " + globalsqa.rowCount());

//Then
//    Assert that you created 5 customers
        Assert.assertEquals(globalsqa.rowCount(),4);
//When
//    Click on "Home" button
        globalsqa.homeButton.click();
//And
//    Click on "Customer Login" button
        globalsqa.cutomerLoginButton.click();
//And
//    Click on "Your Name" dropdown
        globalsqa.dropDown.click();
//And
//    Select the any name you created
        globalsqa.selectDropDown1(6);

//And
//    Click on "Login" button
        globalsqa.loginButton.click();
//And
//    Click on "Deposit" button
        globalsqa.deopositeButton.click();
//And
//    Type 100 into "Amount to be Deposited" input
        globalsqa.amountInput.click();
        globalsqa.amountInput.sendKeys("100");
//And
//    Click on "Deposit"(Submit) button
        globalsqa.deopositeButton.click();
//Then
//    Assert that "Deposit Successful" is displayed
        Assert.assertTrue(globalsqa.sucessMess.equals("Deposit Successful"));
//And
//    Click on "Withdrawal" button
        globalsqa.withDrawButton.click();
//And
//    Type 100 into "Amount to be Withdrawn" input
        globalsqa.amountInput.click();
        globalsqa.amountInput.sendKeys("100");
//And
//    Click on "Withdraw"(Submit) button
        globalsqa.withdraweButtonAfter100.click();
//Then
//    Assert that "Transaction  Successful" is displayed
        Assert.assertTrue(globalsqa.transactionSuccessMessage.equals("Transaction successful"));
//When
//    Click on "Logout" button
        globalsqa.loginButton.click();
//Andd
//    Click on "Home" button
        globalsqa.homeButton.click();
//And
//    Click on "Bank Manager Login" button
        globalsqa.bankMangLogin.click();
//And
//    Click on "Customers" button
        globalsqa.customerButton.click();
//And
//    Click on each "Delete" button
        globalsqa.deleteFunction(4);

//And
//    Count table row numbers
        System.out.println("row coutn is  = " + globalsqa.rowCount());

//Then
//    Assert that number of customers is 0
        Assert.assertTrue(globalsqa.rowCountAssertLast());    // if the row <=0 it will be true :)


    }
}
