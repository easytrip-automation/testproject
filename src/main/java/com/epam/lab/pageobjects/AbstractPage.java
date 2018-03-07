package com.epam.lab.pageobjects;



import com.epam.lab.driver.Driver;

import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.support.PageFactory;

abstract class AbstractPage {

    AbstractPage() {
        ConfigProperty configProperty = new ConfigProperty();
        System.setProperty(configProperty.getChromeDriver(), configProperty.getUrl());
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
