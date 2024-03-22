package SeleniumCucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateToGGWebsite {

    @Test
    public static void NavWeb() throws IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGRegPageUrl"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static void AssertTitle(){
        String AcutalTitle= OpenBrowser.driver.getTitle();
        System.out.println("AcutalTitle : "+ AcutalTitle);
        String ExpectedTitle="Register";
        Assert.assertEquals(ExpectedTitle,AcutalTitle);
    }
}
