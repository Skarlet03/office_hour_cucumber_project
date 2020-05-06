Feature: Login To Application

  @ManagerLogin @TC001
    # We will have different implementation of differend methods in each page
  Scenario: Login as a manager
    Given User on "Login" page for "VyTrack" application
    When User enters "username" as "manager-username" on "Login" page
#    When User enters "username" as "mira@cybertek.com" on "Login" page
    When User enters "password" as "manager-password" on "Login" page
    And User clicks on "Login" button on "Login" page
    Then "Title" should be "Dashboard" on "Dashboard" page
    And User clicks on "Contacts" button on "Dashboard" page

  @ExcelData @TC002
  Scenario: Excel Data
    Given User on "Login" page for "VyTrack" application
    And User gets the test data from "vytrackdata1" excel "Data Sheet" sheet "1" row
    When User enters "username" as "manager-username" on "Login" page
    When User enters "password" as "manager-password" on "Login" page
    And User clicks on "Login" button on "Login" page
    Then "Title" should be "Dashboard" on "Dashboard" page
    And User clicks on "Contacts" button on "Dashboard" page
    #And User clicks on "Create new contact" button on "Dashboard" page
  # And User enters following information
#  |first name| last name|email|||
#    |excel|excel|qa@company.com||

  @ExcelData2 @TC003
  Scenario Outline: Excel Data
    Given User on "Login" page for "VyTrack" application
    And User gets the test data from "<ExcelDocument>" excel "<SheetName>" sheet "<row>" row
    When User enters "username" as "manager-username" on "Login" page
    When User enters "password" as "manager-password" on "Login" page
    And User clicks on "Login" button on "Login" page
    Then "Title" should be "Dashboard" on "Dashboard" page
    And User clicks on "Contacts" button on "Dashboard" page
    And User clicks on "Create Contact" button on "Contact" page
    When User enters "First Name" as "excel" on "Contact" page
    When User enters "Last Name" as "excel" on "Contact" page
    When User enters "Phone" as "excel" on "Contact" page
    When User enters "Street" as "excel" on "Contact" page
    When User enters "City" as "excel" on "Contact" page
    When User enters "ZipCode" as "excel" on "Contact" page
    When User selects "Country" as "excel" on "Contact" page
    When User selects "State" as "excel" on "Contact" page

    @client2
    Examples:
      | row | ExcelDocument | SheetName  |
      | 3   | vytrackdata2  | Data Sheet |
#      | 6   |vytrackdata2 |Data Sheet2|
#      | 2   |vytrackdata2 |
#      | 5   |vytrackdata2 |

  @TC004
  Scenario Outline: Excel with map example
    Given User on "Login" page for "VyTrack" application
    And User gets the test data from "<ExcelDocument>" excel "<SheetName>" sheet "<row>" row
    When User enters "username" as "manager-username" on "Login" page
    When User enters "password" as "manager-password" on "Login" page
    And User clicks on "Login" button on "Login" page
    Then "Title" should be "Dashboard" on "Dashboard" page
    And User clicks on "Contacts" button on "Dashboard" page
    And User clicks on "Create Contact" button on "Contact" page
    And User enters following information on "Contact" page
      | First Name | <First Name> |
      | Last Name  | excel        |
      | Phone      | excel        |
      | Street     | excel        |
      | City       | excel        |
      | ZipCode    | excel        |
      | Country    | excel        |
      | State      | excel        |

    @client2
    Examples:
      | row | ExcelDocument | SheetName  | First Name |
      | 3   | vytrackdata2  | Data Sheet | excel      |
#      | 4   | vytrackdata2  | Data Sheet2 | Mary       |
#ctrl + shift + alt + l   to alight/format the file