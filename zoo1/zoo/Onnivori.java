package zoo;

public class Onnivori extends Animale{

    public Onnivori(String  name){
        super(name);
    }

    public Onnivori(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Onnivori{}";
    }

    public int carneVerdura(){
        int quantity=0;
        quantity= this.weight/3;
        return quantity;
    }

}
