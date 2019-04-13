package com.company;

public class Player extends Person{
    private static String role;
    private int numberUniform;
    public Player(String name, String surname,String role, int numberUniform){
        super(name,surname);
        this.role=role;
        this.numberUniform=numberUniform;
    }

    public static String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public int getNumberUniform() {
        return numberUniform;
    }

    public void setNumberUniform(int numberUniform) {
        this.numberUniform = numberUniform;
    }
}
