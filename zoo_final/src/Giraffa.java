

public class Giraffa extends Erbivori{

    public Giraffa(String  name){
        super(name);
    }

    public Giraffa(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Giraffa{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
