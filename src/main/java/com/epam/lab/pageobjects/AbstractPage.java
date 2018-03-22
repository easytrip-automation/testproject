package com.epam.lab.pageobjects;


import com.epam.lab.driver.DriverFactory;
import org.openqa.selenium.support.PageFactory;

abstract class AbstractPage {
    AbstractPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
