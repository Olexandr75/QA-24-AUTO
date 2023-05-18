package HW7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class Task1 {

        public static void main(String[] args) throws InterruptedException {


                System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                Actions actions = new Actions(driver);

                    // Шаг 1: Открыть поиск Google
                    driver.get("https://www.google.com/search");

                    // Шаг 2: Ввод ссылки в поисковую строку и открытие подходящей ссылки в новом окне
                    WebElement searchInput = driver.findElement(By.name("q"));
                    searchInput.sendKeys("https://www.guinnessworldrecords.com/account/register?");
                    searchInput.submit();
            System.out.println(driver.getTitle());

                    // Шаг 3: Ввод ссылки в поисковую строку и открытие подходящей ссылки в новом окне
                    searchInput.clear();
                    searchInput.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
                    searchInput.submit();

                    // Шаг 4: Открыть ссылку и заполнить форму
                    driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

                    driver.switchTo().frame("iframeResult"); // Переключение на фрейм, содержащий форму

                    WebElement firstNameInput = driver.findElement(By.name("firstname"));
                    WebElement lastNameInput = driver.findElement(By.name("lastname"));
                    WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

                    firstNameInput.sendKeys("Ваше имя");
                    lastNameInput.sendKeys("Ваша фамилия");
                    submitButton.click();

                    // Шаг 5: Переключиться на окно с несовпадающими паролями
                    driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
                    WebElement passwordInput = driver.findElement(By.id("password"));
                    WebElement confirmPasswordInput = driver.findElement(By.id("confirmPassword"));
                    WebElement mismatchMessage = driver.findElement(By.className("mismatch"));

                    passwordInput.sendKeys("пароль1");
                    confirmPasswordInput.sendKeys("пароль2");

                    String mismatchText = mismatchMessage.getText();
                    System.out.println("Сообщение об несоответствии паролей: " + mismatchText);

                    // Шаг 6: Переключиться на окно с кнопками
                    driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
                    WebElement button1 = driver.findElement(By.id("button1"));
                    WebElement button2 = driver.findElement(By.id("button2"));
                    WebElement button3 = driver.findElement(By.id("button3"));

                    actions.click(button1).perform();
                    Alert alert = driver.switchTo().alert();
            String alertMessage1 = alert.getText();
                    alert.accept();
                    System.out.println("Сообщение в модуле 'Popup box output' после нажатия на первую кнопку: " + alertMessage1);

                    actions.click(button2).perform();
                    String alertMessage2 = alert.getText();
                    alert.dismiss();
                    System.out.println("Сообщение в модуле 'Popup box output' после нажатия на вторую кнопку: " + alertMessage2);

                    actions.click(button3).perform();
                    String inputText = "Final step of this task";
                    alert.sendKeys(inputText);
                    alert.accept();
                    System.out.println("Сообщение в модуле 'Popup box output' после нажатия на третью кнопку: " + inputText);

                    // Закрытие браузера
                    driver.quit();
                }
            }




