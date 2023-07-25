@regression
Feature: Mens Page Test
  As a user I want to use different features of the Mens Products Page

  @Smoke @Regression
  Scenario: Verify user should add product successfully to Shopping Cart
    Given I am on homepage
    When I click on Mens Menu tab
    And I click on Bottoms submenu option
    And I click on Pants option
    And I hover on the 'Cronus Yoga Pant' and click on size "32".
    And I hover on the 'Cronus Yoga Pant' and click on the colour "Black".
    And I hover on the 'Cronus Yoga Pant' and click on the ‘Add To Cart’ Button.
    And I should see the text "You added Cronus Yoga Pant to your shopping cart."
    And I should see the title "Shopping Cart."
    And I should click on Shopping Cart Link from message
    And I should see the product Title "Cronus Yoga Pant"
    And I should see the size as "32"
    Then I should see the colour as "Black"