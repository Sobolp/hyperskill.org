import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.abs;

/**
 * Write a program that finds out the closest integer to a given one from an array.
 * If you find several integers with the same distance to the N, you should output all of them in the ascending order.
 * If there are several equal numbers, output them all.
 * <p>
 * Input: a set of integers and a number N.
 * <p>
 * Output: some number(s) from the given array.
 * <p>
 * Report a typo
 * Sample Input 1:
 * 1 2 4 5
 * 3
 * Sample Output 1:
 * 2 4
 * Sample Input 2:
 * 1 2 3 4
 * 6
 * Sample Output 2:
 * 4
 * Sample Input 3:
 * 5 1 3 3 1 5
 * 4
 * Sample Output 3:
 * 3 3 5 5
 */
public class FindTheNearestNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (String s : line.split(" ")) {
            list.add(Integer.valueOf(s));
        }
        int n = scanner.nextInt();
        Collections.sort(list);
//        System.out.println(list);
        Integer delta = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (abs(i - n) < delta ) {
                result.clear();
                result.add(i);
                delta = abs(i - n);
            }else if ( abs(i - n) == delta) {
                result.add(i);
            }
        }
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
