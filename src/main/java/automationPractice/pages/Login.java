package automationPractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends BasePage {

    @FindBy(id = "_submit")
    public WebElement btn_login;

    @FindBy(id = "prependedInput")
    public WebElement txt_username;

    @FindBy(id = "prependedInput2")
    public WebElement txt_password;

    //lst_ - list
    //ckbx_ - checkbox

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

    @Override
    public void enterValue(String field, String value) {
        field = field.toUpperCase();
        switch (field){
            case "USERNAME":
                txt_username.sendKeys(value);
                break;
            case "PASSWORD":
                txt_password.sendKeys(value);
                break;
            default:
                Assert.fail("There are no field " + field + " availiable in switch statement");
        }
    }
}
