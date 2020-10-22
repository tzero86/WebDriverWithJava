package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameText(){
        switchToTopFrame();
        switchToLeftFrame();
        String text = getFrameText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    public String getBottomFrameText(){
        switchToBottomFrame();
        String text = getFrameText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    private String getFrameText(){
        return driver.findElement(body).getText();
    }
    private void switchToTopFrame(){
        driver.switchTo().frame(topFrame);
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
}
