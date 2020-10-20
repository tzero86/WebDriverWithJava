package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextPage = homePage.clickContextMenu();
        contextPage.triggerContextMenu();
        String alertText = contextPage.alert_getAlertText();
        contextPage.alert_acceptAlert();
        assertEquals(alertText, "You selected a context menu", "Alert Text is not the expected one.");
    }
}
