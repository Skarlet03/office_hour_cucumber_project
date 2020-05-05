package automationPractice.utilities;

import automationPractice.pages.BasePage;
import automationPractice.pages.ContactPage;
import automationPractice.pages.Dashboard;
import automationPractice.pages.Login;
import org.junit.Assert;

public class PageObjects {

    private PageObjects(){}

    public static BasePage getPageObject(String pageName){
        pageName = pageName.toUpperCase();
        switch (pageName){
            case "LOGIN":
                return new Login();
            case "DASHBOARD":
                return new Dashboard();
            case "CONTACT":
                return new ContactPage();
            case "BASE":
                return new BasePage();
            default:
                Assert.fail("Page is not declared");
        }
        return new BasePage();
    }

}
