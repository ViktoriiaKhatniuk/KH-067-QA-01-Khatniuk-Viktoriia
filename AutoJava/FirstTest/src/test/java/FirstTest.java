import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        WebElement searchElement = driver.findElement(By.cssSelector("input"));
        searchElement.sendKeys("rozetka ua");
        searchElement.submit();
        WebElement choseElement = driver.findElement(By.cssSelector("h3:only-of-type"));
        choseElement.click();
        WebElement rozetkaSearch = driver.findElement(By.cssSelector("input"));
        rozetkaSearch.sendKeys("телефон");
        rozetkaSearch.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement searchFirstProduct = driver.findElement(new By.ByXPath("//ul[@class='catalog-grid ng-star-inserted']/li[1]"));
        searchFirstProduct.click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement advertisingClose = driver.findElement(By.cssSelector("#rz-banner > span > span"));
        advertisingClose.click();
        WebElement addToCart = driver.findElement(new By.ByXPath("/html/body/app-root/div/div/rz-product/aside/rz-product-carriage/div/div[3]/div/rz-product-buy-btn/app-buy-button/button/span"));
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement checkout = driver.findElement(new By.ByXPath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-shopping-cart/div/div[1]/div/a"));
        checkout.click();
        System.out.println(driver.getCurrentUrl().equals("https://rozetka.com.ua/checkout/"));
        driver.close();

    }
}

