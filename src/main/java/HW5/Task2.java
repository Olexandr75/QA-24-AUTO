package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*Написать метод в параметры которого принимаются два ВебЭлемента.
    метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
    какой из элементов располагается левее на странице,
    а также какой из элементов занимает большую площадь.
    Параметры метода могут также включать в себя другие аргументы, если это необходимо.*/
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://uhomki.com.ua/ru/");
        WebElement dogs = driver.findElement(By.xpath("//a[text()='Собаки']"));
        WebElement payUr = driver.findElement (By.xpath("//div[text()='Оплата  при получении']"));
        System.out.println("X собаки = " + dogs.getLocation().x);
        System.out.println("Y собаки = " + dogs.getLocation().y);

        System.out.println("==========================");

        System.out.println("Х Оплата при получении " + payUr.getLocation().x);
        System.out.println("Y Оплата при получении " + payUr.getLocation().y);


        int x1= dogs.getLocation().x;
        int x2 = payUr.getLocation().x;

        if (x1>x2){
            System.out.println("Собаки  левее Оплата  при получении");
        }
        else {
            System.out.println("Оплата  при получении левее Собаки");}
        int y1= driver.findElement(By.xpath("//a[text()='Собаки']")).getLocation().y;
        int y2 = driver.findElement(By.xpath("//div[text()='Оплата  при получении']")).getLocation().y;
        if (y1>y2){
            System.out.println("Оплата  при получении выше Собаки");
        }
        else  {
            System.out.println("Собаки выше Оплата  при получении");}

        System.out.println("Размер кнопки Собаки "+ dogs.getSize());
        System.out.println("Размер кнопки Оплата при получении "+ payUr.getSize());
        int s1 = dogs.getSize().height * dogs.getSize().width;
        int s2 = payUr.getSize().height * payUr.getSize().width;
        if (s1>s2){
            System.out.println("Кнопка Собаки  больше Кнопки Оплата при получении");
        }
        else  {
            System.out.println("Кнопка Оплата при получении больше Кнопки Собаки");}


        driver.quit();

    }}

