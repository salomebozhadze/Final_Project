package StepObjects;

import PageObjects.WithdrawPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;


public class WithdrawSteps extends WithdrawPage {


    @Step("Click at Login Button")
    public WithdrawSteps LoginButton() {
        sleep(5000);
        LoginButton.click();
        return this;
    }

    @Step("Fill Email Input, Value: {0}")
    public WithdrawSteps emailInput(String email) {
        emailInput.setValue(email).shouldBe(Condition.visible);
        return this;
    }

    @Step("Fill Password Input, Value: {0}")
    public WithdrawSteps passwordInput(String Password) {
        passwordInput.setValue(Password).shouldBe(Condition.visible);
        return this;
    }

    @Step("Click Remember me Button")
    public WithdrawSteps rememberMeClick() {
        rememberMe.click();
        return this;
    }


    @Step("Click Continue Button")
    public WithdrawSteps clickLoginButton() {
        sleep(3000);
        loginButton.click();
        return this;
    }

    @Step("Click at Burger Menu Icon")
    public WithdrawSteps clickBurgerMenu() {
        sleep(5000);
        burgerMenu.click();
        return this;
    }

    @Step("Click at Withdraw Icon")
    public WithdrawSteps clickWithdrawIcon() {
        sleep(5000);
        withdrawIcon.click();
        return this;
    }

    @Step("Choose Withdraw Method")
    public WithdrawSteps chooseWithdrawMethod() {
        mexpagoWallet.click();
        return this;
    }

    @Step("Fill Amount Field")
    public WithdrawSteps fillAmountField(String amount) {
        amountField.setValue(amount);
        return this;
    }

    @Step("Choose cuenta card")
    public WithdrawSteps chooseWithdrawCard() {
        sleep(5000);
        withdrawMethod.click();
        cuentaMethod.click();
        return this;
    }

    @Step("Choose cuenta card after error")
    public WithdrawSteps chooseWithdrawCard1() {
        sleep(5000);
        withdrawMethod.click();
        cuentaMethod1.click();
        return this;
    }

    @Step("Choose cuenta card")
    public WithdrawSteps fillCuentaAccount(String account) {
        sleep(5000);
        cuentaAccount.sendKeys(account);
        return this;
    }

    public WithdrawSteps clickSportButton() {
        sleep(3000);
        sportButton.click();
        return this;
    }

    @Step("Click at account field")
    public WithdrawSteps clickAccountField() {
        sleep(5000);
        cuentaAccount.click();
        return this;
    }

    @Step("Click Withdraw Button")
    public WithdrawSteps withdrawButtonClick() {
        sleep(5000);
        withdrawButton.click();
        return this;
    }

    @Step("Empty Amount Field Error")
    public WithdrawSteps emptyAmountField() {
        amountEmptyError.shouldHave(Condition.text("Este campo es necesario"));
        return this;
    }

    @Step("Empty Card Field Error")
    public WithdrawSteps emptyCardField() {
        emptyCardError.shouldHave(Condition.text("Este campo es necesario"));
        return this;
    }

    @Step("Fill Incorrect Amount")
    public WithdrawSteps icorrectAmountFill(String incorrectAmount) {
        sleep(3000);
        amountField.sendKeys(incorrectAmount);
        return this;
    }

    @Step("Fill Incorrect Account")
    public WithdrawSteps icorrectAccountFill(String incorrectAccount) {
        sleep(3000);
        cuentaAccount.sendKeys(incorrectAccount);
        return this;
    }

    @Step("Close success withdraw modal")
    public WithdrawSteps closeIconClick() {
        sleep(3000);
        closeIcon.click();
        return this;
    }

    @Step("Click ar amount field")
    public WithdrawSteps amounfieldclick() {
        sleep(3000);
        amountField.click();
        return this;
    }

    @Step("Click Withdraw Button")
    public WithdrawSteps withdrawButtonClickByXpath() {
        sleep(5000);
        WithdrawButtonXpath.click();
        return this;
    }


}
