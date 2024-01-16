package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Browser;

public class BaseTest {

    @BeforeMethod
    public void setupDriver() {
        Browser.setup();
    }

    @AfterMethod
    public void teardownDriver() {
        Browser.tearDown();
    }
}
