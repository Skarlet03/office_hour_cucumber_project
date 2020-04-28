package automationPractice.pages;

import automationPractice.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{

    @FindBy (xpath = "(//li/a[@href='/contact'])[4]")
    public WebElement btn_contacts;

    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "ACCOUNTS":
//                btn_accounts.click();
                break;
            case "CONTACTS":
                btn_contacts.click();
                break;
            default:
                Assert.fail("There are no button " + button + " availiable in switch statement");
        }
    }

    @Override
    public  void validateResult (String object, String expected){
        object = object.toUpperCase();
        switch (object){
            case "TITLE":
                Assert.assertEquals(expected, Driver.get().getTitle());
                break;
            default:
                Assert.fail("There are no object " + object + " availiable in switch statement");
        }

    }



}
