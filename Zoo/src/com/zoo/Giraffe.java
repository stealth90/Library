package com.zoo;

public class Giraffe extends Herbivore {

    public Giraffe(String name, int weight) {
        super(name, weight);
    }


    public void eat(int weight){
        int totEat=weight*10;
        System.out.println("Questo animale deve mangiare "+ totEat + " grammi di erba al giorno");
    }

}
