@login @regression
Feature: Login
  @login-success
  Scenario: Login Success with valid email and password
    Given The user is on login page
    And The user input username with "standard_user"
    And The user input password with "secret_sauce"
    When The user click on login button
    Then The user is redirected to product page
  @login-fail
  Scenario: Login fail with wrong password
    Given The user is on login page
    And The user input username with "standard_user"
    And The user input password with "wrong_password"
    When The user click on login button
    Then The user get error message login