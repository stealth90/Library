package com.zoo;

public class Monkey extends Omnivorous {
    public Monkey(String name, int weight) {
        super(name, weight);
    }

    public void eat(int weight){
        int totMealEat=weight*10;
        int totGrassEat=weight*5;
        System.out.println("Questo animale mangerà "+ totMealEat + " grammi di carne al giorno e "
                + totGrassEat + " grammi di erba al giorno.");
    }
}
