import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondTest {
    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fat-menu")));
        WebElement searchElement = driver.findElement(By.id("fat-menu"));
        searchElement.click();
        WebElement element = driver.findElement(new By.ByXPath("//div[@class='menu__hidden-column ng-star-inserted'][2]//ul[2]//li[1]"));
        element.click();
        WebElement checkbox = driver.findElement(By.cssSelector("[data-id='Rozetka']"));
        checkbox.click();
        WebElement firstItem = driver.findElement(By.cssSelector("[data-goods-id='250707941']"));
        firstItem.click();
        driver.close();
    }
}
