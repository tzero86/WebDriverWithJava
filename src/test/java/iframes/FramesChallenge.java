package iframes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesChallenge extends BaseTests {

    @Test
    public void testFrameChallenge(){
        var framesPage = homePage.clickNestedFrames();
        assertEquals(framesPage.getLeftFrameText(), "LEFT", "Left Text is not the expected one.");
        assertEquals(framesPage.getBottomFrameText(), "BOTTOM", "Bottom Text is not the expected one");
    }
}
