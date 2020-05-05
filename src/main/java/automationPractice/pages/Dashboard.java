package automationPractice.pages;

import automationPractice.step_definitions.Hooks;
import automationPractice.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dashboard extends BasePage{

    @FindBy (xpath = "//span[.='Contacts']/following-sibling::a")
    public WebElement btn_contacts;

    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "ACCOUNTS":
//                btn_accounts.click();
                break;
            case "CONTACTS":
                webDriverWait.until(ExpectedConditions.elementToBeClickable(btn_contacts));
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
                webDriverWait.until(ExpectedConditions.titleIs(expected));
                Assert.assertEquals(expected, Driver.get().getTitle());
                break;
            default:
                Assert.fail("There are no object " + object + " availiable in switch statement");
        }

    }



}
