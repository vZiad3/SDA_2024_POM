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
    public Globalsqa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Bank Manager Login']")
    public WebElement bankMangLogin;

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

    @FindBy(className = "btn home")
    public WebElement homeButton;

    @FindBy(linkText = "    Customer Login\n")
    public WebElement cutomerLoginButton;

    @FindBy(xpath = " //*[@ng-click='openAccount()']")
    public WebElement openAccountButton;

    @FindBy(id = "userSelect")
    public static WebElement dropDown;
    public void selectDropDown(int idnex) {
        Select select = new Select(dropDown);
        select.selectByIndex(idnex);
    }


    public void setAddCustomerPage()  {
        for (int i = 0; i < 4 ; i++) {
        fName.sendKeys(faker.name().firstName());
        lName.sendKeys(faker.name().lastName());
        postalCode.sendKeys(faker.address().zipCode());
        addCustButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        }
    }





}







