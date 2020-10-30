import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

/**
 * You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers.
 * Implement a method that returns the third stream that contains sorted numbers
 * from both streams which are divisible by 3 and 5 without the first two numbers.
 *
 * You need return a prepared IntStream from a template method, not a list of integers.
 * Pay attention to the method template. Do not change the signature of this method.
 *
 * Sample Input 1:
 * 1 2 3 4
 * Sample Output 1:
 * []
 * Sample Input 2:
 * 30 75 60 90
 * Sample Output 2:
 * [75, 90]
 */
class EvenAndOddFilter {

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)
                .sorted()
                .filter(n -> n % 3 == 0)
                .filter(n -> n % 5 == 0)
                .skip(2);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(values)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(x -> x)
                .toArray();

        int[] oddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(x -> x)
                .toArray();

        IntStream filteringStream = createFilteringStream(
                Arrays.stream(evenNumbers),
                Arrays.stream(oddNumbers));

        System.out.println(filteringStream.boxed().collect(Collectors.toList()));
    }
}