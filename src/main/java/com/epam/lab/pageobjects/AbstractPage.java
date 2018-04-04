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

    public void openPage(String pageURL) {
        driver.get(pageURL);
    }

    public String getTitle (){
        return driver.getTitle();
    }

    public void waitUntilTitleContains(String title ) {
        getWait().until(ExpectedConditions.titleContains(title));
    }

    public void waitUntilClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilTitleIs(String title) {
        getWait().until(ExpectedConditions.titleIs(title));
    }

    public void waitUntilAttributeToBe(WebElement element, String attribute, String attributeValue) {
        getWait().until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
    }

}
