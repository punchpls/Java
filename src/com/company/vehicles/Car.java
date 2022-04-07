package com.company.vehicles;

import com.company.details.*;
import com.company.professions.*;

public class Car{
    public String brand;
    public String autoClass;
    public int weight;
    public Driver driver;
    public Engine engine;

    public void start(){
        System.out.println("Go");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn Left");
    }
    public void printInfo(){
        System.out.println(this);
        System.out.println(this.engine);
        System.out.println(this.driver);
    }
    @Override
    public String toString(){
        return "Auto's brand: " + this.brand +
                "\nAuto's class: " + this.autoClass +
                "\nAuto's weight: " + this.weight;
    }
}

class Lorry extends Car{
    public int carrying;

    public String toString(){
        return "Lorry's brand: " + this.brand +
                "\nLorry's class: " + this.autoClass +
                "\nLorry's weight: " + this.weight +
                "\nLorry's carrying: " + this.carrying;
    }
}

class SportCar extends Car{
    public int speed;

    public String toString(){
        return "Sportcar's brand: " + this.brand +
                "\nSportcar's class: " + this.autoClass +
                "\nSportcar's weight: " + this.weight +
                "\nSportcar's carrying: " + this.speed;
    }
}
