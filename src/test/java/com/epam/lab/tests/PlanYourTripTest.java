package com.epam.lab.tests;

import com.epam.lab.businesobjects.TripsBO;
import com.epam.lab.driver.DriverFactory;
import com.epam.lab.pageobjects.PlanYourTripPage;
import com.epam.lab.utils.property.ConfigProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlanYourTripTest {

    private TripsBO tripsBO;

    @BeforeMethod
    public void setUp() {
        tripsBO = new TripsBO();
        ConfigProperty properties = new ConfigProperty();
        DriverFactory.getDriver().get(properties.getLink());
    }

    @Test
    public void createTrip() {
        tripsBO.planTrip("Ukrai","Lvi");
        tripsBO.seePlan();
        //todo
    }

    @AfterMethod
    public void closeDriver() {
        DriverFactory.close();
    }
}
