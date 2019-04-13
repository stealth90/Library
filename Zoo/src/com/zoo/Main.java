package com.zoo;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Zoo animalList = new Zoo("Zoopolis",1);

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstruction();
        while(!quit){
            System.out.println("Cosa vuoi fare?");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    zoo.printAnimalList();
                    break;
                case 2:
                    addAnimal();
                    break;
                case 3:
                    removeAnimal();
                    break;
                case 4:
                    searchForName();
                    break;
                case 5:
                    quit=true;
                    break;
                default:
                    System.out.println("Inserisci un valore corretto");
                    break;
            }
        }

    }
    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print the list of animal");
        System.out.println("\t 2 - To add an animal in the zoo");
        System.out.println("\t 3 - To remove an animal from the zoo");
        System.out.println("\t 4 - To search an animal by the name");
        System.out.println("\t 5 - To quit the application");
    }

    public static void addAnimal(){
        System.out.println("Please enter the animal: ");
        animalList.addAnimalList(scanner.nextLine());
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(animalList.getAnimalList());

        ArrayList<String> nextArray = new ArrayList<String>(animalList.getAnimalList());
        String[] myArray = new String[animalList.getAnimalList().size];
        myArray= animalList.getAnimalList().toArray(myArray);
    }
}
