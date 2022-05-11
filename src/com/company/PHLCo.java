package com.company;

public class PHLCo extends Companies{
    // fields
    private int rank;

    // constructors

    public PHLCo(String name, String hq, String industry, int rank) {
        super(name, industry, hq);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Meet " + getName() + ". It is a " + getIndustry() + " company based in " + getHeadquarters() + ". It is the " + rank + "th largest company in the US.";
    }
    // methods
}