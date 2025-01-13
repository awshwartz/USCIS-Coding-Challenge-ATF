Feature: Form Completion
  @smoke
  Scenario: Create Form I-999
    Given The user is logged in as an applicant
    When The user clicks on Start new Form for an I999 Form
    And The user fills out the form correctly
    Then The user will have successfully completed a Form I999


  Scenario: Creat a new Form I-131 Form
    Given The user is logged in as an applicant
    When The user starts an I131 form
    And The user fills out the I131 Form correctly
    Then the user will have successfully completed a Form 131