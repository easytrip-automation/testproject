package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserTripPage extends AbstractPage{


    @FindBy(xpath="//div[@class='edit-dates']")
    WebElement editDatesButton;

    @FindBy(xpath = "//div[@class='input-group mb-3 ml-6 mr-6']/a")
    WebElement saveEditedDateButton;

    @FindBy(xpath="//share-button[@button='facebook']//button")
    WebElement shareFacebookButton;

    //------------------------------------------------------------Route-------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-3']")
    WebElement routeLink;

    @FindBy(xpath = "//div[@class='tab-pane active ng-star-inserted']//a[1]")
    WebElement addDestinationButton;

    @FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Choose a country']")
    WebElement addDestinationCountryInput;

    @FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Choose a city']")
    WebElement addDestinationCityInput;

    // It seems that those buttons doesnt work
    @FindBy(xpath = "//span[@class='fa fa-plus']")
    WebElement PlusDaysButton;

    @FindBy(xpath = "//span[@class='fa fa-minus']")
    WebElement MinusDaysButton;

    @FindBy(xpath = "//div[@class='modal-footer']//a")
    WebElement addDestinationPopUpButton;

    @FindBy(xpath = "//div[@class='tab-pane active ng-star-inserted']//a[2]")
    WebElement saveAsTourButton;


    //---------------------------------------------Day By Day------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-4']")
    WebElement dayByDayLink;

    //At first day of trip -- please explore first day while writing your test
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]//div[@id='dropdownBasic1']")
    WebElement exploreThingsToDoDropDown;

    //You must change 'Los Angeles' to city you choose for your trip!!
    @FindBy(xpath = "//div[@class='d-inline-block explore-btn-block ng-star-inserted show dropdown']//span[text()='Los Angeles']")
    WebElement exploreThingsToDoByCityButton;

    //See details for first place of first day
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//a")
    WebElement seeDetailsButton;

    //remove first place for this day
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//button/span")
    WebElement removePlaceButton;

    //--------------------------------------------------Where to stay----------------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-5']")
    WebElement whereToStayLink;

    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]//div[@id='dropdownBasic2']")
    WebElement findLogingDropDown;

    @FindBy(xpath = "//div[@class='d-inline-block explore-btn-block ng-star-inserted show dropdown']//span[text()='Los Angeles']")
    WebElement findLogingByCityButton;

    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//a")
    WebElement seeDetailsOfLoging;

    @FindBy(xpath = "//a[@href='http://www.booking.com']")
    WebElement findHotelsLink;

    @FindBy(xpath = "//a[@href='http://www.airbnb.com']")
    WebElement findHomesLink;

    public void editDates(){
        editDatesButton.click();
    }

    public void saveEditedDate(){
        saveEditedDateButton.click();
    }

    public void shareWithFacebook(){
        shareFacebookButton.click();
    }

    public void goToRoute(){
        routeLink.click();
    }

    public void addDestination(){
        addDestinationButton.click();
    }

    public void setCountryDestination (String country){
        addDestinationCountryInput.sendKeys(country);
    }

    public void setCityDestination (String city){
        addDestinationCityInput.sendKeys(city);
    }

    public void saveDestinationInPouUpWindow(){
        addDestinationPopUpButton.click();
    }


    public void saveTour(){
        saveAsTourButton.click();
    }



    public void goToWhereToStay(){
        whereToStayLink.click();
    }

    //-------------------------------------------------Day By Day------------------------------------------------------------------------

    public void goToDayByDay(){
        dayByDayLink.click();
    }

    public void clickExploreThingsToDo(){
        exploreThingsToDoDropDown.click();
        exploreThingsToDoByCityButton.click();
    }

    public void seeDetailsForPlace () {
        seeDetailsButton.click();
    }

    public void removePlace (int index){
        removePlaceButton.click();
    }

    //------------------------------------Where to stay---------------------------------------------------------------------------
    public void clickfindLoging(){
        findLogingDropDown.click();
        findLogingByCityButton.click();
    }

    public void seeDetailsOfLoging(){
        seeDetailsOfLoging.click();
    }

    public void findHotels(){
        findHotelsLink.click();
    }

    public void findHomes(){
        findHomesLink.click();
    }


}
