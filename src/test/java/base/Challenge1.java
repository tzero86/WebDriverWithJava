package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Challenge1 {

        private WebDriver driver;

        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/");

            WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
            shiftingContent.click();

            WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
            menuElement.click();

            List<WebElement> menuItems = driver.findElements(By.tagName("li"));
            System.out.printf("Total number of MenuItems found: %d %n", menuItems.size());

            driver.quit();
        }

        public static void main(String[] arg){
            Challenge1 test = new Challenge1();
            test.setUp();
        }
    }


