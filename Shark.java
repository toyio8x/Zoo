package com.company;

public class Shark extends Animal{
    Shark(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        this.VisitPrice=350;
    }

    @Override
    public String toString() {
        return "Sharks here! Cost 350$.";
    }
}
