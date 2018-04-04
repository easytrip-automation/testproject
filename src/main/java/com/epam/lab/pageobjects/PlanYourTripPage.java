package com.epam.lab.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
http://localhost:4200/#
*/

public class PlanYourTripPage extends AbstractPage {

    @FindBy(css = "a[class='btn btn-primary btn-capsul px-4 py-2']")
    private WebElement planYourTripButton;

    @FindBy(css = "#typeahead-template")
    private WebElement countryInput;

    @FindBy(css = ".form-control.ng-pristine")
    private WebElement cityInput;

    @FindBy(css = ".btn.btn-primary.btn-capsul.px-4.py-2.btn-block")
    private WebElement seeYorPlanButton;


    @FindBy(css = ".dropdown-item.active")
    private WebElement dropDownMenu;


    public void planTrip() {
        planYourTripButton.click();
    }

    public void addCountry(String country) {
        countryInput.sendKeys(country);
        dropDownMenu.click();
    }

    public void addCity(String city) {
        cityInput.sendKeys(city + Keys.ENTER);
        dropDownMenu.click();
    }

    public void seePlan() {
        seeYorPlanButton.click();
    }
}
