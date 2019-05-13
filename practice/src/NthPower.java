import java.util.Scanner;

/**
 * It is possible to find a n-th power much quicker than by making n multiplications!
 * <p>
 * To do this you need to use the following recurrence relations:
 * <p>
 * a^n = (a^2)^(n/2) for even n,
 * <p>
 * a^n = a * a^(n-1) for odd n.
 * <p>
 * Implement the algorithm of quick exponentiating using a recursion method.
 * <p>
 * Sample Input 1:
 * 2.0
 * 1
 * Sample Output 1:
 * 2.0
 * Sample Input 2:
 * 1.5
 * 10
 * Sample Output 2:
 * 57.665
 */
public class NthPower {
    public static double pow(double a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return pow(a, n - 1) * a;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}
