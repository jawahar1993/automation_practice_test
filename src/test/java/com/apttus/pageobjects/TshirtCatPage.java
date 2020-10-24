package com.apttus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TshirtCatPage {
    public SpecificItemPage clickSpecificItem(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")));
        WebElement itemList = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
        itemList.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add to cart']")));

        return PageFactory.initElements(driver, SpecificItemPage.class);
    }
}
