package com.zoo;

public abstract class Carnivorous extends Animal  {


    public Carnivorous (String name, int weight) {
        super (name,weight);
    }
    public void typeEat (){
        System.out.println("Questo animale mangia carne");
    }
}
