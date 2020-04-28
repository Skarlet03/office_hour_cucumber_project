package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Then;

public class AssertionSteps {

    @Then("{string} should be {string} on {string} page")
    public void should_be_on_page(String object, String expected, String pagename) {
        BasePage basePage = PageObjects.getPageObject(pagename);
        // BasePage basePage = new Dashboard();
        basePage.validateResult(object, expected);
    }

}
