package com.epam.lab.pageobjects;


import com.epam.lab.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class AbstractPage {
    public WebDriver driver;

    AbstractPage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
}
