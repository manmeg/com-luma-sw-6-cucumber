package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ManSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }


    @When("I click on Mens Menu tab")
    public void iClickOnMensMenuTab() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("I click on Bottoms submenu option")
    public void iClickOnBottomsSubmenuOption() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("I click on Pants option")
    public void iClickOnPantsOption() {
        new HomePage().clickOnPant();
    }

    @And("I hover on the {string} and click on size {string}.")
    public void iHoverOnTheCronusYogaPantAndClickOnSize(String arg0) {
        new MenPage().mouseHoverOnCronusYogaPant();
        new MenPage().clickOnSize();
    }

    @And("I hover on the {string} and click on the colour {string}.")
    public void iHoverOnTheCronusYogaPantAndClickOnTheColour(String arg0) {
        new MenPage().mouseHoverOnCronusYogaPant();
        new MenPage().clickOnColor();
    }

    @And("I hover on the {string} and click on the ‘Add To Cart’ Button.")
    public void iHoverOnTheCronusYogaPantAndClickOnTheAddToCartButton() {
        new MenPage().mouseHoverOnCronusYogaPant();
        new MenPage().clickOnAddToCart();
    }

    @And("I should see the text {string}")
    public void iShouldSeeTheText(String arg0) {
        Assert.assertEquals(new MenPage().getTextAfterAddToCart(),"You added Cronus Yoga Pant to your shopping cart.",
                "text not match");
    }

    @And("I should see the title {string}")
    public void iShouldSeeTheTitle(String arg0) {
        // Assert.assertEquals(new );
    }

    @And("I should click on Shopping Cart Link from message")
    public void iShouldClickOnShoppingCartLinkFromMessage() {
        new MenPage().clickOnShoppingCart();
    }

    @And("I should see the product Title {string}")
    public void iShouldSeeTheProductTitle(String arg0) {
        new ShoppingCartPage().getCronusYogaPantText();
    }

    @And("I should see the size as {string}")
    public void iShouldSeeTheSizeAs(String arg0) {
        new ShoppingCartPage().getSizeText();
    }

    @Then("I should see the colour as {string}")
    public void iShouldSeeTheColourAs(String arg0) {
        new ShoppingCartPage().getColorText();
    }
}
