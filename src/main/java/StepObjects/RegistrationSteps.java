package StepObjects;

import PageObjects.RegistrationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationSteps extends RegistrationPage {

    @Step("Click At Registration Button")
    public RegistrationSteps clickOnRegisterButton(){
        sleep(5000);
        clickOnRegisterButton.click();
        return this;
    }


    private void checkIfValueExists(SelenideElement el){
        String value = el.getAttribute("value");
        if(value != null && !value.equals("")){
            el.clear();
        }
    }

    @Step("Fill Email Input, Value: {0}")
    public RegistrationSteps emailInput(String Email){
        sleep(2000);
        checkIfValueExists(emailAddress);
        emailAddress.setValue(Email);
        return this;
    }

    @Step("Fill Password Input, Value: {0}")
    public RegistrationSteps passwordFIeld(String Password) {
        checkIfValueExists(passwordField);
        passwordField.setValue(Password);
        return this;
    }

    @Step("Fill Repeat Password Input, Value: {0}")
    public RegistrationSteps repeatPassword(String RepeatPassword) {
        checkIfValueExists(repeatPassword);
        repeatPassword.setValue(RepeatPassword);
        return this;
    }

    @Step("Fill Mobile Input, Value: {0}")
    public RegistrationSteps mobileField(String Mobile) {
        checkIfValueExists(mobileField);
        mobileField.setValue(Mobile);
        return this;
    }

    @Step("Click At Next Button")
    public RegistrationSteps clickNext() {
        sleep(3000);
        clickNext.click();
        return this;
    }

    @Step("Fill First Name Input, Value: {0}")
    public RegistrationSteps firstName(String FirstName) {
        sleep(3000);
        firstName.setValue(FirstName);
        return this;
    }

    @Step("Fill Last Name Input, Value: {0}")
    public RegistrationSteps lastName(String LastName) {
        lastName.setValue(LastName);
        return this;
    }


    private void chooseElementFromList(ElementsCollection selector, Integer value){
        for(SelenideElement day : selector){
            if(day.has(Condition.text(String.valueOf(value)))){
                day.click();
                break;
            }
        }
    }

    @Step("Choose Day, Value: {0}")
    public RegistrationSteps dayChoose(Integer birthDay) {
        days_dropdown.click();
        chooseElementFromList(days_selector,birthDay);
        return this;
    }

    @Step("Choose Month, Value: {0}")
    public RegistrationSteps monthChoose(Integer birthMonth) {
        month_dropdown.click();
        chooseElementFromList(month_selector,birthMonth);
        return this;
    }

    @Step("Choose Year, Value: {0}")
    public RegistrationSteps yearChoose(Integer birthYear) {
        year_dropdown.click();
        chooseElementFromList(year_selector,birthYear);
        return this;
    }



    @Step("Click At Next Button")
    public RegistrationSteps clickOnNext() {
        clickOnNext.click();
        return this;
    }

    @Step("Check Checkbox Button")
    public RegistrationSteps checkBox() {
        checkBox.click();
        return this;
    }

    @Step("Click At Finish Registration Button")
    public RegistrationSteps finishRegistrationButton() {
        finishRegistrationButton.click();
        return this;
    }

    @Step("Click At Welcome promotion Pop-up Button")
    public RegistrationSteps welcomeButtonClick(){
        welcomeButton.click();
        return this;
    }

    @Step("Click At My Account Button")
    public RegistrationSteps myAccountButtonCLick(){
        myAccountButton.click();
        return this;
    }

    @Step("Click At Logout Button")
    public RegistrationSteps logOutClick(){
        logOutButton.click();
        return this;
    }


    @Step("Check Email empty Field Error")
    public RegistrationSteps emailError(){
          emailError.shouldHave(Condition.text("Este campo es necesario"));
          return this;

    }

    @Step("Check Password empty Field Error")
    public RegistrationSteps passwordError(){
        passwordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    @Step("Check Repeat Password empty Field Error")
    public RegistrationSteps repeatPasswordError(){
        repeatPasswordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    @Step("Check Mobil empty Field Error")
    public RegistrationSteps mobileError(){
        mobileError.shouldHave(Condition.text("Este campo es necesario"));;
        return this;

    }


    @Step("Click at Email Field")
    public RegistrationSteps clickemail(){
        emailAddress.click();
        return this;
    }

    @Step("Check Name Field Error")
    public RegistrationSteps NameError(){
        nameError.shouldHave(Condition.text("Por favor ingrese su nombre. Solo letras, espacios y  “-“ se permiten"));
        return this;
    }

    @Step("Check Surname Field Error")
    public RegistrationSteps surNameError(){
        lastNameError.shouldHave(Condition.text("Por favor ingresa tu apellido. Solamente letras, espacios y “-“ "));
        return this;
    }

    @Step("Check Day of Birth Field Error")
    public RegistrationSteps dateFieldError(){
        dateError.shouldHave(Condition.text("Por favor dinos tu edad. Debes de ser mayor de 18 años para poder jugar."));
        return this;
    }

    private void chooseElementFromList1(ElementsCollection selector, Integer value){
        for(SelenideElement day : selector){
            if(day.has(Condition.text(String.valueOf(value)))){
                day.click();
                break;
            }
        }
    }

    @Step("Choose Day, Value: {0}")
    public RegistrationSteps dayChoose1(Integer birthDay) {
        days_dropdown1.click();
        chooseElementFromList(days_selector1,birthDay);
        return this;
    }

    @Step("Choose Month, Value: {0}")
    public RegistrationSteps monthChoose1(Integer birthMonth) {
        month_dropdown1.click();
        chooseElementFromList(month_selector1,birthMonth);
        return this;
    }

    @Step("Choose Year, Value: {0}")
    public RegistrationSteps yearChoose1(Integer birthYear) {
        year_dropdown1.click();
        chooseElementFromList(year_selector1,birthYear);
        return this;
    }

    @Step("Click at First Name Field")
    public RegistrationSteps clickeName(){
        firstName.click();
        return this;
    }

    @Step("Check Checkbox Error")
    public  RegistrationSteps checkBoxError(){
        checkBoxError.shouldBe(Condition.enabled);
        return this;
    }

    @Step("Check Checkbox Error is Disappear")
    public RegistrationSteps checkBoxErrorDisable(){
        checkBoxError.shouldNotBe(Condition.visible);
        return this;
    }









}


