package HW4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/css/default.asp");}
    private static class Locators{
        //Задание 1
        //x.path (span[@class='userbar__button-text'])
        //x.path (span[text()='Вход']. get(1))
        //driver.findElement(By.LinkText("Вход")).get(1)
        //x.path (a[@class='userbar__button __active'])

        //Задание 2
        //x.path (a[text()='Каталог']//a[text()='Собаки/кошки общее'])

        //Задание 3
        //driver.findElement(By.partialLinkText("IT специальностям"))

        //Задание  4
        //x.path (span[text()='Аквариумы']
        //Задание  5
        //x.path (img[@alt='phone']//following-sibling::span)
        //Задание  6
        //x.path (h2 [@class='re-section-title re-home-children__title'])
        //Задание  7
        //*[@id='nav_exercises'], *[@id='nav_references'], //*[@id='nav_tutorials'], //*[@id='cert_navbtn']
        //Задание  8
        //h3 [text()='Университет'][last]//a[@class='re-home-adult__item-name']
        //Задание  9
        //x.path (a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary'])
         //Задание  10
        // x.path a[@class='_main_12yxkch_17 _modeClassic_12yxkch_135 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59 _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl'

    }
    private static class Url{
        private static final String homiak = "https://uhomki.com.ua/koshki/1074/";
        private static final String homCatalog = "https://uhomki.com.ua/ru/katalog/";
        private static final String ItStep = "https://itstep.dp.ua/ru";
        private static final String w3sc = "hhttps://www.w3schools.com/";
        private static final String IdeaJava = "https://www.jetbrains.com/idea/";
        private static final String JavaDl = "https://jetbrains.com/idea/download/#section=windows";
    }
}
