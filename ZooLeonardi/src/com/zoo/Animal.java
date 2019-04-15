package com.zoo;

public class Animal {
    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "" + this.getClass().getSimpleName();
    }

    /*@Override
    public boolean equals(Object obj){
        Animal a= (Animal)obj;
        //return this.name().equals(a.getName()) && this.getClass().getSimpleName()==a.getClass().getSimpleName());

    }*/
}
