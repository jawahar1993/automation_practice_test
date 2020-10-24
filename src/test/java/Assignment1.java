import com.apttus.pageobjects.*;
import com.apttus.util.WebUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
    public WebDriver driver;

    @Before
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thoughtpooladmin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void automationPracticeA1(){
        //1. Login to http://Automationpractice.com
        LandingPage landingPage = WebUtil.goTolandingPage(driver);

        //2. Click on Sign In button to enter the credentials
        WebDriverWait wait = new WebDriverWait(driver, 30);
        SignInPage signInPage = landingPage.clickSignIn(driver);

        //3. Enter email
        signInPage.enterEmail(driver,"jetblue@grr.la");

        //4. Enter password
        signInPage.enterPassword(driver, "jetblue");

        //5. Click Sign in
        HomePage homePage = signInPage.clickLogin(driver);

        //6. Verify that user signed in
        Assert.assertTrue(driver.findElements(By.xpath("//span[text()='My account']")).size()>0);

        //7. Select the category as T-Shirts
        TshirtCatPage tshirtCatPage = homePage.clickCatTshirts(driver);

        //8. Select the Faded short sleeve T-Shirts
        SpecificItemPage specificItemPage = tshirtCatPage.clickSpecificItem(driver);

        //9. Click on add to cart
        CheckoutPage checkoutPage = specificItemPage.clickAddToCart(driver);

        //10. Assert the message
        Assert.assertTrue(driver.findElements(By.xpath("//div/h2[contains(.,'Product successfully added to your shopping cart')]")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/span[text()='Faded Short Sleeve T-shirts']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/span[text()='Orange, S']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/strong[text()='Quantity'] /following-sibling::span[text()='1']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/strong[text()='Total'] /following-sibling::span[text()='$16.51']")).size()>0);

        //11. Click on proceed to checkout
        checkoutPage.clickCheckoutButton(driver);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
