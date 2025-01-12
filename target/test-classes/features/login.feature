Feature: Login Feature

  @smoke
  Scenario: Incorrect Login
    Given the user is on the main login page
    When the user enters wrong login information
    Then the user will receive an error message and not be logged in

  @smoke
  Scenario: Correct login for Applicant
    Given the user is on the main login page
    When the user enters the correct login information
    Then the user will be successfully logged in

  @smoke
  Scenario: Correct login for Admin
    Given the user is on the main login page
    When the admin enters the correct login information
    Then the admin will be successfully logged in




