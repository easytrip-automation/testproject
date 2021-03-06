package com.epam.lab.pageobjects;

import com.epam.lab.driver.DriverFactory;
import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    public HomePage() {
        super();
    }

    public void openEasyTripHomePage() {
        ConfigProperty configProperty = new ConfigProperty();
        DriverFactory.getDriver().get(configProperty.getLink());
    }

    @FindBy(xpath = "/html/body")
    private WebElement body;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    private WebElement signInButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[2]/div/div[2]/form/fieldset/div[1]/input")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1\"]")
    private WebElement passwordInputField;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[2]/div/div[2]/form/fieldset/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[3]/a[1]")
    private WebElement signUpButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-login/div[3]/a[2]")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    private WebElement yourProfileButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[1]/button/span")
    private WebElement closeProfileButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[3]/div/a")
    private WebElement manageProfileButton;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[2]/div/div/form/button")
    private WebElement updateButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-profile/div[2]/div/div/form/a")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//*[@id=\"oldPassword\"]")
    private WebElement oldPasswordInput;

    @FindBy(xpath = "//*[@id=\"newPassword\"]")
    private WebElement newPasswordInput;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-change-password/div[3]/div/a")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"carouselExampleCaptions\"]/div/div[1]/div/app-planning-form/a")
    private WebElement planYourTripButton;

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement signUpUserNameField;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement signUpFirstNameField;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement signUpLastNameField;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement signUpEmailField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement signUpPasswordField;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-register/div[2]/div/div[2]/form/button")
    private WebElement signUpCreateAccountButton;

    public void signUpCreateAccount() {
        signUpCreateAccountButton.click();
    }

    public void signUpConfirmPassword(String pass) {
        confirmPasswordField.sendKeys(pass);
    }


    public void signUpPassword(String pass) {
        signUpPasswordField.sendKeys(pass);
    }

    public void signUpEmail(String email) {
        signUpEmailField.sendKeys(email);
    }

    public void signUpLastName(String lastName) {
        signUpLastNameField.sendKeys(lastName);
    }

    public void signUpFillFirstName(String firstName) {
        signUpFirstNameField.sendKeys(firstName);
    }

    public void signUpFillUsername(String name) {
        signUpUserNameField.sendKeys(name);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void enterUserName(String username) {
        userNameInput.sendKeys(username);
    }

    public void enterPassword(String pass) {
        passwordInputField.sendKeys(pass);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
        waitUntilAttributeToBe(body, "class", "");
    }

    public boolean isEnterPasswordFieldPresent() {
        return passwordInputField.isDisplayed();
    }

    public void clickSignUp() {
        signUpButton.click();
    }

    public void clickForgotPasswordButton() {
        forgotPasswordButton.click();
    }

    public void goToProfile() {
        yourProfileButton.click();
    }

    public void clickCloseProfileButton() {
        closeProfileButton.click();
    }

    public void clickManageProfileButton() {
        manageProfileButton.click();
    }

    public void editUserName(String newName) {
        firstNameField.clear();
        firstNameField.sendKeys(newName);
    }

    public void editLastName(String newName) {
        lastNameField.clear();
        lastNameField.sendKeys(newName);
    }

    public void editEmail(String newEmail) {
        emailField.clear();
        emailField.sendKeys(newEmail);
    }

    public void saveChanges() {
        updateButton.click();
    }

    public void clickChangePasswordButton() {
        changePasswordButton.click();
    }

    public void enterOldPassword(String oldPass) {
        oldPasswordInput.sendKeys(oldPass);
    }

    public void enterNewPassword(String newPass) {
        newPasswordInput.sendKeys(newPass);
    }

    public void saveChangedPassword() {
        saveButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void clickPlanYourTripButton() {
        planYourTripButton.click();
    }
}
