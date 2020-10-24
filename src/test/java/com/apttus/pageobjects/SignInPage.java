package com.apttus.pageobjects;

import com.apttus.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    public void enterEmail(WebDriver driver, String s) {
        WebUtil.waitForElementVisible(driver, By.xpath("//input[@id='email']"));
        WebUtil.clearAndFillTextbox(driver, By.xpath("//input[@id='email']"), "jetblue@grr.la");

    }

    public void enterPassword(WebDriver driver, String s) {
        WebUtil.waitForElementVisible(driver, By.xpath("//input[@id='passwd']"));
        WebUtil.clearAndFillTextbox(driver, By.xpath("//input[@id='passwd']"), "jetblue");

    }

    public HomePage clickLogin(WebDriver driver) {
        WebUtil.click(driver, By.xpath("//button[@id='SubmitLogin']"));
        WebUtil.waitForElementVisible(driver, By.xpath("//span[text()='My account']"));

        return PageFactory.initElements(driver, HomePage.class);
    }
}
