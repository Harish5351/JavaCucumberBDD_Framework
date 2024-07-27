Feature: Login Functionality.

  Scenario: Verify login functionality of application
    Given User is on "login" page
    When User enters username "Username"
    And User enters password "Password"
    When User clicks on "ShowPassword" Button
    And User clicks on "IAgree" Button
#    When User clicks on "Login" Button
#    Then User verifies "xaquaLogo" displayed on page