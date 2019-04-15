package com.zoo;

public class Monkey extends Animal implements Onnivorous{
    private double propMeal=0.07;
    private double propVegetable=0.05;

    public Monkey(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needMeat() {
        return super.getWeight() * this.propMeal;
    }

    @Override
    public double needVegetable() {
        return super.getWeight() * this.propVegetable;
    }
}
