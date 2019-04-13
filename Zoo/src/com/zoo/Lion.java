package com.zoo;

public  class Lion extends Carnivorous {
    public Lion(String name, int weight) {
        super(name, weight);
    }

    public void eat(int weight){
        int totEat=weight*10;
        System.out.println("Questo animale mangerà "+ totEat + " grammi al giorno");
    }
}
