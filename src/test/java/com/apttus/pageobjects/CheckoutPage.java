package com.apttus.pageobjects;

import com.apttus.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    public void clickCheckoutButton(WebDriver driver) {
        WebUtil.click(driver, By.xpath("//a[@title='Proceed to checkout']"));
    }

    public boolean successMessageLabelExist(WebDriver driver) {
        return driver.findElements(By.xpath("//div/h2[contains(.,'Product successfully added to your shopping cart')]")).size()>0;
    }

    public boolean itemNameExist(WebDriver driver) {
        return driver.findElements(By.xpath("//div/span[text()='Faded Short Sleeve T-shirts']")).size()>0;
    }

    public boolean itemColourSizeExist(WebDriver driver) {
        return driver.findElements(By.xpath("//div/span[text()='Orange, S']")).size()>0;
    }

    public boolean itemQuantityExist(WebDriver driver) {
        return driver.findElements(By.xpath("//div/strong[text()='Quantity'] /following-sibling::span[text()='1']")).size()>0;
    }

    public boolean itemPriceExist(WebDriver driver) {
        return driver.findElements(By.xpath("//div/strong[text()='Total'] /following-sibling::span[text()='$16.51']")).size()>0;
    }
}
