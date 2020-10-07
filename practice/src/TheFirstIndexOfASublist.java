import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a program that reads two sequences of numbers and outputs the starting
 * positions of the first and the last occurrences of the second sequence within the first one,
 * or -1 if there is no such occurrence. Numbers must be separated by a space.
 * <p>
 * Report a typo
 * Sample Input 1:
 * 2 1 2 3 4 1 2 3
 * 1 2 3
 * Sample Output 1:
 * 1 5
 * Sample Input 2:
 * 77 2 4 112 3
 * 104
 * Sample Output 2:
 * -1 -1
 * Sample Input 3:
 * 1
 * 1
 * Sample Output 3:
 * 0 0
 */

public class TheFirstIndexOfASublist {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<String> list1 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        final List<String> list2 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        System.out.printf("%d %d"
                , Collections.indexOfSubList(list1, list2)
                , Collections.lastIndexOfSubList(list1, list2));
    }
}
