import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * <p>
 * It will be passed as an argument to the collect() method of a stream as shown below.
 * <p>
 * List<Integer> numbers = ...
 * long val = numbers.stream().collect(...your_collector_will_be_passed_here...);
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...).
 * <p>
 * <p>
 * Sample Input 1:
 * 0 1 2 3
 * Sample Output 1:
 * 0
 * Sample Input 2:
 * 1 2
 * Sample Output 2:
 * 4
 */
public class TheProductOfSquares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String val : values) {
            numbers.add(Integer.parseInt(val));
        }

        long val = numbers.stream().collect(
                Collectors.reducing(1, (r, v) -> r * v * v)
        );

        System.out.println(val);
    }

}
