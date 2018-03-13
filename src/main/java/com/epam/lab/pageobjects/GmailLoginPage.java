package com.epam.lab.pageobjects;



import com.epam.lab.driver.DriverFactory;
import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.epam.lab.driver.DriverFactory.waitToBeClickable;

public class GmailLoginPage extends AbstractPage {
    @FindBy(css = "input[type='email']")
    private WebElement emailInput;

    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;

    public GmailLoginPage(String browser) {
        super(browser);
    }

    public void openLoginPage(String browser) {
        ConfigProperty configProperty = new ConfigProperty();
        DriverFactory.getDriver(browser).get(configProperty.getGmailLink());
    }

    public void enterEmail(String mail) {
        emailInput.sendKeys(mail + Keys.ENTER);
      //  waitToBeClickable(passwordInput);
    }

    public void enterPassword(String pass) {
        passwordInput.sendKeys(pass + Keys.ENTER);
    }
}
