package com.company.details;

public class Engine {
    public int power;
    public String brand;

    @Override
    public String toString(){
        return "Engine: " + this.brand
                + " " + this.power + " h.p.";
    }
}

