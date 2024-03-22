package SeleniumLearning;

import PropertiesFile.PropertiesFileExtractor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ymlusageInClassFile {

    @Test
    public void yamlUsage() throws IOException {
        System.out.println(PropertiesFileExtractor.initializeTestData("RegistrationForm.FirstName"));
        System.out.println(PropertiesFileExtractor.initializeTestData("urls.Google"));
    }
}
