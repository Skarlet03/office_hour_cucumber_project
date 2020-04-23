package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.pages.Login;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NavigationSteps {

    @Given("User on {string} page for {string} application")
    public void user_on_page_for_application(String string, String string2) {

    }

    @When("User clicks on {string} button on {string} page")
    public void user_clicks_on_button_on_page(String buttonName, String pageName) {
                                                 //   Login     , Login
        BasePage page = PageObjects.getPageObject(pageName);
        //BasePage page = new Login();
        page.clickButton(buttonName); // clickButton executed from Login class
    }



}
