package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPanelPage extends AbstractPage {

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[3]/div[2]/a")
    private WebElement adminPanelButton;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[2]/div/input")
    private WebElement searchUserInput;


}
