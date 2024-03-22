package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT06_Toyworld {
    @Test
    public void iframeListSelect() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Navigate to HN website
        driver.get("https://www.toyworld.com.au/account/register");
        driver.findElement(By.id("RegisterForm-FirstName")).sendKeys("test");
        driver.findElement(By.id("RegisterForm-LastName")).sendKeys("test");
        driver.findElement(By.id("RegisterForm-email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("RegisterForm-password")).sendKeys("passw0rd");
        driver.findElement(By.id("RegisterForm-confirm-password")).sendKeys("passw0rd");

    driver.findElement(By.xpath("//button[@type='submit']/span[contains(text(),'Create account')]")).click();


    }

}
