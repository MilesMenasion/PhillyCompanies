package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is a list of the largest companies");

        PHLCo Co1 = new PHLCo();
        Co1.Name = "AmerisourceBergen";
        Co1.City = "Conshohocken, PA";
        Co1.Industry = "Pharmaceutical";
        Co1.Rank = 10;
        Co1.describe();


        USCompanies Company1 = new USCompanies();
        Company1.name = "Walmart";
        Company1.industy = "Retail";
        Company1.revenue = 559200000;
        Company1.revenuegrowth = 1.9f;
        Company1.headquarters = "Bentonville, Arkansas";
        Company1.describe();

    }
}