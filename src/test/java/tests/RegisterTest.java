package tests;

import HomePage.RegisterPage;
import HomePage.SuccessPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void AccountTest() {
        RegisterPage.goToPage();
        RegisterPage.clickToMyAccount();
        RegisterPage.clickToRegisterButton();
        RegisterPage.writeIntoFirstnameInputField("Maria");
        RegisterPage.writeIntoLastnameInputField("Atanasova");
        String prefix = RandomStringUtils.randomAlphabetic(5);
        String sufix = RandomStringUtils.randomAlphabetic(3);
        String randomEmail = prefix + "@" + sufix + ".com";
        RegisterPage.writeIntoEmailInputField(randomEmail);
        String randomPhone = RandomStringUtils.randomNumeric(9);
        RegisterPage.writeIntoPhoneInputField(randomPhone);
        RegisterPage.writeIntoPasswordInputField("Parola789");
        RegisterPage.writeIntoConfirmInputField("Parola789");
        RegisterPage.clickOnRadioButton();
        RegisterPage.clickOnCheckboxField();
        RegisterPage.clickOnContinueButton();
        SuccessPage.verifySuccessPageText();
    }
}

