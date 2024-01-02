package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement allProductText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/product_details/1']")
    WebElement firstProduct;

    @CacheLookup
    @FindBy(xpath = "(//h2)[3]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "(//p[normalize-space()='Category: Women > Tops'])[1]")
    WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//span[@xpath='1']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "(//b[normalize-space()='Availability:']")
    WebElement productAvailability;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    WebElement productCondition;

    @CacheLookup
    @FindBy(xpath = "(//b[normalize-space()='Brand:']")
    WebElement productBrand;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'productinfo text-center']/p")
    List<WebElement> productsName;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'nav nav-pills nav-justified']/li/a")
    WebElement viewProductTab;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searBar;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'single-products']/div/p")
    WebElement searchedProductName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenTabInCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'Women']/div/ul/li/a")
    List<WebElement> womenSubMenuList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menTabInCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'Men']/div/ul/li/a")
    List<WebElement> menSubMenuList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Kids']")
    WebElement kidsTabInCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'title text-center']")
    WebElement subMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'nav nav-pills nav-stacked']/li/a")
    List<WebElement> brandsList;


    public String verifyAllProductsText() {
        return getTextFromElement(allProductText);
    }

    public void clickFirstProduct() {
        clickOnElement(firstProduct);
    }

    public String verifyFirstProductName() {
        return getTextFromElement(productName);
    }

    public String verifyProductCategory() {
        return getTextFromElement(productCategory);
    }

    public String verifyProductPrice() {
        return getTextFromElement(productPrice);
    }

    public String verifyProductAvailability() {
        return getTextFromElement(productAvailability);
    }

    public String verifyProductCondition() {
        return getTextFromElement(productCondition);
    }

    public String verifyProductBrand() {
        return getTextFromElement(productBrand);
    }

    public String getAllProductText() {
        return getTextFromElement(allProductText);
    }

    public void clickOnViewProductWithProductName(String pName) {
        for (WebElement p : productsName) {
            if (p.getText().equalsIgnoreCase(pName)) {
                driver.findElement(with(By.xpath("//ul[@class = 'nav nav-pills nav-justified']/li/a")).below(p)).click();
                break;
            }
        }
    }

    public void sendTextToSearchBar(String pName) {
        sendTextToElement(searBar, pName);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String getSearchedProductsText() {
        return getTextFromElement(searchedProductsText);
    }

    public String getSearchedProductName() {
        return getTextFromElement(searchedProductName);
    }

    public void clickOnContinueShoppingLink() {
        clickOnElement(continueShoppingLink);
    }

    public void clickOnCategory(String category) {
        if (category.equalsIgnoreCase("Men")) {
            clickOnElement(menTabInCategory);
        } else if (category.equalsIgnoreCase("Women")) {
            clickOnElement(womenTabInCategory);
        } else if (category.equalsIgnoreCase("Child")) {
            clickOnElement(kidsTabInCategory);

        } else {
            System.out.println("Category is not available");
        }
    }

    public void clickOnSubCategoryOfWomen(String womenSubCategory) {
        for (WebElement s : womenSubMenuList) {
            if (s.getText().equalsIgnoreCase(womenSubCategory)) {
                clickOnElement(s);
                break;
            } else {
                System.out.println("Sub category is not available");
            }
        }
    }

    public void clickOnSubCategoryOfMen(String menSubCategory) {
        for (WebElement s : menSubMenuList) {
            if (s.getText().equalsIgnoreCase(menSubCategory)) {
                clickOnElement(s);
                break;
            } else {
                System.out.println("Sub category is not available");
            }
        }
    }

    public String getSubMenuPageTitle() {
        return getTextFromElement(subMenuPageTitle);
    }

    public void clickOnBrandOnBrandsTab(String brand) {
        for (WebElement b : brandsList) {
            System.out.println(b);
            if (b.getText().equalsIgnoreCase(brand)) {
                b.click();
                break;
            } else {
                System.out.println("Brand name is not available");
            }
        }
    }
}
