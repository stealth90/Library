package com.company;

public abstract class MarineAnimal extends AquaticAnimal {
    public MarineAnimal(String s) {
        super(s);
    }
    public String live(){return "at sea";}
    public String whoAre(){return "a marine animal";}
}
