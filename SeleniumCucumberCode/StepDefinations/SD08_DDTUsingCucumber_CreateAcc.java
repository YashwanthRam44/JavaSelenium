package SeleniumCucumberCode.StepDefinations;

import SeleniumCucumberCode.AT08_DDTUsingCucumber_CreateAcc;
import io.cucumber.java.en.Then;

public class SD08_DDTUsingCucumber_CreateAcc {
    @Then("enter data {string},{string},{string}")
    public void enter_data(String FirstName, String LastName, String EmailAddress) {
        AT08_DDTUsingCucumber_CreateAcc.EnterAccDtl(FirstName,LastName,EmailAddress);
    }
}
