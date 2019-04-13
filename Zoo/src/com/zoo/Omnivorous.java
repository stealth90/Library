package com.zoo;

public abstract class Omnivorous extends Animal  {

    public Omnivorous (String name, int weight) {
        super (name,weight);
    }
    public void typeEat (){
        System.out.println("Questo animale mangia sia carne che erba");
    }
}
