package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminTripsPage extends AbstractPage {
    //   http://localhost:4200/admin-panel
//todo

    @FindBy(xpath = "//input[@class='form-control input-sm']")
            /*/html/body/app-root/app-admin-panel/app-manage-tours/section/div/div[2]/div/input*/
            WebElement searchTripAdminInput;

    @FindBy(xpath = "//div[@class='form-control input-sm ng-pristine ng-valid ng-touched']")
            /*/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[2]/div/input*/
            WebElement searchUserAdminInput;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-small-custom']")
    WebElement roleUserButton;

    @FindBy(xpath = "//button[@class='btn btn-block btn-small-custom ng-star-inserted']")
    WebElement disableUserButton;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-small-custom']")
    WebElement closeUserButton;

    public void setTripToSearch(String tripName) {
        searchTripAdminInput.sendKeys(tripName);
    }

    public void setUserSearch(String userName) {
        searchUserAdminInput.sendKeys(userName);
    }

    public void findRole() {
        roleUserButton.click();
    }

    public void setUserDisable() {
        disableUserButton.click();
    }

    public void setUserBlocked() {
        closeUserButton.click();
    }
}






