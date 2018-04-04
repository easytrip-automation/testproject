package com.epam.lab.pageobjects;

import com.epam.lab.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class AbstractPage {
    private WebDriver driver;

    AbstractPage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    private WebDriverWait getWait() {
        return (new WebDriverWait(driver, 30));
    }

    void openPage(String pageURL) {
        driver.get(pageURL);
    }

    String getTitle (){
        return driver.getTitle();
    }

    void waitUntilTitleContains(String title ) {
        getWait().until(ExpectedConditions.titleContains(title));
    }

    void waitUntilClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    void waitUntilVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    void waitUntilTitleIs(String title) {
        getWait().until(ExpectedConditions.titleIs(title));
    }

    void waitUntilAttributeWillNotPresent(WebElement element, String attribute, String attributeValue) {
        getWait().until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
    }

}
