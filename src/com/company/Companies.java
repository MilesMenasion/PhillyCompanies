package com.company;

public class Companies {
    // fields
    private String name;
    private String industry;
    private String headquarters;

    // constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Companies(String name, String industry, String headquarters) {
        this.name = name;
        this.industry = industry;
        this.headquarters = headquarters;

    }
}
