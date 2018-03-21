package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacePage {

    //http://localhost:4200/places/ChIJgfk0NV7GwoAR4ja9LMYRY0s


    @FindBy(xpath = "//div[@class='col-md-12']/h2")
    WebElement placeNameTextField;

    //verify correct place is displayed
    public void getPlaceName(){
        placeNameTextField.getAttribute("innerHTML");
    }
}
