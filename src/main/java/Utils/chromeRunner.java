package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;


import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class chromeRunner {
    @BeforeTest
    @Description("Configure browser before test")
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browserSize = "750x1340";
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=iPhone 6");
        open("https://wachawin.preprod.smrtsrc.io/es");
    }

    @AfterTest
    @Description("Close browser after tests")
    public static void clear() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }

}
