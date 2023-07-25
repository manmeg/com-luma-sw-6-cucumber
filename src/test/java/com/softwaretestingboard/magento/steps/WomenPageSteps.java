package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenPageSteps
{
    @And("I click on Womens Menu Tab")
    public void iClickOnWomensMenuTab() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("I click on Tops submenu option")
    public void iClickOnTopsSubmenuOption() {
        new HomePage().mouseHoverOnTops();
    }

    @And("I click on Jackets option")
    public void iClickOnJacketsOption() {
        new HomePage().clickOnJackets();
    }

    @When("I select the filter to sort by {string}")
    public void iSelectTheFilterToSortBy(String filter) {
        new WomenPageSteps().iSelectTheFilterToSortBy("Product Name ");
    }

    @Then("I should see the products name display in alphabetical order")
    public void iShouldSeeTheProductsNameDisplayInAlphabeticalOrder() {

    }

    @Then("I should see the products price display in ascending order")
    public void iShouldSeeTheProductsPriceDisplayInAscendingOrder() {
        //Assert.assertEquals("text not match",new WomenJacketsPage().getPriceList1(),new WomenJacketsPage().getPriceList2());
    }
}
