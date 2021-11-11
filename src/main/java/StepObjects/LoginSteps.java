package StepObjects;

import PageObjects.LoginPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginSteps extends LoginPage {

    @Step("Click at Login Button")
    public LoginSteps LoginButton() {
        sleep(5000);
        LoginButton.click();
        return this;
    }

    @Step("Fill Email Input, Value: {0}")
    public LoginSteps emailInput(String email) {
        emailInput.setValue(email).shouldBe(Condition.visible);
        return this;
    }

    @Step("Fill Password Input, Value: {0}")
    public LoginSteps passwordInput(String Password) {
        passwordInput.setValue(Password).shouldBe(Condition.visible);
        return this;
    }

    @Step("Click Continue Button")
    public LoginSteps clickLoginButton() {
        sleep(3000);
        loginButton.click();
        return this;
    }

    @Step("Click My account Button")
    public LoginSteps myAccountClick() {
        sleep(3000);
        myAccount.click();
        return this;
    }

    @Step("Click Logout Button")
    public LoginSteps logOutClick() {
        sleep(3000);
        logOut.click();
        return this;
    }

    @Step("Click Logout Button")
    public LoginSteps rememberMeClick() {
        rememberMe.click();
        return this;
    }

    @Step("Check Email FIeld must be empty")
    public LoginSteps emailErrorEmpty() {
        sleep(3000);
        emailError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    @Step("Check Password Field must be empty")
    public LoginSteps passwordErrorEmpty() {
        passwordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    @Step("Fill Email Field with incorrect Data")
    public LoginSteps incEmailError(String incEmail) {
        emailInput.setValue(incEmail);
        return this;
    }

    @Step("Fill Password Field with incorrect Data")
    public LoginSteps incPasswordError(String incPassword) {
        passwordInput.setValue(incPassword);
        return this;
    }

    @Step("Fill Email Field with correct Data")
    public LoginSteps correctEmail(String coremail) {
        emailInput.click();
        emailInput.setValue(coremail);
        return this;
    }
}
