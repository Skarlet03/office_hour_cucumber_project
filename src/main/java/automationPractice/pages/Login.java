package automationPractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends BasePage {

    @FindBy(id = "_submit")
    public WebElement btn_login;

    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "LOGIN":
                btn_login.click();
                break;
            default:
                Assert.fail("There are no button " + button + " availiable in switch statement");
        }
    }
}
