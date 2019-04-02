import java.util.Scanner;

public class ArithmeticAverage {
    /**
     * Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console
     * the arithmetic average of all numbers from the interval [a;b], which are divisible by 3.
     * In the example below, the arithmetic average is calculated for the numbers on the interval [−5;12].
     * Total numbers divisible by 3 on this interval −3,0,3,6,9,12. Their arithmetic average equals to 4.5
     * The program input contains intervals, which always contain at least one number, which is divisible by 3.
     * <p>
     * Sample Input 1:
     * -5
     * 12
     * Sample Output 1:
     * 4.5
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println((double) sum / count);

    }
}
