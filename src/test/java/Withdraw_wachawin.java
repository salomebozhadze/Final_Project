import StepObjects.WithdrawSteps;
import Utils.Retry;
import Utils.chromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObjects.WithdrawData.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


@Listeners(Utils.TestLister.class)
public class Withdraw_wachawin extends chromeRunner {

    @Test(priority = 1, retryAnalyzer = Retry.class)
    @Description("Success Withdraw Amount")
    public void withdrawAmount() {
        WithdrawSteps steps = new WithdrawSteps();

        steps
                .LoginButton()
                .emailInput(email)
                .passwordInput(password)
                .rememberMeClick()
                .clickLoginButton()
                .clickBurgerMenu()
                .clickWithdrawIcon()
                .chooseWithdrawMethod()
                .fillAmountField(amount)
                .chooseWithdrawCard()
                .fillCuentaAccount(cuentaAccount)
                .withdrawButtonClick();

        sleep(5000);
        Assert.assertTrue($(byText("¡Gracias! Hemos recibido tu petición de retiro, y está siendo revisada por nuestro equipo.")).is(Condition.visible));
        Assert.assertTrue($(".button.button--primary.withdrawSuccess__button.nuxt-link-active").is(Condition.appear));

        steps
                .clickSportButton();


    }

    @Test(priority = 2)
    @Description("Check Withdraw Fields Errors")
    public void withdrawErrors() {
        WithdrawSteps steps = new WithdrawSteps();

        steps
                .clickBurgerMenu()
                .clickWithdrawIcon()
                .chooseWithdrawMethod()
                .withdrawButtonClick()
                .emptyAmountField()
                .emptyCardField()
                .icorrectAmountFill(incorrectAmount)
                .chooseWithdrawCard1()
                .icorrectAccountFill(inccrrectAccount)
                .withdrawButtonClick();

        sleep(5000);
        Assert.assertTrue($(byText("Minimum withdraw limit is")).is(Condition.visible));
        Assert.assertTrue($(byText("Por favor marca e ingresa 7 dígitos")).is(Condition.visible));


    }

}
