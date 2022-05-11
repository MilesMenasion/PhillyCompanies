package com.company;
public class USCompanies extends Companies {

    //Fields
    private double revenue;
    private double revenuegrowth;


    public USCompanies(String name, String industry, String headquarters, double revenue, float revenuegrowth) {
        super(name, industry, headquarters);
        this.revenue = revenue;
        this.revenuegrowth = revenuegrowth;
    }

    public String toString() {
        return "This company is called " + getName() + ", and it's industry is " + getIndustry() + ".";
    }


}
