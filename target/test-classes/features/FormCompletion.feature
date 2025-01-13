Feature: Form Completion
  @smoke
  Scenario: Create Form I-999
    Given The user is logged in as an applicant
    When The user clicks on Start new Form for an I999 Form
    And The user fills out the form correctly
    Then The user will have successfully completed a Form I999


  Scenario: Access an existing I-131 Form
    Given the user is authenticated
    When accesses the account
    Then the user should be able to navigate to an existing "incomplete" form I-131 if one exists