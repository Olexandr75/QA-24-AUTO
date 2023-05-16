package HW5;

import lesson4.helper.NoSuchAlertEx;
import lesson4.helper.NoSuchIdEx;
import lesson4.helper.NoSuchNameEx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /*Написать метод который выводит сообщение об айди элемента,
    значении тэга элемента , значении класса элемента,
    значении атрибута name элемента, текста данного элемента,
    а также о координатах центра контейнера данного элемента.
    Создать свой тип исключений, который будет вызываться если у элемента
    нет определенного атрибута и на экран будет выводиться сообщение об отсутствии данного атрибута.*/

    public static void getDan (WebElement element) throws NoSuchAlertEx, NoSuchNameEx, NoSuchIdEx {


        if(element.getAttribute("id")==null){
            throw new NoSuchIdEx("Аттрибута id нет");
        }else {
            System.out.println("Аттрибут id равен "+element.getAttribute("id"));
        }

        if(element.getAttribute("name")==null){
            throw new NoSuchNameEx("Аттрибута name нет");
        }else {
            System.out.println("Аттрибут name равен "+element.getAttribute("name"));
        }

        if(element.getAttribute("alert")==null){
            throw new NoSuchAlertEx("Аттрибута alert нет");
        }else {
            System.out.println("Аттрибут alert равен "+element.getAttribute("alert"));
        }
    }
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru");
        WebElement element = driver.findElement(By.xpath("(//div[@class='upButton'])"));
        System.out.println("Название тега: "+element.getTagName());
        System.out.println("Текст элемента: "+element.getText());
        System.out.println("Координаты центра: "+element.getLocation());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.getMessage();
        }
        try {
            getDan(driver.findElement(By.xpath("(//div[@class='upButton'])")));
        }catch(NoSuchIdEx|NoSuchNameEx|NoSuchAlertEx ex){
            System.out.println(ex.getMessage());
        }
        driver.quit();


    }
}

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
 /* try{
            division(9);
        }catch(ZeroValueException e){
            System.out.println(e.getMessage());
        }catch (NegativeValueException e){
            System.out.println(e.getMessage());
        }*/
       /* try {
            division(1   2);
        }catch (ZeroValueException|NegativeValueException e){
            System.out.println(e.getMessage());
        }*/
       /* try {
                division2(12);
                }catch (ZeroValueEx|NegativeVal exception){
                System.out.println(exception.getMessage());
                }*/
 /*int i = scanner.nextInt();
        if(i==0){
                throw new ZeroValueException();
                }
                if (x/i<0){
        throw new NegativeValueException();
        }
        System.out.println(x/i);*/