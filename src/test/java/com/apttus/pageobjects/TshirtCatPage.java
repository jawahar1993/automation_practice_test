package com.apttus.pageobjects;

import com.apttus.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TshirtCatPage {
    public SpecificItemPage clickSpecificItem(WebDriver driver) {
        WebUtil.waitForElementVisible(driver, By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
        WebUtil.click(driver, By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
        WebUtil.waitForElementVisible(driver, By.xpath("//span[text()='Add to cart']"));

        return PageFactory.initElements(driver, SpecificItemPage.class);
    }
}
