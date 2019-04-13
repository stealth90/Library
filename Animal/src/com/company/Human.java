package com.company;

public class Human extends Bipede {
    public Human(String s){super(s); bark="speak";}
    public String move(){return "walking on 2 legs";}
    public String whoAre(){return "a homo sapiens";}
    public String live(){return "in a condominum";}
}
