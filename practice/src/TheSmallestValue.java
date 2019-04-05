import java.util.Scanner;

/**
 * A user inputs a long number M. You need to find out what is the smallest long number n such that n! > M.
 *
 * Just in case: wiki on factorials.
 *
 * Sample Input 1:
 * 6188989133
 * Sample Output 1:
 * 13
 */
public class TheSmallestValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long m = scan.nextLong();
        int n = 1;
        long fact = 1;
        while (fact <= m) {
            n++;
            fact *=n;
        }
        System.out.print(n);
    }
}
