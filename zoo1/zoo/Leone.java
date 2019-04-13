package zoo;

public class Leone extends Carnivori{

    public Leone(String  name) {
        super(name);
    }

    public Leone(String  name, int weight){
        super(name,weight);
    }



    @Override
    public String toString() {
        return "Leone{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
