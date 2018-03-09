package com.epam.lab.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static void createDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static void close() {
        if (getDriver() != null) {
            try {
                getDriver().quit();
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
}
