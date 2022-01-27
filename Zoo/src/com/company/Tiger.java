package com.company;

public class Tiger extends Animal{

    Tiger(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        this.VisitPrice=340;
    }

    @Override
    public String toString() {
        return "Tiger here! Cost 340$!";
    }

}
