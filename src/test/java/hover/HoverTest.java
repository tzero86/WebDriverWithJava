package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed!");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is not the expected one.");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text is not the expected one.");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
