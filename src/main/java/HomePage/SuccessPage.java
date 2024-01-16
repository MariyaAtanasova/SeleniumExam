package HomePage;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SuccessPage extends BasePage {

    private final static By SUCCESS_PAGE_TEXT = By.cssSelector("#content h1");

    public static void verifySuccessPageText() {
        verifyWebElementIsPresent(SUCCESS_PAGE_TEXT);
    }
}

