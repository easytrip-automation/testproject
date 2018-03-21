package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExplorePlacesPage  extends  AbstractPage {

    //http://localhost:4200/trips/1/places/explore?city=Los%20Angeles


    @FindBy(xpath = "//div[text()=' Back to trip ']")
    WebElement backToTripButton;

    // Change label number to change type of place
    @FindBy(xpath = "//div[@class='types']/label[1]/input")
    WebElement placeCheckbox;

    @FindBy(xpath = "//input[@class='form-control mr-sm-2']")
    WebElement searchPlaceInput;

    @FindBy(xpath = "//div[@class='row-block']//li[1]//div[@class='offset-md-2 col-md-2']//a")
    WebElement addPlaceDropDown;

    @FindBy(xpath = "//div[@class='row-block']//li[1]//div[@class='offset-md-2 col-md-2']//button[1]")
    WebElement addPlaceToDayButton;

    public void goBackToTrip(){
        backToTripButton.click();
    }

    public void choosePlaceType(){
        placeCheckbox.click();
    }

    public void addPlaceToDay(){
        addPlaceDropDown.click();
        addPlaceToDayButton.click();
    }

    public void setPlaceToSearch(String placeName){
        searchPlaceInput.sendKeys(placeName);
    }
}
