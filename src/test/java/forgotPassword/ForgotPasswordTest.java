package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testForgotPassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgotPasswordPage.retrievePassword("test@test.com");
        assertEquals(emailSentPage.getMessageText(),  "Your e-mail's been sent!", "Message is incorrect");
    }


}
