
import java.util.Objects;

public class Animale {
    public String name;
    public int weight;

    public Animale(String name){
        this.name = name;
    }

    public Animale(String  name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animale{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animale animale = (Animale) o;
        return Objects.equals(name, animale.name);
    }

}
