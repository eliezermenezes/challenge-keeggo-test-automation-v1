@Login
Feature: Login
  Sign in to the app

  Scenario: Login with incorrect credentials
    Given I go to login screen
    When I enter the 'username 01' username and 'password01' password
    And I touch the 'LOGIN' button
    Then I can see the message 'Incorrect user name or password'


  Scenario: Login successfully
    Given I go to login screen
    When I enter the 'username 02' username and 'password02' password
    And I touch the 'LOGIN' button