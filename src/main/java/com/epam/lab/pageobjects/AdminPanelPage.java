package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPanelPage extends AbstractPage {

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[3]/div[2]/a")
    private WebElement adminPanelButton;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[2]/div/input")
    private WebElement searchUserInput;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/section/div/div/h1")
    private WebElement welcomeInscriptionWithAdminName;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[3]/div/div/table/tbody/tr")
    private List<WebElement> allUsers;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[3]/div/div/table/tbody/tr/td[5]/div/button[1]")
    private List<WebElement> deleteUserButtons;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[3]/div/div/table/tbody/tr/td[5]/div/button[2]")
    private List<WebElement> disabledUserButtons;

    @FindBy(xpath = "//*[@id='btnGroupDrop1']")
    private List<WebElement> dropDownMenuToChangeUserRoleButtons;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-users/section/div/div[3]/div/div/table/tbody/tr/td[5]/div/div/div/div/a")
    private List<WebElement> roleFromDropDownMenu;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-tours/section/div/div[2]/div/input")
    private WebElement searchToursInput;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-tours/section/div/div[3]/div/div/table/tbody/tr")
    private List<WebElement> allTours;

    @FindBy(xpath = "/html/body/app-root/app-admin-panel/app-manage-tours/section/div/div[3]/div/div/table/tbody/tr/td[5]/button")
    private List<WebElement> deleteTourButtons;

    public AdminPanelPage() {
        super();
    }

    public void clickAdminPanelButton() {
        adminPanelButton.click();
    }

    public void findUserByLogin(String login) {
        searchUserInput.click();
        searchUserInput.sendKeys(login);
    }

    public String getAdminName() {
        return welcomeInscriptionWithAdminName.getText().split(", ")[1];
    }

    public void deleteUser(int index) {
        deleteUserButtons.get(index).click();
    }

    public void disableUser(int index) {
        disabledUserButtons.get(index).click();
    }

    public void changeUserRole(int index) {
        dropDownMenuToChangeUserRoleButtons.get(index).click();
        roleFromDropDownMenu.get(index).click();
    }

    public void searchTour(String eny) {
        searchToursInput.sendKeys(eny);
    }

    public void openTour(int index) {
        allTours.get(index).click();
    }

    public void deleteTour(int index) {
        deleteTourButtons.get(index).click();
    }
}
