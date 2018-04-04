package com.epam.lab.businesobjects;

import com.epam.lab.pageobjects.PlanYourTripPage;

public class TripsBO {
    private PlanYourTripPage  planYourTripPage;

    public TripsBO(){
        planYourTripPage = new PlanYourTripPage();
    }

 public void planTrip(String country,String city){
     planYourTripPage.planTrip();
     planYourTripPage.addCountry("Ukrai");
     planYourTripPage.addCity("Lvi");
 }

 public void seePlan(){
     planYourTripPage.seePlan();
 }
}
