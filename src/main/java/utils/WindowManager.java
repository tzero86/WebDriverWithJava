package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToNewTab(){
        var windows  = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }

    public void switchToTab(String tabName){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs open: " + windows.size());
        System.out.println("Window Handles: ");
        windows.forEach(System.out::println);

        for(String window: windows){
            System.out.println("Switching to Window: " + window);
            driver.switchTo().window(window);
            System.out.println("Current Window: " + driver.getTitle());
            if (tabName.equals(driver.getTitle())){
                break;
            }
        }
    }


}
