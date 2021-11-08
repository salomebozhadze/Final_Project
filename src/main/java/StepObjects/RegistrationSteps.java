package StepObjects;

import PageObjects.RegistrationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationSteps extends RegistrationPage {

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

    public RegistrationSteps emailInput(String Email){
        sleep(2000);
        checkIfValueExists(emailAddress);
        emailAddress.setValue(Email);
        return this;
    }

    public RegistrationSteps passwordFIeld(String Password) {
        checkIfValueExists(passwordField);
        passwordField.setValue(Password);
        return this;
    }


    public RegistrationSteps repeatPassword(String RepeatPassword) {
        checkIfValueExists(repeatPassword);
        repeatPassword.setValue(RepeatPassword);
        return this;
    }

    public RegistrationSteps mobileField(String Mobile) {
        checkIfValueExists(mobileField);
        mobileField.setValue(Mobile);
        return this;
    }

    public RegistrationSteps clickNext() {
        sleep(3000);
        clickNext.click();
        return this;
    }

    public RegistrationSteps firstName(String FirstName) {
        sleep(3000);
        firstName.setValue(FirstName);
        return this;
    }

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

    public RegistrationSteps dayChoose(Integer birthDay) {
        days_dropdown.click();
        chooseElementFromList(days_selector,birthDay);
        return this;
    }

    public RegistrationSteps monthChoose(Integer birthMonth) {
        month_dropdown.click();
        chooseElementFromList(month_selector,birthMonth);
        return this;
    }

    public RegistrationSteps yearChoose(Integer birthYear) {
        year_dropdown.click();
        chooseElementFromList(year_selector,birthYear);
        return this;
    }



    public RegistrationSteps clickOnNext() {
        clickOnNext.click();
        return this;
    }

    public RegistrationSteps checkBox() {
        checkBox.click();
        return this;
    }

    public RegistrationSteps finishRegistrationButton() {
        finishRegistrationButton.click();
        return this;
    }


    public RegistrationSteps emailError(){
          emailError.shouldHave(Condition.text("Este campo es necesario"));
          return this;

    }

    public RegistrationSteps passwordError(){
        passwordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    public RegistrationSteps repeatPasswordError(){
        repeatPasswordError.shouldHave(Condition.text("Este campo es necesario"));
        return this;

    }

    public RegistrationSteps mobileError(){
        mobileError.shouldHave(Condition.text("Este campo es necesario"));;
        return this;

    }


    public RegistrationSteps clickemail(){
        emailAddress.click();
        return this;
    }

    public RegistrationSteps NameError(){
        nameError.shouldHave(Condition.text("Por favor ingrese su nombre. Solo letras, espacios y  “-“ se permiten"));
        return this;
    }

    public RegistrationSteps surNameError(){
        lastNameError.shouldHave(Condition.text("Por favor ingresa tu apellido. Solamente letras, espacios y “-“ "));
        return this;
    }

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

    public RegistrationSteps dayChoose1(Integer birthDay) {
        days_dropdown1.click();
        chooseElementFromList(days_selector1,birthDay);
        return this;
    }

    public RegistrationSteps monthChoose1(Integer birthMonth) {
        month_dropdown1.click();
        chooseElementFromList(month_selector1,birthMonth);
        return this;
    }

    public RegistrationSteps yearChoose1(Integer birthYear) {
        year_dropdown1.click();
        chooseElementFromList(year_selector1,birthYear);
        return this;
    }

    public RegistrationSteps clickeName(){
        firstName.click();
        return this;
    }

    public  RegistrationSteps checkBoxError(){
        checkBoxError.shouldBe(Condition.enabled);
        return this;
    }

    public RegistrationSteps checkBoxErrorDisable(){
        checkBoxError.shouldNotBe(Condition.visible);
        return this;
    }









}


