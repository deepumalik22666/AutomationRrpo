package testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbest.WebTestBase;

public class HomeTest extends WebTestBase {
    ;
    public HomePage homePage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void searchText() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeLoginWindow();
        homePage.searchProduct(prop.getProperty("searchtext"));
        softAssert.assertEquals("", "", "search The Product  Mobile");
        softAssert.assertAll();
    }

    @Test
    public void verifySelectCheckBox()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeLoginWindow();
        homePage.searchProduct(prop.getProperty("searchtext"));
        homePage.selectCheckBox();
        softAssert.assertEquals("", "", "select Check Box");
        softAssert.assertAll();
    }

    @Test
    public void verifyDropDown() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeLoginWindow();
        homePage.searchProduct(prop.getProperty("searchtext"));
        homePage.selectByValue(prop.getProperty("value"));
        softAssert.assertEquals("", "", "select By value 20000");
        softAssert.assertAll();
    }

    @Test
    public void verifyMouseHover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeLoginWindow();
        homePage.mouseHoverElement();
        softAssert.assertEquals("", "", "MouseHover On Element Audio");
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}

