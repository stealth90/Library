package zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        int choice,choice2;
        String name;
        int weight;
        Leone lion;
        Tigre tiger;
        Zebra zebra;
        Giraffa giraffe;
        Scimmia monkey;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("---------------Zoo---------------");
            System.out.println("1-Inserisci un animale");
            System.out.println("2-Rimuovi un animale");
            System.out.println("3-Stampa quantità cibo");
            System.out.println("4-Stampa nomi  di tutti li animali");
            choice =  input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Che tipo di animale vuoi inserire\n1-Leone\t\t2-Tigre\n3-Giraffa\t4-Zebra\n5-Scimmia");
                    choice2 = input.nextInt();
                    System.out.println("Inserisci nome");
                    name = input.next();
                    System.out.println("Inserisci peso");
                    weight = input.nextInt();
                    if(choice2 == 1) {
                        lion = new Leone(name, weight);
                        zoo.addNewAnimal(lion);
                    }
                    else if(choice2 == 2) {
                        tiger = new Tigre(name, weight);
                        zoo.addNewAnimal(tiger);
                    }
                    else if(choice2 == 3) {
                        giraffe = new Giraffa(name, weight);
                        zoo.addNewAnimal(giraffe);
                    }
                    else if(choice2 == 4) {
                        zebra = new Zebra(name, weight);
                        zoo.addNewAnimal(zebra);
                    }
                    else {
                        monkey = new Scimmia(name, weight);
                        zoo.addNewAnimal(monkey);
                    }
                    break;

                case 2:
                    System.out.println("Che tipo di animale vuoi inserire\n1-Leone\t\t2-Tigre\n3-Giraffa\t4-Zebra\n5-Scimmia");
                    choice2 = input.nextInt();
                    System.out.println("Inserisci nome");
                    name = input.next();
                    if(choice2 == 1) {
                        lion = new Leone(name);
                        zoo.deleteAnimalByName(lion);
                    }
                    else if(choice2 == 2) {
                        tiger = new Tigre(name);
                        zoo.deleteAnimalByName(tiger);
                    }
                    else if(choice2 == 3) {
                        giraffe = new Giraffa(name);
                        zoo.deleteAnimalByName(giraffe);
                    }
                    else if(choice2 == 4) {
                        zebra = new Zebra(name);
                        zoo.deleteAnimalByName(zebra);
                    }
                    else {
                        monkey = new Scimmia(name);
                        zoo.deleteAnimalByName(monkey);
                    }
                    break;
                case 3:
                    System.out.println(zoo.quantityFood());
                    break;
                case 4:
                    zoo.printName();
                    break;
                case 5:
                    System.out.println(zoo);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Errore! Riprova");
            }
        }while(choice!=0);
    }
}
