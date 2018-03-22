package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserTripPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='edit-dates']")
    private WebElement editDatesButton;

    @FindBy(xpath = "//div[@class='input-group mb-3 ml-6 mr-6']/a")
    private WebElement saveEditedDateButton;

    @FindBy(xpath = "//share-button[@button='facebook']//button")
    private WebElement shareFacebookButton;

    //------------------------------------------------------------Route-------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-3']")
    private WebElement routeLink;

    @FindBy(xpath = "//div[@class='tab-pane active ng-star-inserted']//a[1]")
    private WebElement addDestinationButton;

    @FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Choose a country']")
    private WebElement addDestinationCountryInput;

    @FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Choose a city']")
    private WebElement addDestinationCityInput;

    // It seems that those buttons doesnt work
    @FindBy(xpath = "//span[@class='fa fa-plus']")
    private WebElement PlusDaysButton;

    @FindBy(xpath = "//span[@class='fa fa-minus']")
    private WebElement MinusDaysButton;

    @FindBy(xpath = "//div[@class='modal-footer']//a")
    private WebElement addDestinationPopUpButton;

    @FindBy(xpath = "//div[@class='tab-pane active ng-star-inserted']//a[2]")
    private WebElement saveAsTourButton;

    //---------------------------------------------Day By Day------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-4']")
    private WebElement dayByDayLink;

    //At first day of trip -- please explore first day while writing your test
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]//div[@id='dropdownBasic1']")
    private WebElement exploreThingsToDoDropDown;

    //You must change 'Los Angeles' to city you choose for your trip!!
    @FindBy(xpath = "//div[@class='d-inline-block explore-btn-block ng-star-inserted show dropdown']//span[text()='Los Angeles']")
    private WebElement exploreThingsToDoByCityButton;

    //See details for first place of first day
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//a")
    private WebElement seeDetailsButton;

    //remove first place for this day
    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//button/span")
    private WebElement removePlaceButton;

    //--------------------------------------------------Where to stay----------------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='ngb-tab-5']")
    private WebElement whereToStayLink;

    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]//div[@id='dropdownBasic2']")
    private WebElement findLogingDropDown;

    @FindBy(xpath = "//div[@class='d-inline-block explore-btn-block ng-star-inserted show dropdown']//span[text()='Los Angeles']")
    private WebElement findLogingByCityButton;

    @FindBy(xpath = "//div[@class='col-md-12 ng-star-inserted']/div[1]/ul/li[1]//a")
    private WebElement seeDetailsOfLoging;

    @FindBy(xpath = "//a[@href='http://www.booking.com']")
    private WebElement findHotelsLink;

    @FindBy(xpath = "//a[@href='http://www.airbnb.com']")
    private WebElement findHomesLink;

    public void editDates() {
        editDatesButton.click();
    }

    public void saveEditedDate() {
        saveEditedDateButton.click();
    }

    public void shareWithFacebook() {
        shareFacebookButton.click();
    }

    public void goToRoute() {
        routeLink.click();
    }

    public void addDestination() {
        addDestinationButton.click();
    }

    public void setCountryDestination(String country) {
        addDestinationCountryInput.sendKeys(country);
    }

    public void setCityDestination(String city) {
        addDestinationCityInput.sendKeys(city);
    }

    public void saveDestinationInPouUpWindow() {
        addDestinationPopUpButton.click();
    }

    public void saveTour() {
        saveAsTourButton.click();
    }

    public void goToWhereToStay() {
        whereToStayLink.click();
    }

    //-------------------------------------------------Day By Day------------------------------------------------------------------------

    public void goToDayByDay() {
        dayByDayLink.click();
    }

    public void clickExploreThingsToDo() {
        exploreThingsToDoDropDown.click();
        exploreThingsToDoByCityButton.click();
    }

    public void seeDetailsForPlace() {
        seeDetailsButton.click();
    }

    public void removePlace(int index) {
        removePlaceButton.click();
    }

    //------------------------------------Where to stay---------------------------------------------------------------------------
    public void clickFindLodging() {
        findLogingDropDown.click();
        findLogingByCityButton.click();
    }

    public void seeDetailsOfLodging() {
        seeDetailsOfLoging.click();
    }

    public void findHotels() {
        findHotelsLink.click();
    }

    public void findHomes() {
        findHomesLink.click();
    }
}
