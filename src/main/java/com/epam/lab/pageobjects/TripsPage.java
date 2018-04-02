package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
http://localhost:4200/trips
*/

public class TripsPage extends AbstractPage {
    @FindBy(css = ".fa.fa-trash-o")
    private WebElement deleteTripButton;

    @FindBy(css = ".btn")
    private WebElement viewButton;

    public void deleteTrip() {
        deleteTripButton.click();
    }

    public void openTrip() {
        viewButton.click();
    }
}
