Feature: This feature is about logging in to the system

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    Then I select Login button from login form
      And I enter Email address in login form
      And I enter Password in login form
    Then I select Login button from login form
      And user account page is opened