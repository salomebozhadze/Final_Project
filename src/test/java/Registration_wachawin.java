import Chrome.chromeRunner;
import Pages.Registration_page;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Registration_wachawin extends chromeRunner {
    Registration_page registration_page = new Registration_page();


    public void ClickOnRegisterButton() {

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

    public void ClickNext() {
        $(".button.button--primary.register__button").click();
        sleep(3000);
    }

    public void CheckBox(){
        $(".checkbox__buttons-checkmark.checkbox__buttons-checkmark--active", 0).click();
    }

    public void FinishButton(){
        $(".button.button--primary.register__button").click();

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
        ClickNext();
        CheckBox();
        FinishButton();
        sleep(5000);

        Assert.assertTrue($(".welcome-modal__content").is(Condition.visible));
        sleep(5000);
        Assert.assertTrue($(".button.button--primary.welcome-modal__button").is(Condition.visible));

    }

    @Test
    public void NegativeCase(){
        ClickOnRegisterButton();
        //email
        $(".input.form__input", 0).sendKeys("test");
        $(".input.form__input", 1).click();
        sleep(5000);
        //$(byText("Por favor ingresa tu email en el formato")).shouldBe(Condition.visible);
        Assert.assertTrue($(byText("Por favor ingresa tu email en el formato")).is(Condition.visible));
        //password
        $(".input.form__input", 1).sendKeys("salome");
        $(".input.form__input", 2).click();
        Assert.assertTrue($(byText("La contraseña debe contener un mínimo de 8 caracteres")).is(Condition.visible));
        //repeat password
        $(".input.form__input", 2).sendKeys("salo");
        $(".input.form__input", 3).click();
        Assert.assertTrue($(byText("Por favor ingresa la misma contraseña ( ) que en el campo \"Contraseña\"")).is(Condition.visible));
        $(".input.form__input", 3).sendKeys("225");
        $(".input.form__input", 1).click();
        Assert.assertTrue($(byText("Por favor ingrese un número válido de 10 dígitos")).is(Condition.visible));
        sleep(5000);


    }
}
