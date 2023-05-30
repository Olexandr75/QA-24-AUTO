package HW9;
import lesson5.MyWaiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Task4 {
    @Test
    public void checkRedirect() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        MyWaiters wait = new MyWaiters(driver);
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        driver.findElement(By.id("ez-accept-all")).click();
        WebElement checkBox = wait.waitForPresentElementLocatedBy(By.xpath("//input[@id='RememberMe']"));
        assertTrue(checkBox.isDisplayed());
        assertFalse(checkBox.isSelected(),"Чекбокс выбран, но не требуется");
        checkBox.click();
        assertTrue(checkBox.isSelected(), "Чекбокс не выбран, а требуется выбор");
        checkBox.click();
        assertFalse(checkBox.isSelected(),"Чекбокс выбран, но не требуется");
        driver.quit();
    }
}
