package com.company;

public class Scorpion extends Animal{

    Scorpion(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        this.VisitPrice=200;
    }

    @Override
    public String toString() {
        return "Scorpion here! Cost 200$!";
    }
}
