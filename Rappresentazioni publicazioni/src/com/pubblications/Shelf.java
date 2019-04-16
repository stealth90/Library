package com.pubblications;

public class Shelf {
    private Pubblication []shelf;
    private Pubblication pubblication;
    private int numberOfPubblications;
    private String title;
    private int id;

    public Shelf(int id, int numberOfPubblications) {
        this.shelf=  new Pubblication[numberOfPubblications];
        this.id=id;
    }

    public Pubblication getShelf(int position){
        if(this.shelf[position]!=null){
            return shelf[position];
        }
        return null ;
    }

    public void setShelf(Pubblication pubblication , int position){
        if(this.shelf[position]!=null){
            this.shelf[position]=null;
        }
        else
        this.shelf[position]=pubblication;
    }

    public int getNumberOfPubblications() {
        return numberOfPubblications;
    }

    public int searchPubblication(String title){
        for(int i=0; i<this.shelf.length;i++){
            if(this.shelf[i]==null){
                System.out.println(i + " empty");
            }
            else if(this.shelf[i].getTitle().equalsIgnoreCase(title)){
                System.out.println( i );
            }
            else {
                System.out.println("Not exist");
            }
        }
        return -1;
    }

    public void listPubblications() {
        System.out.println("Lista pubblications in shelf:");
        for (int i = 0; i < this.shelf.length; i++) {
            if (this.shelf[i] == null) {
                System.out.println("Non sono presenti pubblications alla posizione " + i);
            } else {
                System.out.println("Alla posizione " + i + " è presente questo libro");
                System.out.println(this.shelf[i].toString());
                System.out.println();
            }
        }
    }

    public int getId(){
        return id;
    }

}

