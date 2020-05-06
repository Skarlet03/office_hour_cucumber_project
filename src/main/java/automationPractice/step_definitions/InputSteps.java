package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static automationPractice.pages.BasePage.*;

public class InputSteps {



    @When("User enters {string} as {string} on {string} page")
    public void user_enters_as_on_page(String field, String value, String pageName) {
        BasePage page = PageObjects.getPageObject(pageName);
        //BasePage page = new Login();
        if (value.equalsIgnoreCase("manager-username")){
            value = ConfigurationReader.get("manager-username"); // salesmanager110
        } else if (value.equalsIgnoreCase("manager-password")){
            value = ConfigurationReader.get("manager-password"); // salesmanager110
        }else if (value.equalsIgnoreCase("excel")){
            value = filterExcelData(field, value);
        }
        page.enterValue(field, value); // (username, salesmanager110)
    }

    @When("User selects {string} as {string} on {string} page")
    public void user_selects_as_on_page(String listName, String value, String pageName) {
        BasePage page = PageObjects.getPageObject(pageName);
        if (value.equalsIgnoreCase("excel")) {
            value = filterExcelData(listName, value);
        }
        page.selectValue(listName, value);
    }


    @Then("User enters following information on {string} page")
    public void user_enters_following_information_on_page(String pageName, Map<String , List<String>> table) {
        BasePage page = PageObjects.getPageObject(pageName);
        System.out.println(table);
        Map <String, String> dataMap = new HashMap();
        for (String key:table.keySet()) {
            String value = filterExcelData(key, table.get(key).get(0));
            dataMap.put(key, value);
        }

    }
}
