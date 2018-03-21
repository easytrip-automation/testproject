package com.epam.lab.pageobjects;

import com.epam.lab.driver.DriverFactory;
import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EasyTripHomePage extends AbstractPage {
    public EasyTripHomePage() {

    }
    public void openEasyTripHomePage(){
        ConfigProperty configProperty = new ConfigProperty();
        DriverFactory.getDriver().get(configProperty.getLink());
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    private WebElement signInButton;








}
