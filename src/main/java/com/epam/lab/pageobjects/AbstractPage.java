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
        PageFactory.initElements(driver = DriverFactory.getDriver(), this);
    }

    private WebDriverWait getWait() {
        return (new WebDriverWait(driver, 30));
    }

    void openPage(String pageURL) {
        driver.get(pageURL);
    }

    String  getTitle (){
        return driver.getTitle();
    }

    void waitUntilTitleIs(String title ) {
        getWait().until(ExpectedConditions.titleIs(title));
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
}
