package com.apttus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecificItemPage {
    public CheckoutPage clickAddToCart(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to cart']"));
        addToCartButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h2/i[@class='icon-ok']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));

        return PageFactory.initElements(driver, CheckoutPage.class);
    }
}
