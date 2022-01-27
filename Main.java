package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zoo z1 = new Zoo();
        z1.SetFinance(10000);
        Panda p1 = new Panda("Sunny",5,"雌性",2000);
        z1.AdoptAnimal(p1);
        Shark s1 = new Shark("Lance",6,"雄性",3400);
        z1.AdoptAnimal(s1);
        SennPai SP = new SennPai("田所先辈",24,"一般男性",114);
        z1.AdoptAnimal(SP);
        Scorpion SC = new Scorpion("xenon",2,"雄性",150);
        z1.AdoptAnimal(SC);
        Tiger TG = new Tiger("kala",4,"雌性",1000);
        z1.AdoptAnimal(TG);
        Tourist t1 = new Tourist("Tony",2000,2);
        z1.TouristService(t1);
        z1.Close();
    }
}
