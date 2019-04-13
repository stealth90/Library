package com.zoo;

import java.util.ArrayList;
import java.lang.String;

public class Zoo {
    private String nameOfZoo;
    private int maxAnimals;
    private ArrayList<Animal>myContacts;

    public Zoo(String nameOfZoo,int maxAnimals) {
        this.nameOfZoo=nameOfZoo;
        this.maxAnimals = maxAnimals;
        this.myContacts=new ArrayList<>();
    }

    public void getNameOfZoo() {
        System.out.println("Questo zoo si chiama " +nameOfZoo);
    }

    public void getMaxAnimals() {
        System.out.println("Questo zoo può contenere massimo " + maxAnimals + " animali");
    }

    public boolean addAnimalList(Animal animal){
        if(myContacts.size()>maxAnimals){
            System.out.println("Spiacenti, non possono entrare altri animali.");
        }
        else if(findAnimal(animal.getName())>=0){
            System.out.println("Aniaml is already on zoo");
            return false;
        }
        myContacts.add(animal);
        return true;
    }

    private int findAnimal(Animal animal){
        return this.myContacts.indexOf(animal);
    }

    private int findAnimal(String nameAnimal){

    }


    public void printAnimalList(){
        System.out.println("Hai inserito " + animalList.size() + " animali nel tuo zoo");
        for(int i=0; i<animalList.size(); i++){
            System.out.println((i+1) + "." + animalList.get(i));
        }
    }

    public void removeAnimalList(){

    }
    public String findNameAnimal(Animal searchAnimal){
       // boolean exists= animalList.contains(searchAnimal);
        int position = animalList.indexOf(searchAnimal);
        if(position>=0){
            return animalList.get(position);
        }
        return null;
    }
    public ArrayList<String> getAnimalList(){
        return animalList;
    }
}
