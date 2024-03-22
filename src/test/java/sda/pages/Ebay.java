package sda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class Ebay {
    //Day20:HW04
    //// Navigate to https://www.ebay.com/
    //// Perform a search after typing {search_keyword} in the search box
    //// Add the first product in the search results to the cart
    //// Go to the cart
    //// Increase the quantity of the purchased product to {quantity}
    //// Verify the total amount in the cart should be calculated as unit productPrice * quantity

    public Ebay(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Actions actions = new Actions(Driver.getDriver());


    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement search;

    //@FindBy(xpath = "//ul[@class='srp-results srp-grid clearfix']//li[@data-viewport][3]")
    @FindBy(xpath = "//*[.='Add to cart']")
    public WebElement item;


    @FindBy(xpath = "//*[@class='ux-call-to-action__cell'][.='Add to cart']")
    public WebElement addcart;
    //@FindBy

}
