import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfMaxInArray {

    public static int findIndexOfMaxInArray(int[] array, boolean findFirst) {
        // write your code here
        int result = 0;
        int maxVal = array[0];

        for (int i = 1; i < array.length; i++) {
            if (findFirst) {
                if (array[i] > maxVal) {
                    result = i;
                    maxVal = array[i];
                }
            } else {
                if (array[i] >= maxVal) {
                    result = i;
                    maxVal = array[i];
                }
            }
        }
        return result;
    }

    public static int findIndexOfMaxInArray(int[] array) {
        // write your code here
        return findIndexOfMaxInArray(array,true);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstMax = findIndexOfMaxInArray(numbers);
        int lastMax = findIndexOfMaxInArray(numbers, false);
        System.out.println(firstMax + " " + lastMax);
    }
}