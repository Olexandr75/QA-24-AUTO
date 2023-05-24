package HW5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;




public class Task1 {


                 public static void main(String[] args) throws InterruptedException {
                     System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
            
                // Создаем список URL-адресов
                List<String> urls = new ArrayList();

                urls.add("https://www.w3schools.com/");
                urls.add("https://taxi838.ua/ru/dnepr/");
                urls.add("https://klopotenko.com/");
                urls.add("https://zoo.kiev.ua/");
                     urls.add("https://uhomki.com.ua/");


               //driver.get("https://uhomki.com.ua/");//

                // Открываем каждую страницу из списка в отдельном окне
                for (String url : urls) {
                    driver.navigate().to(url);
                    ((JavascriptExecutor)driver).executeScript("window.open('" + url + "', 'new window')");

                }


                // Получаем список дескрипторов окон браузера
                List<String> windows = new ArrayList(driver.getWindowHandles());

                // Цикл, который переключается между всеми окнами и выводит их названия и ссылки
                for (String window : windows) {
                    // Переключаемся на текущее окно
                    driver.switchTo().window(window);
                    // Получаем название страницы и ссылку
                    String title = driver.getTitle();
                    String url = driver.getCurrentUrl();
                    // Выводим название и ссылку на страницу в консоль
                    System.out.println("Title: " + title);
                    System.out.println("URL: " + url + "\n");
                    // Если в названии страницы есть слово "зоопарк", закрываем окно
                    if (title.toLowerCase().contains("zoo")) {
                        driver.close();}

                }

                // Закрываем браузер
                driver.quit();
            }
        }



    /*Написать программу, которая будет открывать пять различных страниц в новых окнах:
    https://uhomki.com.ua/
    https://zoo.kiev.ua/
    https://www.w3schools.com/
    https://taxi838.ua/ru/dnepr/
    https://klopotenko.com/

    private static class Url


    Прописать цикл, который будет переключаться поочередно через все страницы,
    для каждой страницы выводить в консоль название и ссылку на эту страницу.
    И будет закрывать ту страницу в названии которой есть слово зоопар*/

    /*private static class Url{
        private static final String homka = "https://uhomki.com.ua/";
        private static final String klopot = "https://klopotenko.com";
        private static final String taxi = "https://taxi838.ua/ru/dnepr/";
        private static final String zoo = "https://zoo.kiev.ua/";
        private static final String w3sc = "hhttps://www.w3schools.com/";

    }

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       /*String [] url = new String [] {Url.zoo,Url.taxi,Url.klopot,Url.homka,Url.w3sc};



        driver.get(Url.homka);
        Thread.sleep(2000);
        //System.out.println(driver.getCurrentUrl());//
        //System.out.println(driver.getTitle());//
        driver.get(Url.taxi);
        Thread.sleep(2000);
        //System.out.println(driver.getCurrentUrl());//
        //System.out.println(driver.getTitle());//
        driver.get (Url.zoo);
        Thread.sleep(2000);
        //System.out.println(driver.getCurrentUrl());//
        //System.out.println(driver.getTitle());//
        driver.get (Url.klopot);
        Thread.sleep(2000);
        //System.out.println(driver.getCurrentUrl());//
        //System.out.println(driver.getTitle());//
        driver.get (Url.w3sc);
//        System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());//
        driver.quit();

        for (String String: url) { driver.get(String);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());}



}}*/

//navigate
      /*  driver.get("https://rozetka.com.ua/ua/");
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.navigate().to("https://itstep.dp.ua/");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.quit();*/
/*System.out.println
//getTitle()
//getCurrentUrl()
  //getCurrentUrl()
        /*driver.get("https://rozetka.com.ua/ua/");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.get("https://itstep.dp.ua/");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
*/

//getTitle()
       /* driver.get("https://rozetka.com.ua/ua/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.get("https://itstep.dp.ua/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();*/

