package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task4 {


    /*https://uhomki.com.ua/
    Написать метод, который будет выводить в консоль тексты всех
    элементов, которые можно найти по заданнму параметру.
    Например при помощи него можно будет получить значения всех элементов
    из списков заданных на "Рисунок 4.png" и "Рисунок 5.png"*/
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua");
        WebElement text1 = driver.findElement(By.xpath("//ul[@class='products-menu__container']"));
        WebElement text2 = driver.findElements(By.xpath("//ul[@class='footer__menu']")).get(1);
        System.out.println("Текст рисунка 1 " + text1.getText());
        System.out.println("Текст рисункка 2 " +text2.getText());

        driver.quit();

}}
/*getPageSource()
       /* driver.get("https://rozetka.com.ua/ua/");
        Thread.sleep(2000);
        System.out.println(driver.getPageSource());
        Thread.sleep(2000);
        driver.quit();*/

/*или
//getAttribute() получение значения атрибута элемента
        //getCssValue() получение значения заданного свойства CSS
        //getTagName() информация тэге выбранного элемента
        //getText() получение текста внктри элемента
        /*driver.get("https://rozetka.com.ua/ua/");
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Я шукаю...']"));
        WebElement buttonSearch = driver.findElement(By.cssSelector(".button.button_color_green.button_size_medium.search-form__submit.ng-star-inserted"));
        System.out.println(search.getAttribute("placeholder"));
        System.out.println(search.getCssValue("background-image"));
        System.out.println(buttonSearch.getTagName());
        System.out.println(buttonSearch.getText());
        driver.quit();*/
