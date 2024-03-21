package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilities.Driver;

public class C02_UsedDriverClass {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Verify title contains OrangeHRM.
    //Use Driver Class.

    @Test
    public void driverClassTest(){
        //Go to URL: https://opensource-demo.orangehrmlive.com/
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        //Verify title contains OrangeHRM.
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));

        //Use Driver Class.
        Driver.getDriver().close();



    }
}
