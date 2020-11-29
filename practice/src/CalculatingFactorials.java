import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Many java developers wrote methods to calculate a factorial value using a recursive or iterative algorithm.
 * It's time to do it with streams.
 *
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive).
 * The factorial of 0 is equal to 1.
 *
 * Important. Use the given template for your factorial method.
 * Pay attention to type of an argument and the returned value.
 * Please, don't use cycles or recursion.
 *
 * Sample Input 1:
 * 0
 * Sample Output 1:
 * 1
 * Sample Input 2:
 * 1
 * Sample Output 2:
 * 1
 * Sample Input 3:
 * 2
 * Sample Output 3:
 * 2
 */
public class CalculatingFactorials {
    /**
     * Calculates the factorial of the given number n
     *
     * @param n >= 0
     *
     * @return factorial value
     */
    public static long factorial(long n) {
        return LongStream.range(1, n + 1).reduce(1, (r, v) -> r * v);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine().trim());

        System.out.println(factorial(n));
    }
}
