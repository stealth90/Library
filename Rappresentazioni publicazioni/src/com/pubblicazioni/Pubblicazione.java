package com.pubblicazioni;

public class Pubblicazione {
    private String titolo;
    private String autore;
    private int pagine;
    private float prezzo;

    public Pubblicazione(String titolo, String autore, int pagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.pagine = pagine;
        this.prezzo = (float)(pagine *0.10);
    }

    public void getTitolo() {
        System.out.println(titolo);
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void getAutore() {
        System.out.println(autore);
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void getPagine() {
        System.out.println("Il numero di pagine è di " + pagine + " pagine");
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
        this.prezzo=(float)(pagine * 0.10);
    }

    public void getPrezzo() {
        System.out.println("Il prezzo di questa copertina è di " + prezzo + " €");
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
        this.pagine =(int)(prezzo/0.10);
    }
    public String toString(){
        return "AUTORE: " + this.autore + "\nTITOLO: " +
                this.titolo + "\nPAGINE: " +
                this.pagine + "\nCOSTO: " +
                this.prezzo + " €.";

    }
    public String toString(String autore){
        return this.autore;
    }
}
