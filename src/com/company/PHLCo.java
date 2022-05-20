package com.company;

public class PHLCo extends Companies{
    // fields
    private int rank;

    // constructors

    public PHLCo(String name, String hq, String industry, int rank) {
        super(name, industry, hq);
        this.rank = rank;
    }

    protected int getRank() {
        return rank;
    }

    protected void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Meet " + getName() + ". It is a " + getIndustry() + " company based in " + getHeadquarters() + ". It is the " + rank + "th largest company in the US.";
    }
    // methods
}