package SeleniumCucumberCode.StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD05_HooksLearning {
@Before
    public void startTest(){
        System.out.println("Scenario-started--@before-hook executed");
    }
@After
    public void endTest(){
        System.out.println("Scenario-ended--@after-hook executed");
    }

    //Scenario-1
    @Given("this is the first given")
    public void this_is_the_first_given() {
        System.out.println("First scenario Given");
    }
    @Then("this is the first then")
    public void this_is_the_first_then() {
        System.out.println("First scenario Then");
    }

    //Scenario-2
    @Given("this is second given")
    public void this_is_second_given() {
        System.out.println("second scenario Given");
    }
    @Then("This is second then")
    public void this_is_second_then() {
        System.out.println("second scenario Then");
    }
}
