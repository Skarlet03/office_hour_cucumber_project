package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static automationPractice.pages.BasePage.filterExcelData;


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
        //Map<String , List<String>> table -> Map <String, String>
        BasePage page = PageObjects.getPageObject(pageName);
        System.out.println(table);
        Map <String, String> dataMap = new LinkedHashMap<>();
        for (String key:table.keySet()) {
            String initValue = table.get(key).get(0); //"excel"
            //First Name=[excel]  ==> when I say table.get("First Name") will return [excel] and  .get(0) -> String "excel"
            String value = initValue;
            if (value.equalsIgnoreCase("excel")) {
                value = filterExcelData(key, initValue);
            }
            //filterExcelData("First Name", "excel") => value from excel
            dataMap.put(key, value); //{First Name = value from excel , .... }
        }
        page.enterValue(dataMap);
    }
}
