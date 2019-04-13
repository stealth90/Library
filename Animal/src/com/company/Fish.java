package com.company;

public class Fish extends MarineAnimal{
    public Fish(String s){super(s); bark="don't bark";}
    public String whoAre(){return "a fish(from sea)";}
    public String move(){ return "swimming";}
}
