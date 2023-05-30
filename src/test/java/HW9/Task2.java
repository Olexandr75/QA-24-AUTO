package HW9;

import lesson5.MyWaiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Task2 {
    @Test
    public void checkRedirect() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        MyWaiters wait = new MyWaiters (driver);
        driver.get("https://uhomki.com.ua/ru/");
        WebElement element = wait.waitPresenceOfElementReturn(By.xpath("//div[@class='header__wrapper']//a[text()='Оплата и доставка']"));
        element.click();
        wait.waitPresenceOfElement(By.xpath("//a[text()='Оплата и доставка'][@class='sideMenu-a']"));
        assertEquals(driver.getCurrentUrl(), "https://uhomki.com.ua/ru/oplata-i-dostavka/", "Неправильный редирект");
        driver.quit();
    }
}
