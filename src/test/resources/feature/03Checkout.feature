@checkout @regression
Feature: Login
  @checkout-2-item
  Scenario: Sorting item low to high price
    Given The user is on login page
    When The user input username with "standard_user"
    And The user input password with "secret_sauce"
    And The user click on login button
    And The user is redirected to product page
    And The user click sort button
    And The user add to card product 2
    And The user add to card product 1
    And The user click card button
    Then The user verify product in card page
    And The user click checkout button on card page
    And The user input "m" in first name checkout information
    And The user input "hasan" in last name checkout information
    And The user input "82891" in postal code checkout information
    And The user click continue button on checkout information
    And The user verify product in checkout overview page
    And The user click finish button in checkout overview page
    And The user verify checkout complete