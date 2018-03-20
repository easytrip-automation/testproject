package com.epam.lab.pageobjects;


import com.epam.lab.driver.DriverFactory;
import org.openqa.selenium.support.PageFactory;

abstract class AbstractPage {


    AbstractPage(String browser) {
        PageFactory.initElements(DriverFactory.getDriver(browser), this);
    }
}
