package com.apttus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    public void enterEmail(WebDriver driver, String s) {

        WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='email']"));
        emailTextbox.clear();
        emailTextbox.sendKeys(s);
    }

    public void enterPassword(WebDriver driver, String s) {
        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordTextbox.clear();
        passwordTextbox.sendKeys(s);
    }

    public HomePage clickLogin(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My account']")));

        return PageFactory.initElements(driver, HomePage.class);
    }
}
