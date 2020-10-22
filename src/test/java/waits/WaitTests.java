package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHiddenElementVisible(){
        var dynamicExample1Page = homePage.clickDynamicLoadingPage().clickExample1();
        dynamicExample1Page.clickStartButton();
        assertEquals(dynamicExample1Page.getResultText(), "Hello World!", "Incorrect expected Text");
    }

    @Test
    public void testWaitUntilElementIsCreated(){
        var dynamicExample2Page = homePage.clickDynamicLoadingPage().clickExample2();
        dynamicExample2Page.clickStartButton();
        assertEquals(dynamicExample2Page.getResultText(), "Hello World!", "Incorrect expected Text");
    }
}
