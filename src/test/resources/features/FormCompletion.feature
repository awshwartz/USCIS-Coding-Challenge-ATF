Feature: Form Completion


  Scenario: Correct login for Applicant
    Given the user is on the main login page
    When the user enters the correct login information
    Then the user will be successfully logged in


  Scenario: Create a new Re-Entry  Form
    Given The user is logged in as an applicant
    When The user starts an I131 form
    And The user fills out the form correctly
    Then the user will have successfully completed a new application

