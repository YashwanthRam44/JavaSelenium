package SeleniumLearning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {
    @Test
    public void LocatorsSelenium() throws InterruptedException {
        //Chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to website
        driver.get("https://www.harveynorman.com.au/customer/account/create/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //By ID
        driver.findElement(By.id("firstname")).sendKeys("Yash");
        //By Name
        driver.findElement(By.name("lastname")).sendKeys("testers");
        Thread.sleep(5000);
        //By linktext
        driver.findElement(By.linkText("Catalogues")).click();
        //partial linktext
        driver.findElement(By.partialLinkText("Catalog")).click();

    }
}
