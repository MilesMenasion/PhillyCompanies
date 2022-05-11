package com.company;

public class PHLCo extends Companies{
    // fields
    private int rank;

    // constructors

    public PHLCo(String name, String hq, String industry, int rank) {
        super(name, hq, industry);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // methods
    void describe() {
        System.out.println("Meet " + getName() + ". It is a " + getIndustry() + " company based in " + getHeadquarters() + ". It is the " + rank + "th largest company in the US.");
    }
}