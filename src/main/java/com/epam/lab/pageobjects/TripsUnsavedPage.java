package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
http://localhost:4200/trips/unsaved
*/

public class TripsUnsavedPage extends AbstractPage {
    @FindBy(css = ".btn")
    private WebElement saveTripButton;

    public void saveTrip() {
        saveTripButton.click();
    }
}
