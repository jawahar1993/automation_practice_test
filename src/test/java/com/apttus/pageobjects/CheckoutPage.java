package com.apttus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    public void clickCheckoutButton(WebDriver driver) {
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        proceedToCheckoutButton.click();
    }
}
