import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in ascending order.
 * Elements of the sequence must go one after another.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Example
 *
 * The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5.
 * It includes the following elements: 1 2 3 5 7.
 * Sample Input 1:
 * 10
 * 1 2 4 1 2 3 5 7 4 3
 * Sample Output 1:
 * 5
 */
public class TheLongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int theLongest = 0;
        int[] array = new int[len];
        array[0] = scanner.nextInt();
        int tmp = 1;
        for (int i = 1; i < len; i++){
            array[i] = scanner.nextInt();
            if(array[i-1] < array[i]){
                tmp++;
            }else {
                if (tmp > theLongest){theLongest = tmp;}
                tmp = 1;
            }
        }
        if (tmp > theLongest){theLongest = tmp;}
        System.out.println(theLongest);
    }
}
