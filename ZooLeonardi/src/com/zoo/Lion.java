package com.zoo;

public class Lion extends Animal implements Carnivorous{
    public double prop=0.1;

    public Lion(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needMeat(){
        return super.getWeight() * this.prop;
    }
}
