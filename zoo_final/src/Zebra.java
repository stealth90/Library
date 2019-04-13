
public class Zebra extends Erbivori{

    public Zebra(String  name){
        super(name);
    }

    public Zebra(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
