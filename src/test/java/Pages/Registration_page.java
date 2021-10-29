package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

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
        return $("#vs1__listbox>li", i );
    }
    public SelenideElement month_dropdown = $("#vs2__combobox");
    public SelenideElement month_selector (int i) {
        return $("#vs2__listbox>li", i);
    }

    public SelenideElement year_dropdown = $("#vs3__combobox");
    public SelenideElement year_selector (int i) {
        return $("#vs3__listbox>li", i);
    }

    public void chooseDay(){


        days_dropdown.click();
        days_selector(rand.nextInt(28));

    }
    public void chooseMonth(){
        month_dropdown.click();
        month_selector(rand.nextInt(11));

    }

    public void chooseYear(){
        year_dropdown.click();
        year_selector(rand.nextInt(82));

    }





}
