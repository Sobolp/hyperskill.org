import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Implement a method called pow2 that takes a collection of numbers and returns a collection of squares of these numbers.
 *
 * Do not modify elements of the given collection, create a new one and return it as the result instead.
 *
 *  Report a typo
 * Sample Input 1:
 * 10 20 -5
 * Sample Output 1:
 * 100 400 25
 */
class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here
        return numbers.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
    }
}

/* Please, do not modify this I/O code */
public class SquaresList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
