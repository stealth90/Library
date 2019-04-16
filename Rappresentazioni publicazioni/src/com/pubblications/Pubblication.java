package com.pubblications;

public class Pubblication {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Pubblication(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price=price;
        this.pages = (int)(price /0.10);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
        this.price=pages * 0.10;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.pages =(int)(price/0.10);
    }

    public String toString(){
        return "AUTORE: " + this.author + "\nTITOLO: " +
                this.title + "\nPAGINE: " +
                this.pages + "\nCOSTO: " +
                this.price + " €.";

    }
}
