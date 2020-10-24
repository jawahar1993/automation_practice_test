package com.apttus.pageobjects;

import com.apttus.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    public SignInPage clickSignIn(WebDriver driver) {
        WebUtil.waitForElementVisible(driver, By.xpath("//a[@class='login']"));
        WebUtil.click(driver, By.xpath("//a[@class='login']"));

        return PageFactory.initElements(driver, SignInPage.class);
    }
}
