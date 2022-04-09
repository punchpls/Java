package com.company.details;

public class Engine {
    // приватные поля и геттеры-сеттеры
    public int power;
    public String brand;

    @Override
    public String toString(){
        // что за навязчивое желание разбивать на несколько строк?)
        return "Engine: " + this.brand
                + " " + this.power + " h.p.";
    }
}

