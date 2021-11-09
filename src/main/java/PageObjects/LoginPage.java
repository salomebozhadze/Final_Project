package PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
                LoginButton = $(".button.button--extra-small.header__button", 0),
                emailInput = $(".input.form__input", 0),
                passwordInput = $(".input.form__input", 1),
                rememberMe = $(".checkbox__buttons-checkmark.checkbox__buttons-checkmark--active"),
                loginButton = $(".button.button--primary.register__button"),
                myAccount = $(By.cssSelector(".header__logged-in>a")),
                logOut = $(".details__logout"),
                emailError = $(".error-message", 0),
                passwordError =  $(".error-message", 1);

}
