@product @regression
Feature: Login
  @login-success
  Scenario: Sorting item low to high price
    Given The user is on login page
    And The user input username with "standard_user"
    And The user input password with "secret_sauce"
    And The user click on login button
    And The user is redirected to product page
    And The user click sort button
    When The user select option price low to high
    Then The user verify product has been sort by price low to high