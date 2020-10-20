package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderControl = By.cssSelector(".sliderContainer input");
    private By sliderRange = By.cssSelector(".sliderContainer #range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSliderRangeValue(){
        return driver.findElement(sliderRange).getText();
    }

    public void sendLeftArrowKey(String value){
       driver.findElement(sliderControl).click();
       while(!getSliderRangeValue().equals(value)){
            driver.findElement(sliderControl).sendKeys(Keys.ARROW_RIGHT);
        }
    }

}
