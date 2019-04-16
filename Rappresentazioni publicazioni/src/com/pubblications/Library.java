package com.pubblications;

import java.util.ArrayList;

public class Library {
    private ArrayList<Shelf> shelfs= new ArrayList<>();
    private Pubblication pubblication;
    private int id=0;
    private int position;



    public boolean addShelf(int id, int numberOfShelf) {
        Shelf shelfs = new Shelf(id,numberOfShelf);
        this.shelfs.add(shelfs);
        return true;
    }

    public boolean addBook(int id, Pubblication pubblication, int position){
        for(int i=0; i<shelfs.size();i++){
            if(shelfs.get(i).getId()==id){
                shelfs.get(i).setShelf(pubblication,position);
                return true;
            }
        }
        System.out.println("Impossible to add book, ID is incongruent");
        return false;
    }

    public void printList(){
        for(int i=0;i< shelfs.size();i++){
            shelfs.get(i).listPubblications();
        }
    }

    public void searchForAuthor(String author){
        for(int i=0; i<shelfs.size();i++){
            for(int j=0;j<shelfs.get(i).getNumberOfPubblications();j++){
                if(this.shelfs.get(i).getShelf(j).getAuthor().equalsIgnoreCase(author))
                    this.shelfs.get(i).getShelf(j).toString();
            }
        }
    }

    public int ceckPosition(){
        int count=0;
        for(int i=0; i<shelfs.size();i++){
            for(int j=0; j<shelfs.get(i).getNumberOfPubblications();j++){
                if(this.shelfs.get(i).getShelf(j).equals(null)){
                    count++;
                }
            }
        }
        return count;
    }
}

