

package sda.pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sda.utilities.Driver;

public class InventoryPage {

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "select")
    public WebElement dropDown;

    @FindBy(xpath = "//span[@class='active_option']")
    public WebElement selectedOption;


    public void selectByIndex(int idx){     // we can switch to text , value ...etc  e.g. selectByValue(text);
        Select select = new Select(dropDown);
        select.selectByIndex(idx);                  // we can switch to text , value ...etc  e.g. selectByValue(text);
    }

    public void selectByVisibleText(String text){
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public String getTextOfSelectedOption(){
        return selectedOption.getText();
    }
}