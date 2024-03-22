package SeleniumLearning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void Navigation() throws IOException {
        //Chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to website
        driver.get("https://www.harveynorman.com.au/");
        //get title of the page
       String ExpectedTitle= driver.getTitle();
        System.out.println("ExpectedTitle : "+ ExpectedTitle);
        String ActualTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion version-2
        Assert.assertTrue(ExpectedTitle.contains("Electrical"));
        //screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\capture-1.jpeg"));

    }
}
