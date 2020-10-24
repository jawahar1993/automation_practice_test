package com.apttus.pageobjects;

import com.apttus.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecificItemPage {
    public CheckoutPage clickAddToCart(WebDriver driver) {
        WebUtil.click(driver, By.xpath("//span[text()='Add to cart']"));
        WebUtil.waitForElementVisible(driver, By.xpath("//div/h2/i[@class='icon-ok']"));
        WebUtil.waitForElementVisible(driver, By.xpath("//a[@title='Proceed to checkout']"));

        return PageFactory.initElements(driver, CheckoutPage.class);
    }
}
