import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Implement a method for splitting (partitioning) a generic list into sublists.
 * The method takes two arguments: a generic list and a size of sublists.
 * The specified size of sublists can be greater than the size of the given list.
 *
 * Each sublist except the last one must have the specified size.
 * The last sublist can have a smaller number of elements.
 *
 * Example 1
 *
 * the input list: [1, 2, 3, 4, 5, 6, 7]
 * the specified size of sublists: 4
 * the expected result: [[1, 2, 3, 4], [5, 6, 7]]
 * Example 2
 *
 * the input list: [7, 4, 3, 2, 8, 1]
 * the specified size of sublists: 8
 * the expected result: [[7, 4, 3, 2, 8, 1]]
 * Example 3
 *
 * the input list: [10, 12, 12, 13, 13, 45, 12, 19, 34, 12, 588, 12, 34, 12]
 * the specified size of sublists: 5
 * the expected result: [[10, 12, 12, 13, 13], [45, 12, 19, 34, 12], [588, 12, 34, 12]]
 */
public class SplitAListIntoSublists {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}
class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();
        int prevInd = 0;
        for (int i = subListSize; i < list.size(); i += subListSize) {
            sublists.add(list.subList(prevInd, i));
            prevInd = i;
        }
        if (prevInd != list.size()) {
            sublists.add(list.subList(prevInd, list.size()));
        }

        return sublists;
    }
}
