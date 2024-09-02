Feature: Login

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should be redirected to the homepage

  Scenario: Unsuccessful login with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    And User clicks on the login button
    Then User should see an error message

  Scenario: Unsuccessful login with empty fields
    Given User is on the login page
    When User leaves username and password fields empty
    And User clicks on the login button
    Then User should see an error message
