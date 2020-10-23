package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ControlClickChallengeTests extends BaseTests {

    @Test
    public void testControlClickNewTab(){
        var dynamicPage = homePage.clickDynamicLoadingPage().ctrlClickExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(dynamicPage.isStartButtonPresent(), "Start Button not present.");
    }
}
