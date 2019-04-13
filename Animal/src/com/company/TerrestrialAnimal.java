package com.company;

public abstract class TerrestrialAnimal extends Animal {
    public TerrestrialAnimal(String s) {
        super(s);
    }
    public String live(){return "in the earthquake";}
    public String whoAre(){ return " an terrestrial animal";}
}
