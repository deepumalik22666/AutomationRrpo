package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbest.WebTestBase;
import utils.TestUtils;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement searchText;

    @FindBy(xpath = "//button[text()='✕']")
    WebElement closeLogin;

    @FindBy(xpath = "//div[text()='realme']")
    WebElement selectCheckBox;

    @FindBy(xpath = "(//select[@class='_2YxCDZ'])[1]")
    WebElement dropDown;


    @FindBy(xpath = "//div[@class='_3AsjWR']")
    WebElement selectByValue;

    @FindBy(xpath = "//div[text()='Electronics']")
    WebElement electronics;

    @FindBy(xpath = "//a[@class='_6WOcW9 _2-k99T']")
    WebElement audio;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String productName) {
        searchText.sendKeys(productName);
        searchText.sendKeys(Keys.ENTER);
    }

    public void closeLoginWindow() {
        TestUtils.waitUntilElementToBeClick(closeLogin);
    }

    public void selectCheckBox() {
        selectCheckBox.click();
    }

    public void selectByValue(String value) {
        TestUtils.selectDropDownByValue(dropDown, value);
    }

    public void mouseHoverElement() {
        TestUtils.mouseHoverOnElement(electronics);
        TestUtils.waitUntilElementToBeClick(audio);
    }

}