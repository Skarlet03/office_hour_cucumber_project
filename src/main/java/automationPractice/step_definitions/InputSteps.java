package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.When;

public class InputSteps {



    @When("User enters {string} as {string} on {string} page")
    public void user_enters_as_on_page(String field, String value, String pageName) {
        BasePage page = PageObjects.getPageObject(pageName);
        //BasePage page = new Login();
        if (value.equalsIgnoreCase("manager-username")){
            value = ConfigurationReader.get("manager-username"); // salesmanager110
        } else if (value.equalsIgnoreCase("manager-password")){
            value = ConfigurationReader.get("manager-password"); // salesmanager110
        }
        page.enterValue(field, value); // (username, salesmanager110)
    }

}
