package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WithdrawPage {
    public SelenideElement
            LoginButton = $(".button.button--extra-small.header__button.login-btn"),
            emailInput = $(".input.form__input", 0),
            passwordInput = $(".input.form__input", 1),
            rememberMe = $(".checkbox__buttons-checkmark.checkbox__buttons-checkmark--active"),
            loginButton = $(".button.button--primary.register__button"),
            burgerMenu = $(".burger-menu-icon"),
            withdrawIcon = $(".navigation__item-text", 7),
            mexpagoWallet = $(".withdraw__card"),
            amountField = $(".input.form__input.form__input-amount-input"),
            withdrawMethod = $(".vs__selected-options"),
            cuentaMethod = $("#vs1__listbox li"),
            cuentaMethod1 = $("#vs4__listbox li"),
            cuentaAccount = $(".input.form__input.custom-input-withdraw"),
            withdrawButton = $x("//div[@class='withdraw__payment']/button"),
            sportButton = $(".button.button--primary.withdrawSuccess__button.nuxt-link-active"),
            amountEmptyError = $(".error-message", 0),
            emptyCardError = $(".error-message", 1),
            closeIcon = $(".modal__close"),
            WithdrawButtonXpath = $(By.xpath("//button[contains(text(),'Retiro')]"));
}

