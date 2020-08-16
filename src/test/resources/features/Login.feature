Feature: Login
  User Story: As a user, I should be able to login

  Scenario: Verify Login
    Given User is on the login page
    Then User puts the username
    And User puts the password
    And User clicks login button