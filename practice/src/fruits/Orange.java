package fruits;

public class Orange extends Fruit implements Comparable<Orange> {

    public Orange(int weight) {
        super(weight);
    }

    @Override
    public int compareTo(Orange other) {
        return Integer.compare(this.getWeigth(), other.getWeigth());
    }
}