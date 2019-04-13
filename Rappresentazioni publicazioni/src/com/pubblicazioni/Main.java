package com.pubblicazioni;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static int numeroLibri;
    static int numeroScaffali;
    static Scaffale scaffale;
    static Biblioteca biblioteca;
    static Pubblicazione pubblicazione;

    public static void main(String[] args) {
        int scelta = 0;
        int numeroScaffali=0;
        boolean esci = false;
        Pubblicazione pubblicazione;
        stampaMenu();
        while (!esci) {
            System.out.println("Cosa vuoi fare?");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 0:
                    stampaMenu();
                    break;
                case 1:
                    System.out.println("Quanti scaffali aggiungere alla biblioteca?");
                    numeroScaffali=scanner.nextInt();
                    biblioteca = new Biblioteca(numeroScaffali);
                    for(int i =0; i<numeroScaffali;i++){
                        System.out.println("Quanti libri può contentere il "+ (i+1)+ "° scaffale");
                        numeroLibri=scanner.nextInt();
                        scaffale= new Scaffale(numeroLibri);
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del libro");
                    String titolo= scanner.nextLine();
                    System.out.println("Inserisci l'autore del libro");
                    String autore= scanner.nextLine();
                    System.out.println("Inserisci quante pagine ha il libro");
                    int pagine=scanner.nextInt();
                    Pubblicazione publicazione = new Pubblicazione(titolo,autore,pagine);
                    break;

                case 3:
                    scaffale.listaPubblicazioni();
                    break;

                case 4:
                    //ricercaLibri();
                    break;

                case 5:
                    //verificaDisponibilita();
                    break;

                case 6:
                    esci = true;
                    break;

                default:
                    System.out.println("Scelta errata, inserisci una scelta tra quelle date");
                    break;

            }
        }
    }

    public static void stampaMenu(){
        System.out.println("\nPress");
        System.out.println("\t 0 - Stampa il menu");
        System.out.println("\t 1 - Crea Biblioteca");
        System.out.println("\t 2 - Inserisci un nuovo libro");
        System.out.println("\t 3 - Stampa i libri presenti");
        System.out.println("\t 4 - Ricerca i libri dato l'autore");
        System.out.println("\t 5 - Verifica disponibilità posti biblioteca");
        System.out.println("\t 6 - Esci");
    }

}
