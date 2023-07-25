package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearSteps {

    @Given("I hover on the Gear menu and click bags option")
    public void iHoverOnTheGearMenuAndClickBagsOption() {
        new HomePage().mouseHoverOnGearMenu();
        new HomePage().clickOnPant();

    }

    @When("I click the product named {string}")
    public void iClickTheProductNamedOvernightDuffle() {
        new GearPage().clickOnOvernightDuffle();
    }

    @And("I should see the text of bag {string}")
    public void iShouldSeeTheTextOfBag(String arg0) {
        Assert.assertEquals(new OverNightDufflePage().getOverNightDuffelText(),"Overnight Duffle","text not match");
    }

    @And("I change the quantity to {string}")
    public void iChangeTheQuantityTo(int arg0) {
        new OverNightDufflePage().changeQuantityTo3("3");
    }

    @And("I click on the Add to Cart button duffle bag")
    public void iClickOnTheAddToCartButtonDuffleBag() {
        new OverNightDufflePage().clickOnAddToCart();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String arg0) {
        Assert.assertEquals(new OverNightDufflePage().getAddToCartText(),"You added Overnight Duffle to your shopping cart.","text not match");

    }

    @And("I click on the shopping cart link in the message")
    public void iClickOnTheShoppingCartLinkInTheMessage() {
        new OverNightDufflePage().clickOnShoppingCart();
    }

    @And("I should see the product name {string}")
    public void iShouldSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getOverNightDuffleText(),"Overnight Duffle","text not match");

    }

    @And("The quantity should be {string}")
    public void theQuantityShouldBe(String arg0) {
        new ShoppingCartPage().changeQtyOfOverNightDuffle("3");
    }

    @And("The product price should be {string}")
    public void theProductPriceShouldBe() {


    }

    @And("I update the quantity to {string}")
    public void iUpdateTheQuantityTo(String arg0) {
        new ShoppingCartPage().changeQtyOfOverNightDuffle("5");
    }

    @And("I click on the Update Shopping Cart button")
    public void iClickOnTheUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @And("the product price should be {string}")
    public void theProductPriceShouldBe(String arg0) {
    }
}
