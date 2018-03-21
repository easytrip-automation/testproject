package com.epam.lab.driver;


import com.epam.lab.utils.property.ConfigProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final String CHROME = "chrome";
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

    private static void createDriver() {
        if (driver == null) {
            ConfigProperty configProperty = new ConfigProperty();
            System.setProperty(configProperty.getChromeDriver(), configProperty.getUrl());
            ChromeOptions options = new ChromeOptions();
            options.addExtensions(new File(configProperty.getChromeExtension()));
            driver = new ChromeDriver(options);
            setWait(driver);
            driver.manage().window().maximize();
            clickOnPlugin();
        } else throw new IllegalArgumentException("Invalid browser property set in configuration file");
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

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    private static void clickOnPlugin() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int ppi = Toolkit.getDefaultToolkit().getScreenResolution();

        double width = dimension.getWidth();
        double mulCoeff = 1.25;
        int x = 64;
        int y = 58;

        try {
            Robot r = new Robot();
            r.mouseMove(0, 0);

            if (ppi > 96) {
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
