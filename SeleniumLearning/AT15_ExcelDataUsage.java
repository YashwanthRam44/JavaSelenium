package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Xls_Reader;

import java.util.concurrent.TimeUnit;

public class AT15_ExcelDataUsage {

    @Test
    public void CreateAccounts()  {
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
      //  C:\Users\softw\IdeaProjects\YashProject-STL\src\main\java\Resources\TestDataHN1.xlsx
        Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
        // count of rows in the excel sheet
        int rowcount= reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int i=2;i<=rowcount;i++){
            //FirstName
            String FirstName=  reader.getCellData("RegTestData","FirstName",i);
            System.out.println("FirstName : "+FirstName);
            //enter data into first name field on website
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys(FirstName);
            //Here we picked up data for LastName from excel
            String lastname=reader.getCellData("RegTestData","LastName",i);
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",i);
            driver.findElement(By.id("email_address")).clear();
            driver.findElement(By.id("email_address")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",i);
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",i);
            driver.findElement(By.id("password-confirmation")).clear();
            driver.findElement(By.id("password-confirmation")).sendKeys(confirmation);
            //put databack into excellsheet
            String textName=driver.findElement(By.xpath("//strong[contains(text(),'Create New Account')]")).getText();
            reader.setCellData("RegTestData","Result",i,textName);
        }

    }
}
