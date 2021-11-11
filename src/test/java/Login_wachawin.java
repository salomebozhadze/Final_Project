import StepObjects.LoginSteps;
import Utils.Retry;
import Utils.chromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
//import  org.junit.Test;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static DataObjects.LoginData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


@Listeners(Utils.TestLister.class)
public class Login_wachawin extends chromeRunner {


    @Test (priority=1, retryAnalyzer = Retry.class)
    @Description("Success Login When RememberMe is checked")
    public void AutoLogin(){
        LoginSteps steps = new LoginSteps();

        steps
                .LoginButton()
                .emailInput(email)
                .passwordInput(password)
                .clickLoginButton();

        sleep(5000);
        Assert.assertTrue($(".header__button.header__deposit-btn").is(Condition.appear));

        steps
                .myAccountClick()
                .logOutClick();




    }

    @Test (priority=2, retryAnalyzer = Retry.class)
    @Description ("Success Login When RememberMe is not checked")
    public void Login(){
        LoginSteps steps = new LoginSteps();

        steps
                .LoginButton()
                .rememberMeClick()
                .clickLoginButton();

        sleep(5000);
        Assert.assertTrue($(".header__button.header__deposit-btn").is(Condition.appear));

        steps
                .myAccountClick()
                .logOutClick()
                .LoginButton()
                .clickLoginButton()
                .emailErrorEmpty()
                .passwordErrorEmpty();



    }

    @Test (priority=3, retryAnalyzer = Retry.class)
    @Description ("Check errors when Data is incorrect")
    public void loginErrorsCheck(){
        LoginSteps steps = new LoginSteps();

        steps
                .incEmailError(incEmail)
                .incPasswordError(incPassword);
        sleep(3000);
        Assert.assertTrue($(byText("Por favor ingresa tu email en el formato")).is(Condition.visible));

        steps
                .correctEmail(email)
                .clickLoginButton();

        sleep(3000);
        Assert.assertTrue($(byText("La contraseña no coincide intentar nuevamente")).is(Condition.visible));



    }


}
