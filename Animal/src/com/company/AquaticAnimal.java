package com.company;

public abstract class AquaticAnimal extends Animal {
    public AquaticAnimal(String s) {
        super(s);}
        public String live(){return "in the water";}
        public String whoAre(){return "a water animal";}
}
