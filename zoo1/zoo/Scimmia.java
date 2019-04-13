package zoo;

public class Scimmia extends Onnivori{

    public Scimmia(String  name){
        super(name);
    }

    public Scimmia(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Scimmia{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
