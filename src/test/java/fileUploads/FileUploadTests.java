package fileUploads;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/home/kali/Documents/Dev/JavaProjects/webdriverJava/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Incorrect uploaded file found.");
    }
}
