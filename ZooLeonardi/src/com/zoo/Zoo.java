package com.zoo;

import com.zoo.Animal;

import java.util.ArrayList;

public class Zoo {
    private int maxNumberOfAnimals;
    private ArrayList<Animal> animals;

    public Zoo(int maxNumberOfAnimals){
        this.maxNumberOfAnimals=maxNumberOfAnimals;
        this.animals= new ArrayList<>();

    }

    public boolean addAnimal(Animal a){
        if (this.animals.size() ==this.maxNumberOfAnimals){
            return false;
        }
        this.animals.add(a);
        return true;
    }

    public boolean removeAnimal(String name, String type){
        for(int i=0; i<animals.size();i++){
            Animal a = animals.get(i);
            if(name.equalsIgnoreCase(a.getName())&& type.equalsIgnoreCase(a.getClass().getSimpleName())){
                this.animals.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printInfo(){
        for(int i=0; i<animals.size();i++){
            Animal a = animals.get(i);
            System.out.println(a);
        }
    }

    public void getEatingInfo(){
        double meat=0;
        double vegetable=0;
        for(int i=0; i<animals.size();i++) {
            Animal a = animals.get(i);
            String interfaceName= a.getClass().getInterfaces()[0].getSimpleName();
            switch (interfaceName) {
                case "Carnivorous":
                    //-----Explicit Casting----
                    //Carnivorous c = (Carnivorous)a;
                    //meat+= c.needMeat();
                    meat += ((Carnivorous) a).needMeat();
                    break;
                case "Herbivore":
                    vegetable += ((Herbivore) a).needVegetable();
                    break;
                case "Onnivorous":
                    meat += ((Onnivorous) a).needMeat();
                    vegetable += ((Onnivorous) a).needVegetable();
                    break;
            }
        }
        System.out.println("Vegetable needs "+ vegetable);
        System.out.println("Meat needs " + meat);
    }


}
