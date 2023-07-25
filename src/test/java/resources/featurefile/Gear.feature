@regression
Feature: Gear Test
  As a user I want to use different features of the Mens Products Page

  @regression
  Scenario: Verify if I can add a product to the shopping cart successfully
    Given I hover on the Gear menu and click bags option
    When I click the product named 'Overnight Duffle'
    And I should see the text of bag "Overnight Duffle"
    And I change the quantity to '3'
    And I click on the Add to Cart button duffle bag
    And I should see the message "You added Overnight Duffle to your shopping cart."
    And I click on the shopping cart link in the message
    And I should see the product name "Overnight Duffle"
    And The quantity should be "3"
    And The product price should be "$135.00"
    And I update the quantity to "5"
    And I click on the Update Shopping Cart button
    And the product price should be "$225.00"