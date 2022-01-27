package com.company;

public class Tourist {
    protected String TouristName;
    protected int TouristMoney;
    protected int TouristVisitNumber;
    Tourist(String name,int money,int number){
        this.TouristName=name;
        this.TouristMoney=money;
        this.TouristVisitNumber=number;
    }
    @Override
    public String toString(){
        return "name of tourist is Biden,\n"+"He wants to see "+this.TouristVisitNumber+" kinds of animals,\n"+
                "and has "+this.TouristMoney+" dollars in cash.";
    }
}
