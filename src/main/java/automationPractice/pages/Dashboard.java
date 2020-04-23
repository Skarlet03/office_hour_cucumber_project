package automationPractice.pages;

import org.junit.Assert;

public class Dashboard extends BasePage{

    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "ACCOUNTS":
//                btn_accounts.click();
                break;
            default:
                Assert.fail("There are no button " + button + " availiable in switch statement");
        }
    }

}
