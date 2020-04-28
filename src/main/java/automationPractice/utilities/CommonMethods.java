package automationPractice.utilities;

public interface CommonMethods {

    public default void clickButton(String button){}

    public default void enterValue(String field, String value){}

    public default void validateResult (String object, String expected){}



}
