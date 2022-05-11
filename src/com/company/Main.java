package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is a list of the largest companies");

        PHLCo Co1 = new PHLCo("AmerisourceBergen","Conshohocken, PA", "Pharmaceutical",10);
        System.out.println(Co1);


        USCompanies Company1 = new USCompanies("Walmart", "Retail", "Bentonville, Arkansas,", 559200000, 1.9f);
        System.out.println(Company1);

    }
}