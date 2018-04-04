package com.epam.lab.pageobjects;

import com.epam.lab.driver.DriverFactory;
import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EasyTripHomePage extends AbstractPage {
    public EasyTripHomePage() {

    }

    public void openEasyTripHomePage() {
        ConfigProperty configProperty = new ConfigProperty();
        DriverFactory.getDriver().get(configProperty.getLink());
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    private WebElement signInButton;

    public void clickSignInButton() {
        signInButton.click();
    }

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1\"]")
    private WebElement userNameInput;

    public void enterUserName(String username) {
        userNameInput.sendKeys(username);
    }

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1\"]")
    private WebElement passwordInputField;

    public void enterPasword(String pass) {
        passwordInputField.sendKeys(pass);
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[2]/div/div[2]/form/fieldset/button")
    private WebElement submitButton;

    public void clickSubmitButton() {
        submitButton.click();
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[3]/a[1]")
    private WebElement signUpButton;

    public void clickSignUp() {
        signUpButton.click();
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[3]/a[2]")
    private WebElement forgotPasswordButton;

    public void clickForgotPasswordButton() {
        forgotPasswordButton.click();
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    private WebElement yourProfileButton;

    public void goToProfile() {
        yourProfileButton.click();
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[1]/button/span")
    private WebElement closeProfileButton;

    public void clickCloseProfileButton() {
        closeProfileButton.click();
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[3]/div/a")
    private WebElement manageProfileButton;

    public void clickManageProfileButton() {
        manageProfileButton.click();
    }

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    public void editUserName(String newName) {
        firstNameField.clear();
        firstNameField.sendKeys(newName);
    }

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    public void editLastName(String newName) {
        lastNameField.clear();
        lastNameField.sendKeys(newName);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    public void editEmail(String newEmail) {
        emailField.clear();
        emailField.sendKeys(newEmail);
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[2]/div/div/form/button")
    private WebElement updateButton;

    public void saveChanges() {
        updateButton.click();
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[2]/div/div/form/a")
    private WebElement changePasswordButton;

    public void clickChangePasswordButton() {
        changePasswordButton.click();
    }

    @FindBy(xpath = "//*[@id=\"oldPassword\"]")
    private WebElement oldPasswordInput;

    public void enterOldPassword(String oldPass) {
        oldPasswordInput.sendKeys(oldPass);
    }

    @FindBy(xpath = "//*[@id=\"newPassword\"]")
    private WebElement newPasswordInput;

    public void enterNewPassword(String newPass) {
        newPasswordInput.sendKeys(newPass);
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-change-password/div[3]/div/a")
    private WebElement saveButton;

    public void saveChangedPassword() {
        saveButton.click();
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    private WebElement logoutButton;

    public void clickLogoutButton() {
        logoutButton.click();
    }
    @FindBy(xpath = "//*[@id=\"carouselExampleCaptions\"]/div/div[1]/div/app-planning-form/a")
    private WebElement planYourTripButton;

    public void clickPlanYourTripButton(){
        planYourTripButton.click();
    }
}
