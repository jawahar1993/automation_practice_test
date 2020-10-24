package com.apttus.util;

import com.apttus.pageobjects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebUtil {
    public static LandingPage goTolandingPage(WebDriver driver) {
        driver.get("http://Automationpractice.com");
        return PageFactory.initElements(driver, LandingPage.class);
    }
}
