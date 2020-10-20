package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getAlertResult(), "You successfuly clicked an alert", "Result is not the expected one.");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String alertText = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(alertText,"I am a JS Confirm", "Incorrect result value.");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String textInput = "Angie is awesome!";
        alertPage.alert_setInput(textInput);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getAlertResult(),"You entered: " + textInput, "Result text is not the expected one." );
    }
}
