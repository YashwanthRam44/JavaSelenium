package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


    public class AT07_NavigateBackFront {
        @Test
        public void NavToFro() throws InterruptedException {
            //setting up chromedriver
            WebDriverManager.chromedriver().setup();
            //options
            ChromeOptions chromeOptions = new ChromeOptions();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver(chromeOptions);
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            //Navigate to HN website
            driver.get("https://echoecho.com/");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            //click on Tutorials
            driver.findElement(By.xpath("//td/a[contains(text(),'Tutorials')]")).click();
            Thread.sleep(5000);
            //back --it will come to homepage
            driver.navigate().back();
            Thread.sleep(5000);
            //homepage refresh
            driver.navigate().refresh();
            Thread.sleep(5000);
            //forward
            driver.navigate().forward();
        }
}
