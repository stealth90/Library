package com.zoo;

public class Tiger extends Carnivorous{
    public Tiger(String name, int weight) {
        super(name, weight);
    }

    public void eat(int weight){
        int totEat=weight*20;
        System.out.println("Questo animale mangerà "+ totEat + " grammi di carne al giorno");
    }
}
