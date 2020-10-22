package iframes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {

    @Test
    public void testFrame(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        editorPage.setTextArea("Hello ");
        editorPage.decreaseIndentation();
        editorPage.setTextArea("world!");
        assertEquals(editorPage.getTextFromEditor(), "Hello world!", "Text is not the expected one.");
    }
}
