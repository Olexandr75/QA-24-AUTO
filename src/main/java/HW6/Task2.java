package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://www.ashortjourney.com/");
        Thread.sleep(4000);
        /*driver.findElement(By.xpath("//i[@id='menu-btn']")).click();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//i[@class='menu-icon icon-ouverture']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//i[@class='menu-icon dots-icon']")))
                .release().build().perform();
        Thread.sleep(6000);
        System.out.println(driver.getTitle());
        System.out.println("============");
        driver.findElement(By.xpath("//a[@id='close-btn']")).click();
        Thread.sleep(3000);*/
        WebElement circleBig = driver.findElement(By.linkText("DRAG"));
        int x = circleBig.getLocation().x;
        int y = circleBig.getLocation().y;
        actions.moveByOffset(x,y).
                moveToElement(driver.findElement
                        (By.linkText("DRAG")),508,95).
                click().build().perform();
        //driver.findElement(By.partialLinkText("DRAG")).click();//
        Thread.sleep(2000);
//div[@id="fb-root"]/following-sibling::text//
        //WebElement firstElement = driver.findElement(By.partialLinkText("DRAG"));//
        /*WebElement targetElement = driver.findElement(By.xpath("//i[@class='menu-icon dots-icon']"));
        actions.dragAndDrop(firstElement,targetElement).perform();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);*/
        driver.quit();
}}
