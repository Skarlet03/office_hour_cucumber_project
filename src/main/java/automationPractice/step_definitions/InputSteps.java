package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.When;

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
            field = field.toUpperCase();
            switch (field){
                case "FIRST NAME":
                    value = str_firstName;
                    break;
                case "LAST NAME":
                    value = str_lastName;
                    break;
                case "STREET":
                    value = str_street;
                    break;
                case "PHONE":
                    value = str_phone;
                    break;
                case "CITY":
                    value = str_city;
                    break;
                case "ZIPCODE":
                    value = str_postalCode;
                    break;
            }
        }
        page.enterValue(field, value); // (username, salesmanager110)
    }

    @When("User selects {string} as {string} on {string} page")
    public void user_selects_as_on_page(String listName, String value, String pageName) {
        BasePage page = PageObjects.getPageObject(pageName);
        if (value.equalsIgnoreCase("excel")) {
            listName = listName.toUpperCase();
            switch (listName) {
                case "STATE":
                    value = str_state;
                    break;
                case "COUNTRY":
                    value = str_country;
                    break;
            }
        }
        page.selectValue(listName, value);
    }
}
