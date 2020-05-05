package automationPractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ContactPage  extends BasePage{

    @FindBy (linkText = "Create Contact")
    public WebElement btn_createContact;

    @FindBy (xpath = "(//input[@data-name = 'field__first-name'])[1]")
    public WebElement txt_firstName;

    @FindBy (xpath = "(//input[@data-name = 'field__last-name'])[1]")
    public WebElement txt_lastName;

    @FindBy (name = "oro_contact_form[phones][0][phone]")
    public WebElement txt_phone;

    @FindBy (name = "oro_contact_form[addresses][0][street]")
    public WebElement txt_street;

    @FindBy (name = "oro_contact_form[addresses][0][city]")
    public WebElement txt_city;

    @FindBy (name = "oro_contact_form[addresses][0][postalCode]")
    public WebElement txt_zipCode;

    @FindBy (name = "oro_contact_form[addresses][0][country]")
    public WebElement lst_country;

    @FindBy (xpath = "//select[@data-name = 'field__region']")
    public WebElement lst_state;



    @Override
    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "CREATE CONTACT":
                webDriverWait.until(ExpectedConditions.elementToBeClickable(btn_createContact));
                btn_createContact.click();
                break;
            default:
                Assert.fail("There are no button " + button + " availiable in switch statement");
        }
    }

    @Override
    public void enterValue(String field, String value) {
        field = field.toUpperCase();
        switch (field){
            case "FIRST NAME":
                txt_firstName.sendKeys(value);
                break;
            case "LAST NAME":
                txt_lastName.sendKeys(value);
                break;
            case "STREET":
                txt_street.sendKeys(value);
                break;
            case "PHONE":
                txt_phone.sendKeys(value);
                break;
            case "CITY":
                txt_city.sendKeys(value);
                break;
            case "ZIPCODE":
                txt_zipCode.sendKeys(value);
                break;
            default:
                Assert.fail("There are no field " + field + " availiable in switch statement");
        }
    }

    @Override
    public  void selectValue (String listName, String value){
        listName = listName.toUpperCase();
        switch (listName){
            case "STATE":
                select = new Select(lst_state);
                select.selectByValue("US-" + value);
                break;
            case "COUNTRY":
                select = new Select(lst_country);
                select.selectByValue(value);
                break;
        }
    }


}
