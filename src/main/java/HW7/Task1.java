package HW7;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Set;

public class Task1 {

        public static void main(String[] args) throws InterruptedException {




                System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
                        WebDriver driver = new ChromeDriver();
                        driver.manage().window().maximize();

                        driver.get("https://www.google.com/search");

                        WebElement search = driver.findElement(By.xpath("//textarea[@type='search']"));
                        search.sendKeys("https://www.guinnessworldrecords.com/account/register?");
                        search.sendKeys(Keys.ENTER);


                        WebElement firstP = driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']"));
                        Set<String> firstWin = driver.getWindowHandles();
                        Actions actions = new Actions(driver);
                        actions.moveToElement(firstP).keyDown(Keys.CONTROL).click(firstP).keyUp(Keys.CONTROL).build().perform();
                        Set<String> secondWin = driver.getWindowHandles();
                        secondWin.removeAll(firstWin);
                System.out.println(driver.getTitle());


                        String secondWindowHandle = secondWin.iterator().next();


                        WebElement search2 = driver.findElement(By.xpath("//textarea[@type='search']"));
                        search2.clear();
                        search2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
                        search2.sendKeys(Keys.ENTER);

                        Set<String> firstWinAgane = driver.getWindowHandles();
                        WebElement secondPage = driver.findElement(By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']"));
                        actions.moveToElement(secondPage).keyDown(Keys.CONTROL).click(secondPage).keyUp(Keys.CONTROL).build().perform();
                        Set<String> secondWindUp = driver.getWindowHandles();
                         secondWindUp.removeAll(firstWinAgane);
                        System.out.println(driver.getTitle());

                        String thirdWinHandle = secondWindUp.iterator().next();
                        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");


                        Thread.sleep(2000);
                        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
                        driver.switchTo().frame(iframe);
                        Thread.sleep(2000);
                        WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
                        WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
                        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));

                        fname.clear();
                        fname.sendKeys("Olexandr");

                        lname.clear();
                        lname.sendKeys("Moroz");

                        submit.click();


                        Thread.sleep(2000);
                        System.out.println(driver.findElements(By.xpath("//p")).get(1).getText());

                        driver.switchTo().window(secondWindowHandle);


                        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Moroz");
                        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Olexandr");
                        driver.findElement(By.xpath("//input[@id='DateOfBirthDay']")).sendKeys("05");
                        driver.findElement(By.xpath("//input[@id='DateOfBirthMonth']")).sendKeys("6");
                        driver.findElement(By.xpath("//input[@id='DateOfBirthYear']")).sendKeys("1975");
                        Select select1= new Select(driver.findElement(By.xpath("//select[@id='Country']")));
                        select1.selectByVisibleText("Ukraine");
                        Thread.sleep(4000);

                        //driver.findElement (By.xpath("//div[@class='controls']/input[@class='input']")).sendKeys("Dnipro");//
                        driver.findElement (By.xpath("//input[@id='State']")).sendKeys("Dnipro");
                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("mail0506@mail.cim");
                        driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']")).sendKeys("mail0506@mail.cim");
                        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567890");
                        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
                        confirmPass.sendKeys("11111111111111");
                        confirmPass.sendKeys(Keys.ENTER);

                        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());

                        driver.switchTo().window(thirdWinHandle);


                        driver.findElement(By.xpath("//button[@id='alertBox']")).click();

                       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
                        Alert alertbox = wait.until(ExpectedConditions.alertIsPresent());
                        alertbox.accept();
                       System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

                        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();

                        Alert confirmbox = wait.until(ExpectedConditions.alertIsPresent());
                        confirmbox.dismiss();

                        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("window.scrollBy(0,200)");
                        Thread.sleep(2000);
                        driver.findElement(By.xpath("//button[@id='promptBox']")).click();


                        Alert promtBox = wait.until(ExpectedConditions.alertIsPresent());
                        promtBox.sendKeys("Final step of this task");

                        promtBox.accept();

                        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

                        Thread.sleep(4000);
        driver.quit();}
}


