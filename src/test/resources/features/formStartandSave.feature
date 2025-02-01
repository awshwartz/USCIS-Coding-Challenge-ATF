Feature: User logs in and starts a new form. User saves and exits from the form and then logs out

  Scenario: Correct login for Applicant
    Given the user is on the main login page
    When the user enters the correct login information
    Then the user will be successfully logged in

  Scenario: Create a new form then save and exit
    Given The user is logged in as an applicant
    When The user starts an I131 form
    And The user fills out the form partially
    And the user logs out
