package com.company;

import java.util.ArrayList;

public class Companies {
    // fields
    static private ArrayList<Companies> allMyCompanies;
    private String name;
    private String industry;
    private String headquarters;

    // constructor


    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getIndustry() {
        return industry;
    }

    protected void setIndustry(String industry) {
        this.industry = industry;
    }

    protected String getHeadquarters() {
        return headquarters;
    }

    protected void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Companies(String name, String industry, String headquarters) {
        this.name = name;
        this.industry = industry;
        this.headquarters = headquarters;
        if (allMyCompanies == null) {
            allMyCompanies = new ArrayList<Companies>();
        }
        allMyCompanies.add(this);
    }

    static void describeAll() {
        System.out.println(allMyCompanies);
    }

}
