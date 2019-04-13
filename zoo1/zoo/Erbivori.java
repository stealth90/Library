package zoo;

public class Erbivori extends Animale {

    public Erbivori(String  name){
        super(name);
    }

    public Erbivori(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Erbivori{}";
    }

    public int verdura(){
        int quantity=0;
        quantity= this.weight/2;
        return quantity;
    }
}
