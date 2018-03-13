package com.epam.lab.driver;


import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class DriverFactory {
    private static WebDriver driver;
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";

    private DriverFactory() {
    }

    private static void setWait(WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    private static WebDriverWait getWait() {
        return (new WebDriverWait(driver, 20));
    }

    public static void waitToBeClickable(WebElement element) {
        DriverFactory.getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    private static void createDriver(String browser) {
        if (driver == null) {
            if (CHROME.equals(browser)) {
                ConfigProperty configProperty = new ConfigProperty();
                System.setProperty(configProperty.getChromeDriver(), configProperty.getUrl());
                driver = new ChromeDriver();
                setWait(driver);

            } else if (FIREFOX.equals(browser)) {
                DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
                capabilitiesFirefox.setCapability("marionette", false);
                driver = new FirefoxDriver(capabilitiesFirefox);
                setWait(driver);

            } else throw new IllegalArgumentException("Invalid browser property set in configuration file");


        }
    }

    public static void close() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            createDriver(browser);
        }
        return driver;
    }


}
