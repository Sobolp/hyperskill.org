package fruits;

public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(int weight) {
        super(weight);
    }

    @Override
    public int compareTo(Apple other) {
        return Integer.compare(this.getWeigth(), other.getWeigth());
    }
}