package com.zoo;

import java.util.ArrayList;

public  class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name=name;
        this.weight=weight;
    }

    public void print ()
    {
        System.out.println("Nome dell'animale: " + name + "Peso: " + weight);
    }

    public void typeEat(){ }

    public void eat(int weight) { }

    public void getName() {
        System.out.println("Il suo nome è " +name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getWeight() {
        System.out.println("Il suo peso è " +weight + " Kg");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public static Animal createCarnivorusAnimal(String name,int weight){
        return new Animal(name, weight) {
        };
    }
}
