
/***
 * - Visit the URL Konga
 * - Sign in to Konga Successfully
 * - From the Categories, click on the “Computers and Accessories”
 * - Click on the Laptop SubCategory
 * - Click on the Apple MacBooks
 * - Add an item to the cart
 * - Select Address
 * - Continue to make payment
 * - Select a Card Payment Method
 * - Input invalid card details
 * - Print Out the error message: Invalid card number
 * - Close the iFrame that displays the input card Modal
 * - Quit the browser.
 */
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class kongaProjectTest2 {
    //import the Webdriver
    private WebDriver driver;
    @Test
    public void SETUP()throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Team-Bug-Hunters--About-Me\\KongaProject\\resources\\chromedriver.exe");

        //Step1:Open chrome browser
        driver = new ChromeDriver();

        //input konga url( https://www.konga.com/)
        driver.get("https://www.konga.com/");
        Thread.sleep(10000);

        //3. Maximize the browser
        driver.manage().window().maximize();

        //Step2: Login to konga successfully
        //click on login button to open login page
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div[4]/a")).click();
        Thread.sleep(10000);

        //Step3;input email address on the email/Username/Phone number field
        driver.findElement(By.id("username")).sendKeys("oakenlomo@gmail.com");
        Thread.sleep(5000);

        //Step4; input password on the password field
        driver.findElement(By.id("password")).sendKeys("Dmax0266");
        Thread.sleep(5000);

        //step5; click login button to login successfully
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);

        //Step 6: From the Categories, click on the “Computers and Accessories”
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
        Thread.sleep(5000);

        //Step 7: Click on the Laptop SubCategory
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/div/section/div[2]/div[2]/ul/li[3]/a")).click();
        Thread.sleep(5000);

        //Step 8: Click on the Apple MacBooks
        By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label/span").findElement(driver).click();
        Thread.sleep(5000);

        //Step 9:Add an item to the cart
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/section/section/ul/li[20]/article/div[2]/form/div[2]/button")).click();
        Thread.sleep(10000);

        //Step 10; view Cart
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/a[3]")).click();
        Thread.sleep(10000);

        //Step 11; proceed to checkout
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(5000);

        //Step 12; change address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(5000);

        //Step 13; Select Address
        By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button").findElement(driver).click();

        //Step 14; click address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div[1]/form/button")).click();
        //Thread.sleep(10000);

        //Step 15; Click use this address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
        Thread.sleep(10000);

        //Step 16; click delivery option
        driver.findElement(By.id("checkbox")).click();
        Thread.sleep(10000);

        //Step 18;Continue to make payment by clicking paynow
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        Thread.sleep(10000);

        //Step 19:Click continue to make payment
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
        Thread.sleep(10000);

        //step 20;click make payment using card
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/div/div[2]/div/div[2]/button")).click();
        Thread.sleep(10000);

        //step 21;input wrong card details
        //input invalid card number id="card-number"
        driver.findElement(By.id("card-number")).sendKeys("1232356789987");
        Thread.sleep(10000);

        //Step 22;Print out error message for invalid card number
        WebElement errorMsg = driver.findElement(By.id("card-number-unhappy"));
        System.out.println("Error Message: " + errorMsg.getText());
        Thread.sleep(10000);

        //input invalid card date
        //driver.findElement(By.id("expiry")).sendKeys("23/7");
        //Thread.sleep(10000);

        //input invalid cvv
        //driver.findElement(By.id("cvv")).sendKeys("234");
        //input invalid pin
        //driver.findElement(By.id("card-pin-new")).sendKeys("123496");
        //click pay now validateCardForm
        //driver.findElement(By.id("validateCardForm")).click();
        //Thread.sleep(10000);

        // Step 23: close iframe
        driver.findElement(By.xpath("//*[@id=\"kpg-frame-component\"]")).click();
        driver.switchTo().defaultContent();
    }
    @AfterTest
    public void closeBrowser() {
        //Quit
        driver.quit();
    }
}