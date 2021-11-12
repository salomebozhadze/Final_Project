package PageObjects;



import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {
    public SelenideElement
            clickOnRegisterButton = $(".button.button--extra-small.header__button", 1),
            emailAddress = $(".input.form__input", 0),
            passwordField = $(".input.form__input", 1),
            repeatPassword = $(".input.form__input", 2),
            mobileField = $(".input.form__input", 3),
            clickNext = $(".button.button--primary.register__button"),
            firstName = $(".input.form__input", 0),
            lastName = $(".input.form__input", 1),
            days_dropdown = $("#vs1__combobox"),
            month_dropdown = $("#vs2__combobox"),
            year_dropdown = $("#vs3__combobox"),
            clickOnNext = $(".button.button--primary.register__button"),
            checkBox = $(".checkbox__buttons-checkmark.checkbox__buttons-checkmark--active", 0),
            finishRegistrationButton = $(".button.button--primary.register__button"),
            emailError = $(".error-message", 0),
            passwordError = $(".error-message", 1),
            repeatPasswordError = $(".error-message", 2),
            mobileError = $(".error-message", 3),
            incorrectEmail = $(".input.form__input", 0),
            days_dropdown1 = $("#vs4__combobox"),
            month_dropdown1 = $("#vs5__combobox"),
            year_dropdown1 = $("#vs6__combobox"),
            nameError = $(".error-message", 0),
            lastNameError = $(".error-message", 1),
            dateError = $(".error-message", 2),
            checkBoxError = $(".checkbox__buttons-box.checkbox__buttons-box--error"),
            welcomeButton = $(".button.button--primary.welcome-modal__button"),
            myAccountButton = $(By.cssSelector(".header__logged-in>a")),
            logOutButton = $(".details__logout");


    public ElementsCollection days_selector = $$("#vs1__listbox li"),
            month_selector = $$("#vs2__listbox li"),
            year_selector = $$("#vs3__listbox li"),
            days_selector1 = $$("#vs4__listbox li"),
            month_selector1 = $$("#vs5__listbox li"),
            year_selector1 = $$("#vs6__listbox li");


}
