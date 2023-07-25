@regression
Feature: Womens Page Test
  As a user I want to use different features of the Womens Products Page

  Background:I am on homepage
    And I click on Womens Menu Tab
    And I click on Tops submenu option
    And I click on Jackets option

  @Smoke @Regression
  Scenario: Verify if I can sort the products by name using the filter
    When I select the filter to sort by "Product Name"
    Then I should see the products name display in alphabetical order

  @Sanity @Regression
  Scenario: Verify if I can sort the products by price using the filter
    When I select the filter to sort by "Price"
    Then I should see the products price display in ascending order