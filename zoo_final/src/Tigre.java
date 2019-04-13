

public class Tigre extends Carnivori{

    public Tigre(String  name){
        super(name);
    }

    public Tigre(String  name, int weight){
        super(name,weight);
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
