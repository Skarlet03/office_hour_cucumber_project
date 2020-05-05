package automationPractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage  extends BasePage{

    @FindBy (linkText = "Create Contact")
    public WebElement btn_createContact;


    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "CREATE CONTACT":
                btn_createContact.click();
                break;
            default:
                Assert.fail("There are no button " + button + " availiable in switch statement");
        }
    }

}
