package HW8;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;



   public class Task1 {




       private final WebDriver driver;

       public Task1(WebDriver driver) {
           this.driver = driver;
       }


       private static long EXPLICITY_WAIT=20L;

        private FluentWait<WebDriver> fluentWait(Long duration){
            return new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(duration))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(ElementNotInteractableException.class)
                    .ignoring(InvalidElementStateException.class)
                    .ignoring(StaleElementReferenceException.class);
        }
        private void waitForFunction(Function function, Long timeout){
            FluentWait<WebDriver> wait = fluentWait(timeout);
            wait.until(function);
        }

       public WebElement presenceOfElementLocated(By locator) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(locator));
        }

        public WebElement presenceOfElementLocated(String locator) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        }

        public WebElement presenceOfElementLocated(By by, String value) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by.xpath(""),value));
        }

        public WebElement presenceOfElementLocated(String by, String value) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by.(""), value));
        }

        public void textToBePresentInElementValue(WebElement element, String text) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.textToBePresentInElementValue(element, text));
        }

        public void invisibilityOf(WebElement element) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.invisibilityOf(element));
        }

        public void titleContains(String title) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.titleContains(title));
        }

        public void titleIs(String title) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.titleIs(title));
        }

        public void elementToBeClickable(WebElement element) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeClickable(element));
        }

        public void elementToBeClickable(By by) {
            waitForFunction(ExpectedConditions.elementToBeClickable(by),EXPLICITY_WAIT);
        }

        public void elementToBeClickable(String locator) {
            waitForFunction(ExpectedConditions.elementToBeClickable(By.xpath(locator)), EXPLICITY_WAIT);
        }

        public void elementToBeSelected(WebElement element) {
            waitForFunction(ExpectedConditions.elementToBeSelected(element),EXPLICITY_WAIT );
        }

        public void elementToBeSelected(By by) {

            waitForFunction(ExpectedConditions.elementToBeSelected(by), EXPLICITY_WAIT);
        }

        public void elementToBeSelected(String locator) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeSelected(By.xpath(locator)));
        }

        public void elementSelectionStateToBe(WebElement element, boolean selected) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementSelectionStateToBe(element, selected));
        }

        public void elementSelectionStateToBe(By by, boolean selected) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementSelectionStateToBe(by, selected));
        }

        public void elementSelectionStateToBe(String locator, boolean selected) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementSelectionStateToBe(By.xpath(locator), selected));
        }

        public WebElement visibilityOfElementLocated(By locator) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        public WebElement visibilityOfElementLocated(String locator) {
            return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        }

        public void frameToBeAvailableAndSwitchToIt(By locator) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
        }

        public void frameToBeAvailableAndSwitchToIt(String locator) {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(locator)));
        }

        public void alertIsPresent() {
            fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.alertIsPresent());
        }


    }
