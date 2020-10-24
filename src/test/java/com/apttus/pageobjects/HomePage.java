package com.apttus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public TshirtCatPage clickCatTshirts(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a[@title='T-shirts']")));
        WebElement tshirtLabel = driver.findElement(By.xpath("//div/ul/li/a[@title='T-shirts']"));
        tshirtLabel.click();

        return PageFactory.initElements(driver, TshirtCatPage.class);
    }

    public boolean myAccountLabelExist(WebDriver driver) {
        return driver.findElements(By.xpath("//span[text()='My account']")).size()>0;
    }
}
