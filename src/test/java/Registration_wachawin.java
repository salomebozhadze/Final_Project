import Pages.Registration_page;
import Pages.WebDriver;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Registration_wachawin {
    Registration_page registration_page = new Registration_page();
    WebDriver webDriver = new WebDriver();

    public void ClickOnRegisterButton() {
        webDriver.driver();
        registration_page.registerButton().click();
    }


    public void EnterEmail() {
        registration_page.input(0).sendKeys(RandomStringUtils.randomAlphanumeric(5) + "@gmail.com");
    }


    public void EnterPassword() {
        registration_page.input(1).sendKeys("salome1989");
    }


    public void RepeatPassword() {
        registration_page.input(2).sendKeys("salome1989");
    }


    public void EnterMobile() {
        registration_page.input(3).sendKeys(RandomStringUtils.randomNumeric(10));
    }


    public void ClickOnNext() {
        $(".button.button--primary.register__button").click();
        sleep(3000);
    }

    public void InputName() {
        registration_page.input(0).sendKeys(RandomStringUtils.randomAlphanumeric(6));
    }

    public void InputSurname() {
        registration_page.input(1).sendKeys(RandomStringUtils.randomAlphanumeric(3));
    }

    @Test
    public void PositiveCase() {
        ClickOnRegisterButton();
        EnterEmail();
        EnterPassword();
        RepeatPassword();
        EnterMobile();
        ClickOnNext();
        InputName();
        InputSurname();


        registration_page.chooseDay();
        registration_page.chooseMonth();
        registration_page.chooseYear();



    }
}
