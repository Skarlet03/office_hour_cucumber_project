package automationPractice.pages;

import automationPractice.utilities.CommonMethods;
import automationPractice.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage implements CommonMethods {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }


}
