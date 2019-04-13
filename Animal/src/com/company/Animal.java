package com.company;

public abstract class Animal {
    private String name;
    protected String bark;
    public Animal(String s){
        name=s;
    }
    public abstract String move();
    public abstract String live();
    public abstract String whoAre();
    public void show(){
        System.out.println(name + " is " + whoAre() + ", " + bark + ", " + move() + " and live " + live() );
    }
}
