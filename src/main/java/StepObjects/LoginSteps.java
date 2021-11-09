package StepObjects;

import PageObjects.LoginPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class LoginSteps extends LoginPage {
    public LoginSteps LoginButton(){
        sleep(5000);
        LoginButton.click();
        return this;
    }

    public LoginSteps emailInput(String email){
        emailInput.setValue(email).shouldBe(Condition.visible);
        return  this;
    }

    public LoginSteps passwordInput(String Password){
        passwordInput.setValue(Password).shouldBe(Condition.visible);
        return this;
    }

    public LoginSteps clickLoginButton(){
        sleep(3000);
        loginButton.click();

        return this;
    }

    public LoginSteps myAccountClick(){
        sleep(3000);
        myAccount.click();
        return this;
    }

    public LoginSteps logOutClick(){
        sleep(3000);
        logOut.click();
        return this;
    }

    public LoginSteps rememberMeClick(){
        rememberMe.click();
        return this;
    }

    public LoginSteps emailErrorEmpty(){
        sleep(3000);
        emailError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    public LoginSteps passwordErrorEmpty(){
        passwordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }
}
