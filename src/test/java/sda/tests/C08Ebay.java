package sda.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import sda.pages.Ebay;
import sda.utilities.Driver;

public class C08Ebay {
    //Day20:HW04
    //// Navigate to https://www.ebay.com/
    //// Perform a search after typing {search_keyword} in the search box
    //// Add the first product in the search results to the cart
    //// Go to the cart
    //// Increase the quantity of the purchased product to {quantity}
    //// Verify the total amount in the cart should be calculated as unit productPrice * quantity

    @Test
    public void ebay(){

        Ebay ebay = new Ebay();
        //// Navigate to https://www.ebay.com/
        Driver.getDriver().get("https://www.ebay.com/");
        //// Perform a search after typing {search_keyword} in the search box
        ebay.search.sendKeys("HHH", Keys.ENTER);
        //// Add the first product in the search results to the cart
        //// Go to the cart
        ebay.item.click();
        ebay.addcart.click();
        //// Increase the quantity of the purchased product to {quantity}

        //// Verify the total amount in the cart should be calculated as unit productPrice * quantity
    }
}
