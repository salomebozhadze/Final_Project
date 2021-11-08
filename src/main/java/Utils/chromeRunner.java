package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class chromeRunner {
    @BeforeTest
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=iPhone 6");
        open("https://wachawin.preprod.smrtsrc.io/es");
    }

    @AfterTest
    public static void clear(){
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }

}
