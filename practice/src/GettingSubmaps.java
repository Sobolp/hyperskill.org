import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a program that reads key-value pairs and outputs pairs whose keys belong to the specified range (inclusive)
 * in the ascending order by the key.
 * <p>
 * Input data format
 * <p>
 * The first line contains two values that represent range borders.
 * The second line contains the number of key-value pairs.
 * Next lines contain pair (an integer key and a string value separated by a space).
 * <p>
 * Output data format
 * <p>
 * All pairs whose keys belong to the range, each pair in a new line.
 * The key and the value of a pair must be separated by a space.
 * <p>
 * Report a typo
 * Sample Input 1:
 * 2 4
 * 5
 * 1 aa
 * 5 ee
 * 2 bb
 * 4 dd
 * 3 cc
 * Sample Output 1:
 * 2 bb
 * 3 cc
 * 4 dd
 */
public class GettingSubmaps {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        final int fromKey = scanner.nextInt();
//        final int toKey = scanner.nextInt();
//        final int n = scanner.nextInt();
//        scanner.nextLine();
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String[] entry = scanner.nextLine().split("\\s+");
//            map.put(Integer.parseInt(entry[0]), entry[1]);
//        }
//        for (int key : map.keySet()) {
//            if (key >= fromKey && key <= toKey) {
//                System.out.println(key + " " + map.get(key));
//            }
//        }
//    }
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int lines = scanner.nextInt();

        var map = new java.util.TreeMap<Integer, String>();
        while (lines-- > 0) {
            map.put(scanner.nextInt(), scanner.next());
        }
        map.subMap(from, true, to, true).forEach((k, v) -> System.out.println(k + " " + v));
    }
}
