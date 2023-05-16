package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*Написать программу реализующую действие показанное на "видео1.mp4".
        После выполнения программы на консоли должна выводится информация в следующем виде:

        Автомобили доступные для выбора:
        Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
        Страны из первой таблицы:
        USA, Russia, Japan, Mexico, India, Malaysia, Greece.
        Страны из второй таблицы:
        France, Germany, Italy, Spain.*/
public class Task1 {
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();


       // Открытие веб-страницы
       driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");


       // Выбор автомобиля Renault из выпадающего списка
       WebElement autoBox = driver.findElement(By.id("Carlist"));
       Select auto = new Select(autoBox);
       auto.selectByVisibleText("Renault");

       // Выбор стран из первой таблицы
        WebElement countries = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select country = new Select(countries);
        country.selectByVisibleText("France");
        country.selectByValue("Germany");
        country.selectByValue("Italy");
        country.selectByValue("Spain");


        // Нажатие кнопки со стрелкой вправо
        WebElement arrowButton = driver.findElement(By.xpath("//input[@value='->']"));
        arrowButton.click();

        // Вывод результатов всех авто

       System.out.println("Автомобили доступные для выбора:");
       List<WebElement> avto = auto.getOptions();
        for (WebElement avtoSelect: avto){
            System.out.println(avtoSelect.getText());

            }

        System.out.println("Страны из первой таблицы");
        List<WebElement> countr = country.getOptions();
        for (WebElement countPrint : countr) {
            System.out.println(countPrint.getText());

        }

       WebElement twoTable = driver.findElement(By.xpath("//select[@name='ToLB']"));
       Select tableTwo = new Select(twoTable);

       System.out.println("Страны из второй таблицы");

       List<WebElement> two = tableTwo.getOptions();
       for (WebElement counttPrint : two) {
           System.out.println(counttPrint.getText());


   }
       // Закрытие браузера*/
       driver.quit();}}

