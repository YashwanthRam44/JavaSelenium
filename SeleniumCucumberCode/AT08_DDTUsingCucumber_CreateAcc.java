package SeleniumCucumberCode;

import BaseClass.OpenBrowser;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AT08_DDTUsingCucumber_CreateAcc {

    @Test
    public static void EnterAccDtl(String FirstName,String LastName,String EmailAddress){
        OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
        OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(LastName);
        OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(EmailAddress);
    }
}
