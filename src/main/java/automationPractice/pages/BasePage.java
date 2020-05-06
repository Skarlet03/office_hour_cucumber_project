package automationPractice.pages;

import automationPractice.utilities.CommonMethods;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.Driver;
import automationPractice.utilities.ExcelUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage implements CommonMethods {

    public static String str_firstName, str_lastName, str_phone, str_city, str_postalCode, str_street, str_state, str_country;
    public static WebDriverWait webDriverWait;
    Select select;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void getData(String docName, String sheetName, String rowNum) {
        int row = Integer.parseInt(rowNum);
        String path = System.getProperty("user.dir") + ConfigurationReader.get(docName);
        ExcelUtil excel = new ExcelUtil(path, sheetName);
        str_firstName = excel.getCellData(row, 1);
        str_lastName = excel.getCellData(row, 2);
        str_phone = excel.getCellData(row, 3);
        str_street = excel.getCellData(row, 4);
        str_postalCode = excel.getCellData(row, 5);
        str_city = excel.getCellData(row, 6);
        str_country = excel.getCellData(row, 7);
        str_state = excel.getCellData(row, 8);

        System.out.println(str_firstName + " " + str_lastName + " " + str_phone);
    }

    public static String filterExcelData(String field, String value) {
        field = field.toUpperCase();
        switch (field) {
            case "FIRST NAME":
                value = str_firstName;
                break;
            case "LAST NAME":
                value = str_lastName;
                break;
            case "STREET":
                value = str_street;
                break;
            case "PHONE":
                value = str_phone;
                break;
            case "CITY":
                value = str_city;
                break;
            case "ZIPCODE":
                value = str_postalCode;
                break;
            case "STATE":
                value = str_state;
                break;
            case "COUNTRY":
                value = str_country;
                break;
        }

        return value;
    }
}
