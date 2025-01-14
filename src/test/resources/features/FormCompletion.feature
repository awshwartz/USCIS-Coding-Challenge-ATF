Feature: Form Completion

  Scenario: Create a new Form I-131 Form
    Given The user is logged in as an applicant
    When The user starts an I131 form
    And The user fills out the form correctly
    Then the user will have successfully completed a Form 131