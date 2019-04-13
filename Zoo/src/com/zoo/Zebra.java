package com.zoo;

public class Zebra extends Herbivore {
    public Zebra(String name, int weight) {
        super(name, weight);
    }

    public void eat(int weight){
        int totEat=weight*10;
        System.out.println("Questo animale mangerà "+ totEat + " grammi di erba al giorno");
    }
}
