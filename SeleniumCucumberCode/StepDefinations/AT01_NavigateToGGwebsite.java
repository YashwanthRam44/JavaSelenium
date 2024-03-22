package SeleniumCucumberCode.StepDefinations;

import SeleniumCucumberCode.AT01_NavigateToGGWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class AT01_NavigateToGGwebsite {

    @Given("open browser and enter url and navigate to GG Website")
    public void open_browser_and_enter_url_and_navigate_to_gg_website() throws IOException {
        AT01_NavigateToGGWebsite.NavWeb();
    }
    @Then("get title and assert")
    public void get_title_and_assert() {
        AT01_NavigateToGGWebsite.AssertTitle();
    }

}
