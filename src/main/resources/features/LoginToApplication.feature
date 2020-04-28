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
