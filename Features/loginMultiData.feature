# new feature
# Tags: optional

Feature: Login scenariao

  @multipleLoginCases
  Scenario Outline: to test the functionality of login button for valid credentials
    Given I am on login page
    When We enter username as <username> and password as <password>
    And I click on login button
    Then I should land up to the home page

    Examples:

      | username | password  |
      | user1    | pass 1    |
      | user2    | pass 2    |
      | user3    | pass 3    |
      | user4    | pass 4    |
      | user5    | pass 5    |