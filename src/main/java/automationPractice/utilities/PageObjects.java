package automationPractice.utilities;

import automationPractice.pages.BasePage;
import automationPractice.pages.Dashboard;
import automationPractice.pages.Login;

public class PageObjects {

    private PageObjects(){}

    public static BasePage getPageObject(String pageName){
        pageName = pageName.toUpperCase();
        switch (pageName){
            case "LOGIN":
                return new Login();
            case "DASHBOARD":
                return new Dashboard();
            default:
                return new BasePage();
        }
    }

}
