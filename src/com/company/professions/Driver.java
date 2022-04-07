package com.company.professions;

class Person {
    public String fullname;
    public int age;

    @Override
    public String toString(){
        return "Person: " +
                this.fullname +
                " "  + this.age + " years old";
    }
}

public class Driver extends Person{
    int drivingExperience;
    @Override
    public String toString(){
        return "Driver: " +
                this.fullname +
                " "  + this.age + " years old";
    }
}