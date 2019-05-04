import fruits.Apple;
import fruits.Orange;

/**
 * There are different points of view on "Apples and Oranges" problem.
 * You are provided with an implementation that allows comparison of apples with oranges,
 * the task is to redesign type system and implementation in a classical way that prohibits comparison of Oranges and Apples.
 *
 * Following requirements exist:
 *
 * Comparison of Apples with Apples and Oranges with Oranges should be allowed
 * Comparison of Apples with Oranges and Oranges with Apples should be restricted at a compile time
 * Class hierarchy should be preserved
 * Fruits comparison doesn't matter, you may disable it
 * Solution should not raise compile-time warnings (e.g. "raw types")
 */
public class Practice58949 {

    public static void main(String[] args) {
        Apple apple1 = new Apple(2);
        Apple apple2 = new Apple(3);
        Orange orange1 = new Orange(5);
        Orange orange2 = new Orange(10);

//        System.out.println(apple1.compareTo(orange1)); now it is compile error
        orange1.compareTo(orange1);
    }
}
