Feature: all login scenarios

  Background: opens browser
    Given I open browser
    When I maximize browser

     # using background you can execute some steps before every scenario

  @login
  Scenario: to test the functionality of login button for valid credentials
    Given I am on login page
    When I enter username as "admin" and password as "admin"
    And I click on login button
    Then I should land up to the home page
  @login
  Scenario: to test the functionality of login button for invalid credentials
    Given I am on login page
    When I enter username as "amol1234" and password as "amol1234"
    And I click on login button
    Then I should land up to the home page

  @login
  Scenario: to test the functionality of login button for other credentials
    Given I am on login page
    When I dont enter username and password
    And I click on login button
    Then I should land up to the home page

    @userRegistration
    Scenario: user registrion test
      Given  I am on user registration page
      When I enter following
      | amol | ujagare | 78787 | amol@gmail.com |
      Then user should be added