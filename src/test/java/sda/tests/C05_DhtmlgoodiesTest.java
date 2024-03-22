package sda.tests;

import org.testng.annotations.Test;
import sda.pages.DhtmlgoodiesTest;
import sda.utilities.Driver;

public class C05_DhtmlgoodiesTest {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.

    @Test
    public void dragAndDrop() {
        DhtmlgoodiesTest dhtmlgoodiesTest = new DhtmlgoodiesTest();
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        // Fill in capitals by country.
        dhtmlgoodiesTest.actions
                .dragAndDrop(dhtmlgoodiesTest.country, dhtmlgoodiesTest.cap)
                .dragAndDrop(dhtmlgoodiesTest.country2, dhtmlgoodiesTest.cap4)
                .perform();

    }
}
