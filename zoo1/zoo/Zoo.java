package zoo;

import java.util.ArrayList;

public class Zoo {

    public ArrayList animals = new ArrayList();
    private int maxAnimal = 30;

    public void addNewAnimal(Animale animal){
        if(animals.size()!=this.maxAnimal)
        this.animals.add(animal);
    }

    public void deleteAnimalByName(Animale animal){
        for(int i=0;i< animals.size();i++)
        if(animals.get(i).equals(animal))
            animals.remove(i);

    }


    public int quantityFood(){
        int quantity = 0;
        for(int i=0;i< animals.size();i++) {
            if (animals.get(i) instanceof Carnivori)
                quantity += ((Carnivori) animals.get(i)).carne();
            else if(animals.get(i) instanceof Erbivori)
                quantity += ((Erbivori) animals.get(i)).verdura();
            else
                quantity += ((Onnivori) animals.get(i)).carneVerdura();
        }
        return quantity;
    }

    public void printName(){
        for(int i=0;i< animals.size();i++) {
            if (animals.get(i) instanceof Carnivori)
                System.out.println(((Carnivori)animals.get(i)).name);
            else if(animals.get(i) instanceof Erbivori)
                System.out.println(((Erbivori)animals.get(i)).name);
            else
                System.out.println(((Onnivori)animals.get(i)).name);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animali=" + animals +
                '}';
    }
}
