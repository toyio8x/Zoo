package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Zoo implements Manager{
    private int ZooFinance;
    private ArrayList<Animal> AnimalList = new ArrayList<>();
    private ArrayList<Tourist> TouristList = new ArrayList<>();
    public void SetFinance(int f){
        this.ZooFinance=f;
    }
    @Override
    public void AdoptAnimal(Animal animal) {
        AnimalList.add(animal);
    }

    @Override
    public void TouristService(Tourist tourist) {
        TouristList.add(tourist);
        Random r=new Random();
        if(AnimalList.size()<=0) throw new AnimalNotFoundException("园内无动物可看！");
        else{
            for(int i=0;i<tourist.TouristVisitNumber;i++){
                int n1=r.nextInt(AnimalList.size());
                Animal a1=AnimalList.get(n1);
                System.out.println(a1.toString());
                this.ZooFinance+=a1.VisitPrice;
            }

        }

    }

    @Override
    public void Close() {
        double TotalPrice=0;
        for(Animal a2:AnimalList){
            TotalPrice+=a2.AnimalPrice;
        }
        this.ZooFinance-=TotalPrice;
        if(this.ZooFinance >= 0){
            for(Tourist t1:TouristList){
                System.out.println("Guests today:"+t1.TouristName);
            }
            System.out.println("Cash:"+this.ZooFinance);
        }
        else throw new InsufficientBalanceException("开销大于现金！");
    }
}
