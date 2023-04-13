package utils;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testbest.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class TestUtils extends WebTestBase {

    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD_WAIT = 20;
    public static final long EXPLICIT_WAIT = 20;
    public static Select select;

    public static void waitUntilElementToBeClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }


    public static void selectDropDownByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }

    public static void mouseHoverOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}


