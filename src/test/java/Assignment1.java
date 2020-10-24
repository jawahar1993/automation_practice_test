import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
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
        driver.get("http://Automationpractice.com");

        //2. Click on Sign In button to enter the credentials
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='login']")));
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='login']"));
        signInButton.click();

        //3. Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='email']"));
        emailTextbox.clear();
        emailTextbox.sendKeys("jetblue@grr.la");

        //4. Enter password
        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordTextbox.clear();
        passwordTextbox.sendKeys("jetblue");

        //5. Click Sign in
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        loginButton.click();

        //6. Verify that user signed in
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My account']")));
        Assert.assertTrue(driver.findElements(By.xpath("//span[text()='My account']")).size()>0);

        //7. Select the category as T-Shirts
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a[@title='T-shirts']")));
        WebElement tshirtLabel = driver.findElement(By.xpath("//div/ul/li/a[@title='T-shirts']"));
        tshirtLabel.click();

        //8. Select the Faded short sleeve T-Shirts
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")));
        WebElement itemList = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
        itemList.click();

        //9. Click on add to cart
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add to cart']")));
        WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to cart']"));
        addToCartButton.click();

        //10. Assert the message
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h2/i[@class='icon-ok']")));
        Assert.assertTrue(driver.findElements(By.xpath("//div/h2[contains(.,'Product successfully added to your shopping cart')]")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/span[text()='Faded Short Sleeve T-shirts']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/span[text()='Orange, S']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/strong[text()='Quantity'] /following-sibling::span[text()='1']")).size()>0);
        Assert.assertTrue(driver.findElements(By.xpath("//div/strong[text()='Total'] /following-sibling::span[text()='$16.51']")).size()>0);

        //11. Click on proceed to checkout
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        proceedToCheckoutButton.click();

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
