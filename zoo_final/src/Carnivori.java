

public class Carnivori extends Animale{

    public Carnivori(String  name){
        super(name);
    }

    public Carnivori(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Carnivori{}";
    }

    public int carne(){
        int quantity=0;
        quantity= this.weight/3;
        return quantity;
    }
}
