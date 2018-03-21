package com.epam.lab.driver;


import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static WebDriver driver;

    private DriverFactory() {
    }

    private static WebDriverWait getWait() {
        return (new WebDriverWait(driver, 20));
    }

    private static void setWait(WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    public static void waitToBeClickable(WebElement element) {
        DriverFactory.getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    private static void createDriver(String browser) {
        if (driver == null) {
            if (CHROME.equals(browser)) {
                ConfigProperty configProperty = new ConfigProperty();
                System.setProperty(configProperty.getChromeDriver(), configProperty.getUrl());
                ChromeOptions options = new ChromeOptions();
                options.addExtensions(new File(configProperty.getChromeExtension()));
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                driver = new ChromeDriver(capabilities);
                setWait(driver);
                driver.manage().window().maximize();
                clickOnPlugin();
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

    private static void clickOnPlugin() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        double width = dimension.getWidth();
        double height = dimension.getHeight();
        double mulCoeff = 1.25;
        int x = 64;
        int y = 58;

        try {
            Robot r = new Robot();
            r.mouseMove(0, 0);

            if (width > 1600 || height > 960) {
                width /= mulCoeff;
                r.mouseMove((int) (width - x / mulCoeff), (int) (y / mulCoeff));
            } else {
                r.mouseMove((int) (width - x), y);
            }

            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
