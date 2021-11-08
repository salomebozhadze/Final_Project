import StepObjects.RegistrationSteps;
import Utils.chromeRunner;
import com.codeborne.selenide.Condition;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static DataObjects.RegistrationData.*;



public class Registration_wachawin extends chromeRunner{

    @Test
    public void PositiveCase() {
        RegistrationSteps steps = new RegistrationSteps();

        steps
                .clickOnRegisterButton()
                .emailInput(emailAddress)
                .passwordFIeld(passwordField)
                .repeatPassword(repeatPassword)
                .mobileField(mobileField)
                .clickNext()
                .firstName(firstName)
                .lastName(lastName)
                .dayChoose(birthDay)
                .monthChoose(birthMonth)
                .yearChoose(birthYear)
                .clickOnNext()
                .checkBox()
                .finishRegistrationButton();

        sleep(5000);
        Assert.assertTrue($(".welcome-modal__content").is(Condition.visible));
        sleep(5000);
        Assert.assertTrue($(".button.button--primary.welcome-modal__button").is(Condition.visible));

    }

    @Test
    public void NegativeCase(){
        RegistrationSteps steps = new RegistrationSteps();


        steps
                .clickOnRegisterButton()
                .clickNext()
                .emailError()
                .passwordError()
                .repeatPasswordError()
                .mobileError()
                .emailInput(incorrectEmail)
                .passwordFIeld(incorrectPassword)
                .repeatPassword(incorrectRepeatPassword)
                .mobileField(incorrectMobile)
                .clickNext();

        Assert.assertTrue($(byText("Por favor ingresa tu email en el formato")).is(Condition.visible));
        Assert.assertTrue($(byText("La contraseña debe contener un mínimo de 8 caracteres")).is(Condition.visible));
        Assert.assertTrue($(byText("Por favor ingresa la misma contraseña ( ) que en el campo \"Contraseña\"")).is(Condition.visible));
        Assert.assertTrue($(byText("Por favor ingrese un número válido de 10 dígitos")).is(Condition.visible));

        steps
                .emailInput(emailAddress)
                .passwordFIeld(passwordField)
                .repeatPassword(repeatPassword)
                .mobileField(mobileField)
                .clickemail()
                .clickNext();

        Assert.assertTrue($(byText("Por favor ingresa tu email en el formato")).is(Condition.not(Condition.visible)));
        Assert.assertTrue($(byText("La contraseña debe contener un mínimo de 8 caracteres")).is(Condition.not(Condition.visible)));
        Assert.assertTrue($(byText("Por favor ingresa la misma contraseña ( ) que en el campo \"Contraseña\"")).is(Condition.not(Condition.visible)));
        Assert.assertTrue($(byText("Por favor ingrese un número válido de 10 dígitos")).is(Condition.not(Condition.visible)));

        steps
                .clickNext()
                .NameError()
                .surNameError()
                .dateFieldError()
                .firstName(firstName)
                .lastName(lastName)
                .dayChoose1(birthDay)
                .monthChoose1(birthMonth)
                .yearChoose1(birthYear)
                .clickeName()
                .clickOnNext()
                .finishRegistrationButton()
                .checkBoxError()
                .checkBox()
                .checkBoxErrorDisable();


        Assert.assertTrue($(byText("Por favor ingrese su nombre. Solo letras, espacios y  “-“ se permiten")).is(Condition.not(Condition.visible)));
        Assert.assertTrue($(byText("Por favor ingrese su nombre. Solo letras, espacios y  “-“ ")).is(Condition.not(Condition.visible)));
        Assert.assertTrue($(byText("Por favor dinos tu edad. Debes de ser mayor de 18 años para poder jugar.")).is(Condition.not(Condition.visible)));

}

}
