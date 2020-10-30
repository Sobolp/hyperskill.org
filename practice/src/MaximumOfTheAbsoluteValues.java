import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Find the maximum absolute value in the array of numbers.
 * <p>
 * Try not to use the for loop, but use Stream API.
 * <p>
 * <p>
 * Sample Input 1:
 * 1 4 7 -2 -5
 * Sample Output 1:
 * 7
 * Sample Input 2:
 * 1 4 7 -2 -8
 * Sample Output 2:
 * 8
 */
public class MaximumOfTheAbsoluteValues {
    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsValue(String[] numbers) {
        // write your code here
        return Arrays.stream(numbers)
                .map(Integer::parseInt)
                .map(Math::abs)
                .max(Comparator.naturalOrder()).orElse(0);

    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxAbsValue(scanner.nextLine().split("\\s+")));
    }
}
