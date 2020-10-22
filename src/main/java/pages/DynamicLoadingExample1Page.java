package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingAnimation = By.id("loading");
    private By resultText = By.cssSelector("#finish h4");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingAnimation)));*/
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingAnimation)));
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
