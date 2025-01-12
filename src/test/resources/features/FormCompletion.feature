Feature: Form Completion

  Scenario: Create Form I-131
    Given the user is authenticated
    When accesses the account
    Then the user should be able to create a form I-131


  Scenario: Access an existing I-131 Form
    Given the user is authenticated
    When accesses the account
    Then the user should be able to navigate to an existing "incomplete" form I-131 if one exists