package com.company;

public abstract class Animal {
    protected String AnimalName;
    protected int AnimalAge;
    protected String AnimalSex;
    protected double AnimalPrice;
    protected double VisitPrice;
    Animal(String name,int age,String sex,double price){
        this.AnimalName=name;
        this.AnimalAge=age;
        this.AnimalSex=sex;
        this.AnimalPrice=price;
    }
    public abstract String toString();

}
