package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class Registration_page {
    public final Random rand = new Random();

    public SelenideElement registerButton(){
        return $(".button.button--extra-small.header__button", 1);
    }

    public SelenideElement input(int i) {
        return $(".input.form__input", i);


    }
    public SelenideElement days_dropdown = $("#vs1__combobox");
    public SelenideElement days_selector(int i){
        return $("#vs1__listbox li", i );
    }
    public SelenideElement month_dropdown = $("#vs2__combobox");
    public SelenideElement month_selector (int i) {
        return $("#vs2__listbox li", i);
    }

    public SelenideElement year_dropdown = $("#vs3__combobox");
    public SelenideElement year_selector (int i) {
        return $("#vs3__listbox li", i);
    }

    public void chooseDay(){
        days_dropdown.click();
        days_selector(rand.nextInt(28))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }

    public void chooseMonth(){
        month_dropdown.click();
        month_selector(rand.nextInt(11))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }

    public void chooseYear(){
        year_dropdown.click();
        year_selector(rand.nextInt(82))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }

    public SelenideElement days_dropdown1 = $("#vs4__combobox");
    public SelenideElement days_selector1(int i){
        return $("#vs4__listbox li", i );
    }
    public SelenideElement month_dropdown1 = $("#vs5__combobox");
    public SelenideElement month_selector1 (int i) {
        return $("#vs5__listbox li", i);
    }

    public SelenideElement year_dropdown1 = $("#vs6__combobox");
    public SelenideElement year_selector1 (int i) {
        return $("#vs6__listbox li", i);
    }

    public void chooseDay1(){
        days_dropdown1.click();
        days_selector1(rand.nextInt(28))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }

    public void chooseMonth1(){
        month_dropdown1.click();
        month_selector1(rand.nextInt(11))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }

    public void chooseYear1(){
        year_dropdown1.click();
        year_selector1(rand.nextInt(82))
                .shouldBe(Condition.visible,Condition.enabled).click();
    }





}
