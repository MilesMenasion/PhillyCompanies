package com.company;

public class PHLCo {
    String Name;
    String City;
    String Industry;
    int Rank;

    void describe() {
        System.out.println("Meet " + Name + ". It is a " + Industry + " company based in " + City + ". It is the " + Rank + "th largest company in the US.");
    }
}