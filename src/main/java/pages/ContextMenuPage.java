package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String alert_getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void triggerContextMenu(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpot)).perform();
    }
}
