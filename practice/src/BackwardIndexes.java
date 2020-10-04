import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *  Implement a method that returns an element by the specified index from a list.
 *  The method must return an element by its regular or backward index.
 *
 * In the regular order, elements have indexes 0, 1, 2, ..., n – 1.
 * In the backward order, the same elements have indexes -n, -n + 1, ..., -2, -1; where n is the size of a list.
 *
 * If the specified index is out of bounds, the method must throw the standard IndexOutOfBoundsException.
 *
 * Example. The input list consists of four elements: [100 202 300 401].
 * If the specified index is 0, the method should return 100;
 * if the specified index is -1 the method should return 401;
 * if the specified index is -2, the method should return 300.
 *
 *  Report a typo
 * Sample Input 1:
 * 100 202 300 401
 * 0
 * Sample Output 1:
 * 100
 * Sample Input 2:
 * 100 202 300 401
 * -1
 * Sample Output 2:
 * 401
 * Sample Input 3:
 * 100 202 300 401
 * -2
 * Sample Output 3:
 * 300
 */
public class BackwardIndexes {

    public static <T> T getElementByIndex(List<T> lst, int index) {
        // write your code here
        return lst.get(index >= 0 ? index : lst.size() + index);
    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}
