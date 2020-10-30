import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * You need to implement the isPrime method to check whether the input number is prime or not.
 *
 * It's guaranteed that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....). Use the provided template for your method.
 *
 * A prime number is a value greater than 1 that has no positive divisors other than 1 and itself. More details are here.
 * This problem has a simple and clear solution with streams. Please, do not use loops.
 *
 *  Report a typo
 * Sample Input 1:
 * 2
 * Sample Output 1:
 * True
 * Sample Input 2:
 * 3
 * Sample Output 2:
 * True
 * Sample Input 3:
 * 4
 * Sample Output 3:
 * False
 */
public class CheckIfANumberIsPrime {
    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        // write your code here
        return LongStream.rangeClosed(2L, number / 2).noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}
