package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sda.utilities.Driver;

public class Globalsqa {

    Faker faker = new Faker();
    Select select;
     //public Alert alert = Driver.getDriver().switchTo().alert();

    public Globalsqa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Bank Manager Login']")
    public WebElement bankMangLogin;

//    @FindBy(id = "name")

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    public WebElement addCustomer;

    @FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement fName;
    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement lName;
    @FindBy(xpath = "//*[@placeholder='Post Code']")
    public WebElement postalCode;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addCustButton;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    public WebElement homeButton;

    @FindBy(linkText = "    Customer Login\n")
    public WebElement cutomerLoginButton;

    @FindBy(xpath = " //*[@ng-click='openAccount()']")
    public WebElement openAccountButton;

    @FindBy(id = "userSelect")
    public  WebElement dropDown;
    @FindBy(id = "currency")
    public  WebElement currency;
    @FindBy(xpath = "//button[.='Process']")
    public  WebElement processButton;

    @FindBy(xpath = "//button[@ng-click='showCust()']")
    public WebElement customerButton;
    @FindBy(tagName = "table")
    public WebElement fullTable;

    @FindBy(linkText = "Login")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    public WebElement deopositeButton;

    @FindBy(xpath = "//input[@ng-model='amount']")
    public WebElement amountInput;
    @FindBy(xpath = "//*[.='Deposit']")
    public WebElement depositeButton;

    @FindBy(xpath = "//*[.='Deposit Successful']")
    public WebElement sucessMess;

    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withDrawButton;

    @FindBy(xpath = "//*[.='Withdraw']")
    public WebElement withdraweButtonAfter100;

    @FindBy(xpath = "//*[.='Transaction successful']")
    public WebElement transactionSuccessMessage;

    @FindBy(xpath = "//button[@ng-show='logout']")
    public WebElement logOutButton;



    public void selectDropDown1(int idnex) {
         select = new Select(dropDown);
        select.selectByIndex(idnex);
    }

    public void setCurrency(int valueOfCurrency){
       select= new Select(currency);
        select.selectByIndex(valueOfCurrency);
    }


    public void addCustomerPage()  {
        for (int i = 0; i < 4 ; i++) {
        fName.sendKeys(faker.name().firstName());
        lName.sendKeys(faker.name().lastName());
        postalCode.sendKeys(faker.address().zipCode());
        addCustButton.click();
        Driver.getDriver().switchTo().alert().accept();
        }
    }

    //Here i used for loop and faker, so in every itreation it will chose random index for the Customer name and Currency
    public void addingNumOfAccounts(int numberOfAcc){
        for (int x = 0 ; x < numberOfAcc ; x++){
            selectDropDown1(faker.number().numberBetween(0,3));
            setCurrency(faker.number().numberBetween(0,2));
            processButton.click();
            //Driver.getDriver().switchTo().alert().accept();
        }
    }
    public int rowCount(){
        return fullTable.findElements(By.xpath(".//tr")).size();
    }
    // Table tasks
  //  public  void table(){
  //      int rowCoun2t = fullTable.findElements(By.xpath(".//tr")).size();
  //      System.out.println("rowCount = " + rowCount);
  //      }
//


    @FindBy(xpath = "//*[@ng-click='deleteCust(cust)']")
    public WebElement deleteButton;
    public void deleteFunction(int numbOfDeleteUwant){
        for (int z = 0 ; z <= numbOfDeleteUwant ; z ++){
            deleteButton.click();   // it will be clicked and the number will reduce from 5 to 4 all the way to 0
        }
    }

    public boolean rowCountAssertLast(){

        return fullTable.findElements(By.xpath(".//tr")).size()<=0;
    }

}







