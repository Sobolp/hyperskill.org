import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement a method for sorting a given array of integers in the ascending order.
 * You can use any algorithm for sorting it.
 *
 * Sample Input 1:
 * 3 1 2 3 1 2
 * Sample Output 1:
 * 1 2 3
 */
public class SortingNumbers {
    public static void sort(int[] numbers) {
        // write your code here
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j<numbers.length; j++) {
                if (numbers[j] < numbers[i]){
                    int tmpEl = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmpEl;
                }
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
