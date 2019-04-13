package com.zoo;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, int weight) {
        super(name, weight);
    }

    public void typeEat() {
        System.out.println("Questo animale mangia erba");
    }
}
