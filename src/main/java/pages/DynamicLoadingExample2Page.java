package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingAnimation = By.id("loading");
    private By resultText = By.cssSelector("#finish h4");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingAnimation
        )));
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

    public boolean isStartButtonPresent(){
        return driver.findElement(startButton).isDisplayed();
    }

}
