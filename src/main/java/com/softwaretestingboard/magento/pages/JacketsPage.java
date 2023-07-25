package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsPage extends Utility
{

    private static final Logger log = LogManager.getLogger(JacketsPage.class.getName());

    public JacketsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;
    //By productFilter = By.xpath("//div[2]//div[3]//select[1]");

    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    List<WebElement> nameList1;
   // By nameList1 = By.xpath("//strong[@class = 'product name product-item-name']");

    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    List<WebElement> nameList2;
    //By nameList2 = By.xpath("//strong[@class = 'product name product-item-name']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    List<WebElement> priceList1;
    //By priceList1 = By.xpath("//span[@class='price-container price-final_price tax weee']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    List<WebElement> priceList2;
    //By priceList2 = By.xpath("//span[@class='price-container price-final_price tax weee']");


    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = nameList1;
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        List<WebElement> afterFilterProductList = nameList2;
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return afterFilterProductList1;
    }


    public ArrayList<String> getPriceList1() {
        List<WebElement> beforeFilterProductList = priceList1;
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getPriceList2() {
        List<WebElement> afterFilterProductList = priceList2;
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }
}
