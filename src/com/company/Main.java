package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is a list of the largest companies");

        PHLCo Co1 = new PHLCo("AmerisourceBergen","Conshohocken, PA", "Pharmaceutical",10);
        Co1.describe();

        USCompanies Company1 = new USCompanies("Walmart", "Retail", "Bentonville, Arkansas,", 559200000, 1.9f);
        Company1.describe();
        //miles wuz here
    }
}