package com.zoo;

public class Zebra extends Animal implements Herbivore {
    public double prop= 0.2;
    public Zebra(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needVegetable() {
        return this.prop * super.getWeight();
    }
}
