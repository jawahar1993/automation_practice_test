package com.apttus.util;

import com.apttus.pageobjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {
    final static int wait_time_out = 30;

    public static LandingPage goTolandingPage(WebDriver driver) {
        driver.get("http://Automationpractice.com");
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public static void click(WebDriver driver, By xpath) {
        WebElement element = driver.findElement(xpath);
        element.click();
    }

    public static void clearAndFillTextbox(WebDriver driver, By xpath, String s) {
        WebElement element = driver.findElement(xpath);
        element.clear();
        element.sendKeys(s);
    }

    public static void waitForElementVisible(WebDriver driver, By xpath) {
        WebDriverWait wait = new WebDriverWait(driver, wait_time_out);
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
}
