package com.pubblications;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean exit = false;
        Library library = new Library();
        printMenu();
        while (!exit) {
            System.out.println("Do your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            int number=0;

            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    System.out.println("Insert new shelf");
                    System.out.print("ID: ");
                    int id= scanner.nextInt();
                    System.out.println("Insert number of shelfs");
                    number= scanner.nextInt();
                    System.out.println(library.addShelf(id,number));
                    break;

                case 2:
                    System.out.println("Insert title of book");
                    String title= scanner.nextLine();
                    System.out.println("Insert author of book");
                    String author= scanner.nextLine();
                    System.out.println("Insert number of pages of the book");
                    double price=scanner.nextDouble();
                    Pubblication publication = new Pubblication(title,author,price);

                    System.out.println("Id book?");
                    int idBook=scanner.nextInt();
                    System.out.println("Position?");
                    int position=scanner.nextInt();
                    System.out.println(library.addBook(idBook,publication,position));
                    break;

                case 3:
                    library.printList();
                    break;

                case 4:
                    System.out.println("Insert author name");
                    String nameAuthor=scanner.nextLine();
                    library.searchForAuthor(nameAuthor);
                    break;

                case 5:
                    //verificaDisponibilita();
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Scelta errata, inserisci una scelta tra quelle date");
                    break;

            }
        }
    }

    public static void printMenu(){
        System.out.println("\nPress");
        System.out.println("\t 0 - Print menù");
        System.out.println("\t 1 - Add new shelf");
        System.out.println("\t 2 - Add new book");
        System.out.println("\t 3 - Print all books");
        System.out.println("\t 4 - Search book from author");
        System.out.println("\t 5 - Ceck position");
        System.out.println("\t 6 - Exit");
    }

}
