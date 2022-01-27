package com.company;

public class Panda extends Animal {
    protected boolean isFat;
    Panda(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        this.VisitPrice=200;
    }
    @Override
    public String toString() {
        return "Pandas here! Cost 200$.";
    }
    public void setFat(boolean fat){
        this.isFat=fat;
    }

}
