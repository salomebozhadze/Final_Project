package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver {

    public  void driver() {

        WebDriverManager.chromedriver().setup();
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=iPhone 6");
        Selenide.open("https://wachawin.preprod.smrtsrc.io/es");
    }
}
