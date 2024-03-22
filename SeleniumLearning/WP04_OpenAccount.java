package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WP04_OpenAccount {
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

        driver.get("https://auth.jbhifi.com.au/c82f7cb0-dc26-457a-8291-d55a6f80f6ac/b2c_1a_v1_sign_up_sign_in/oauth2/v2.0/authorize?client_id=f47b1902-9a16-47db-9157-a3db123307f6&redirect_uri=https%3A%2F%2Fauth.jbhifi.com.au%2Fsignin%2FB2C_1A_v1_sign_up_sign_in&response_type=code&scope=openid%20https%3A%2F%2Fauth.jbhifi.com.au%2Ff8d0fcd2-fcdb-4119-8652-4ffabb4d9704%2Fuser_impersonation%20offline_access&code_challenge=BN15crqaHTejQM6shRLzMzJ_jUEPRuQvNYn2xaFpfus&code_challenge_method=S256&response_mode=form_post&nonce=638425491128405277.ZTkxNTFhOWUtMzA4OC00MGE2LTkzOTItYzcyOWE0MWUwYjY4OGVlYzA0ZDktYzcyOS00ZWMyLWFjNzAtMzFiYWQwNjY0Zjc1&return_url=%2Faccount%2Flogin%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jbhifi.com.au%252F&state=CfDJ8GP5xa9O_l9NriVBIBoDzeqOY4a-_XvK5yXaqHuw2UcJInloAWKbPzB_NMWqpicN9HNVkXdwO8Za_Ntu8_3rT4nH7kMCUcvtrJ5XMz5Z7zPfzXmL3oO1arS6dhS7fDtUetI7qzKN_RHM--dHgNtxhnaexFnitZ1UrVlHl-F4w4ZQbs_VJiZJS2hoaN4WG0FTSg80tH9XpwHROe7D2_lWgk30LrH_umWQh2ALS78kGfzbF7jSI_n1DamkHBulkcB-jukY0ilpbeOxA2J2XkjEbHjMmf0Jg4g6xR6cuVLpmQshpa-e0PGAw1JYbbEcbI4U3gsuzsGN3Za4D8vaUFmiM_H7tHfsv3WfcHrANrpUrlgJaKEnI0YMzC8bKcZTW89ATJFDZApeeaLEBA-i4GWB9KQxvQiQu3UmcGW5ZYwT4JFyRV5TT0n5LiwYjYtqwLKKGcQ_fkBcMMB9sfwbV_gLOdXZURFL4d-5f8vx6CuzpinOexTDIKddix9L0wvJn6Oeqn7_LQurJaaU4s7TDfhDgye95VW2nuRGTTEj5O7snMcO&x-client-SKU=ID_NET6_0&x-client-ver=6.25.1.0");
        driver.findElement(By.id("Log in-Email address")).sendKeys("yash20ram@gmail.com");
        driver.findElement(By.id("Log in-password")).sendKeys("evana@123D");

        driver.findElement(By.xpath("//*[@id='continueProxy']")).click();

    }

}
