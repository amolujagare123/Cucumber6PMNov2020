Feature: all login scenarios


  Scenario: to test the functionality of login button for valid credentials
    Given I am on login page
    When I enter username as admin and password as admin
    And I click on login button
    Then I should land up to the home page