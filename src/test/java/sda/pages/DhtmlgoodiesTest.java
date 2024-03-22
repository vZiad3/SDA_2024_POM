package sda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

import java.util.List;

public class DhtmlgoodiesTest {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.
    public  DhtmlgoodiesTest(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "box1")
    public WebElement country;
    @FindBy(id = "box4")

    public WebElement country2;

    @FindBy(id = "box106")

    public WebElement cap;
    @FindBy(id = "box104")

    public WebElement cap4;
    //public List<WebElement> cap = Driver.getDriver().findElements(By.id("dropContent"));
   public  Actions actions = new Actions(Driver.getDriver());


}
