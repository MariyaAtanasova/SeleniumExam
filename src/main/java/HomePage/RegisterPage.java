package HomePage;

import Base.BasePage;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    private final static String PAGE_URL = "https://shop.pragmatic.bg";
    private final static By CLICK_ON_MY_ACCOUNT = By.cssSelector("#top-links .dropdown");
    private final static By CLICK_ON_REGISTER = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]");
    private final static By FIRSTNAME_INPUT_FIELD = By.id("input-firstname");
    private final static By LASTNAME_INPUT_FIELD = By.id("input-lastname");
    private final static By EMAIL_INPUT_FIELD = By.id("input-email");
    private final static By TELEPHONE_INPUT_FIELD = By.id("input-telephone");
    private final static By PASSWORD_INPUT_FIELD = By.id("input-password");
    private final static By CONFIRM_INPUT_FIELD = By.id("input-confirm");
    private final static By RADIO_BUTTON = By.cssSelector("[value='0']");
    private final static By CHECKBOX_FIELD = By.name("agree");
    private final static By CONTINUE_BUTTON = By.cssSelector("[value=Continue]");

    public static void goToPage() {
            goToPage(PAGE_URL);
        }

    public static void clickToMyAccount() {
            clickOnWebElement(CLICK_ON_MY_ACCOUNT);
        }

    public static void clickToRegisterButton() {
            clickOnWebElement(CLICK_ON_REGISTER);
        }

    public static void writeIntoFirstnameInputField(String firstname) {
        typeInWebElement(FIRSTNAME_INPUT_FIELD, firstname);
    }

    public static void writeIntoLastnameInputField(String lastname) {
        typeInWebElement(LASTNAME_INPUT_FIELD, lastname);
    }

    public static void writeIntoEmailInputField(String email) {
        typeInWebElement(EMAIL_INPUT_FIELD, email);
    }

    public static void writeIntoPhoneInputField(String telephone) {
        typeInWebElement(TELEPHONE_INPUT_FIELD, telephone);
    }

    public static void writeIntoPasswordInputField(String password) {
        typeInWebElement(PASSWORD_INPUT_FIELD, password);
    }

    public static void writeIntoConfirmInputField(String password) {
        typeInWebElement(CONFIRM_INPUT_FIELD, password);
    }

    public static void clickOnRadioButton() {
        clickOnWebElement(RADIO_BUTTON);
    }

    public static void clickOnCheckboxField() {
        clickOnWebElement(CHECKBOX_FIELD);
    }

    public static void clickOnContinueButton() {
        clickOnWebElement(CONTINUE_BUTTON);
    }
}

