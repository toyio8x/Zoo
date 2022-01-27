package com.company;

public class SennPai extends Animal{
    SennPai(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        this.VisitPrice=514;
    }
    @Override
    public String toString() {
        return "24歳,学生です!やりますね!";
    }
}
