package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;
   // By shoppingCart = By.xpath("//span[@class='base']");

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    //By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    //By size = By.xpath("//dd[contains(text(),'32')]");

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;
   // By color = By.xpath("//dd[contains(text(),'Black')]");

    @CacheLookup
     @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
     WebElement overNightDuffleText;
    //By overNightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyText;
    //By qtyText = By.xpath("(//input[@class='input-text qty'])[1]");

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;
    //By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qty;
    //By qty = By.xpath("(//input[@class='input-text qty'])[1]");

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    //By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;
   // By updatedProductPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public String getShoppingCart() {
        return getTextFromElement(shoppingCart);
    }

    public String getCronusYogaPantText() {
        return getTextFromElement(cronusYogaPant);
    }

    public String getSizeText() {
        return getTextFromElement(size);
    }

    public String getColorText() {
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty() {
        String qty = qtyText.getAttribute("value");
        return qty;
    }

    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty) {
         qty.clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String getUpdatedProductPrice() {
        return getTextFromElement(updatedProductPrice);
    }
}
