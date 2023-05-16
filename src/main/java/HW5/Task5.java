package HW5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    /*Написать программу, которая повторит действия на видео "Задание 5.mp4"*/
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/css/default.asp");
    }
}
