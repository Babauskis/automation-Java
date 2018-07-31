Feature: This feature is about testing login functionality in the system

  Scenario: Successful sign-up
    Given I have opened homepage
      When I navigate to SignUp page
        And I create new account
      Then user account page is opened
      Then I logout from account
    Given I have opened login page
      Then I login in to created account
      Then user account page is opened
