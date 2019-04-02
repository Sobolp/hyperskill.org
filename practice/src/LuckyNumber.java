import java.util.Scanner;

public class LuckyNumber {
    /**
     * Given the number N with an even number of digits.
     * If the sum of the first half of the digits equals the sum of the second half of the digits,
     * then this number is considered lucky. For a given number,
     * output "YES" if this number is lucky, otherwise output "NO".
     * Sample Input 1:
     * 12344321
     * Sample Output 1:
     * YES
     * Sample Input 2:
     * 125322
     * Sample Output 2:
     * NO
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < string.length() / 2; i++) {
            sum1 += (int) string.charAt(i);
            sum2 += (int) string.charAt(string.length() - 1 - i);
        }
        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
