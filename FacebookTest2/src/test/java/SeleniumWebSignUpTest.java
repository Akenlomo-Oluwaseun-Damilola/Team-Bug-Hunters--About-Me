import org.apache.commons.lang3.ThreadUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumWebSignUpTest {
    //import the selenium driver
    private ChromeDriver driver;

    @BeforeTest
    public void positiveSignup() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webDriver.chrome.driver", "resources/chrome-win32");
        //1.Open your Chrome browser
        driver = new ChromeDriver();
        //2.Input your Selenium Demo Page URL(https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com/");
        Thread.sleep(10000);

        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. Click on Signup button to open the Signup page
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        //5.Input to your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Oakenlomo");
        //6. Locate the email address field and Input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("oakenlomo@gmail.com");
        //7. Locate the password field and Input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("admin");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(10000);

        //9. Click on User1 item on the listPage
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/a")).click();
        //10. Search for an item using (Python/selenium) and confirm it is present.
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/a")).click();
        //11. Click Logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        //quit test
        driver.quit();
    }
}

