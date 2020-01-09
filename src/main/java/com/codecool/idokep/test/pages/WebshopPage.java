package com.codecool.idokep.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebshopPage extends Page {

    @FindBy(className = "carousel_next")
    WebElement browseNext;

    @FindBy(xpath = "//img[@alt='Kültéri IP kamera']")
    WebElement cameraThumbnail;

    @FindBy(xpath = "//li[@class='ajax_block_product item']")
    List<WebElement> products;

    public WebshopPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToWebshop() {
        driver.get("https://shop.idokep.hu");
    }

    public void clickOnProductThumbnail() {
        cameraThumbnail.click();
    }

    public void clickOnNextArrow() {
        browseNext.click();
    }

    public boolean isNextElementDisplayed() {
        return products.get(4).isDisplayed();
    }


}
