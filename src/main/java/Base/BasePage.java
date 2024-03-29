package Base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Browser;

import java.util.Random;

public class BasePage {
    protected static void goToPage(String url) {
        Browser.getDriver().get(url);
    }

    protected static void clickOnWebElement(By locator) {
        Browser.getDriver().findElement(locator).click();
    }

    protected static void typeInWebElement(By locator, String text) {
        Browser.getDriver().findElement(locator).sendKeys(text);
    }

    protected static void verifyWebElementIsPresent(By locator) {
        Assert.assertTrue(Browser.getDriver().findElement(locator).isDisplayed());
    }
}
