package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is a list of the largest companies");

        new PHLCo("AmerisourceBergen","Conshohocken, PA", "Pharmaceutical",10);
        new USCompanies("Walmart", "Retail", "Bentonville, Arkansas,", 559200000, 1.9f);
        Companies.describeAll();


    }
}