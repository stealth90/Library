package com.pubblicazioni;

import java.util.ArrayList;

public class Scaffale {
    private Pubblicazione []scaffale;
    private int numeroPubblicazioni;

    public Scaffale(int n) {
        this.scaffale =  new Pubblicazione[n];
    }

    public Pubblicazione getPubblicazione( int i){
        return this.scaffale[i] ;
    }

    public void setPubblicazione(Pubblicazione pubblicazione , int i){
        this.scaffale[i]=pubblicazione;
        this.numeroPubblicazioni++;
    }

    public int getNumeroPubblicazioni() {
        return numeroPubblicazioni;
    }

    public int ricercaPubblicazione(String autore){
        for(int i=0; i<this.scaffale.length;i++){
            if(this.scaffale[i]==null){
                System.out.println("Scaffale " + i + " vuoto");
            }
            else if(this.scaffale[i].toString(autore).equals(autore)){
                System.out.println("Questo libro è presente nella posizione " + i + " di questo scaffale");
            }
            else {
                System.out.println("Libro non presente in questo scaffale");
            }
        }
        return -1;
    }

    public void listaPubblicazioni() {
        System.out.println("Lista pubblicazioni in scaffale:");
        for (int i = 0; i < this.scaffale.length; i++) {
            if (this.scaffale[i] == null) {
                System.out.println("Non sono presenti pubblicazioni alla posizione " + i);
            } else {
                System.out.println("Alla posizione " + i + " è presente questo libro");
                System.out.println(this.scaffale[i].toString());
                System.out.println();
            }
        }
    }

    public void postiDisponibili(){
        int postiLiberi=0;
        for (int i = 0; i < this.scaffale.length; i++) {
            if(this.scaffale[i]==null){
                postiLiberi++;
            }
        }
        System.out.println("Questo scaffale ha " + postiLiberi + " posti liberi");
    }
}

