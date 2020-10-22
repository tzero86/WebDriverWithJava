package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String xpath_Format = "//a[contains(text(), '%s')]";
    private By example1 = By.xpath(String.format(xpath_Format, "Example 1"));
    private By example2 = By.xpath(String.format(xpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}
