import StepObjects.LoginSteps;
import Utils.chromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
//import  org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


import static DataObjects.LoginData.email;
import static DataObjects.LoginData.password;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Login_wachawin extends chromeRunner {


    @Test (priority=1)
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

    @Test (priority=2)
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


}
